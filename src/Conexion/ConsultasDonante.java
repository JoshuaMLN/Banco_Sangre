
package Conexion;

import Modelo.*;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class ConsultasDonante extends ConexionBaseDatos{
    
    public static DefaultTableModel tablaDonantes(){
        
        DefaultTableModel tabla = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        tabla.addColumn("Id");
        tabla.addColumn("Nombre");
        tabla.addColumn("Correo");
        tabla.addColumn("DNI");
        tabla.addColumn("Telefono");
        tabla.addColumn("FechaNac");
        tabla.addColumn("GrupoSang");
        tabla.addColumn("Rh");
        
        Connection con=conectar();
        PreparedStatement ps=null;
        String sql="SELECT id_donante, nombre_donante,correo_donante,dni_donante,telefono_donante,"
                    + "fecha_nac_donante, grupo_sanguineo_donante,factor_rh_donante "
                    + "FROM donante WHERE activo_donante = true";
        ResultSet rs;
        
        try {
            ps = con.prepareStatement(sql);
            rs=ps.executeQuery();
            int cantidadColumnas = tabla.getColumnCount();
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                tabla.addRow(filas);
            }  
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        return tabla;
    }
    
    public boolean registrarDonante(Donante donante){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("INSERT INTO donante(activo_donante,nombre_donante,correo_donante,"
                    + "dni_donante,telefono_donante,fecha_nac_donante, grupo_sanguineo_donante,"
                    + "factor_rh_donante, fecha_creacion_donante, fecha_modificacion_donante) VALUES (?,?,?,?,?,?,?,?,?,?)");
        try {
            ps = con.prepareStatement(sql);
            
            ps.setBoolean(1,donante.getActivo());
            ps.setString(2,donante.getNombre());
            ps.setString(3,donante.getCorreo()); 
            ps.setString(4,donante.getDNI());
            ps.setString(5,donante.getTelefono());
            ps.setString(6,donante.getFechaNac());
            ps.setString(7,donante.getGrupoSanguineo());
            ps.setString(8,donante.getFactorRh());
            ps.setString(9,donante.getFechaCreacion());
            ps.setString(10,donante.getFechaModificacion());
            
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public boolean desactivarDonante(int codDonante){
        PreparedStatement ps=null;
        Connection con=conectar();
        String sql = ("UPDATE donante SET activo_donante = false WHERE id_donante = ? ");
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1,codDonante);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally{
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public void comboBoxDonante(DefaultComboBoxModel donantes){
        PreparedStatement ps=null;
        Connection con=conectar();
        ResultSet rs;
        String sql = ("SELECT nombre_donante FROM donante");
        try {
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                donantes.addElement(rs.getString("nombre_donante"));
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
    }
    
    public String[] obtener_correos_registrados(){
        Connection con = conectar();
        PreparedStatement ps = null;
        String sql = "SELECT correo_donante FROM donante";
        ResultSet rs;
        
        ArrayList<String> correosList = new ArrayList<>();
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String correo = rs.getString("correo_donante");
                correosList.add(correo);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            try{
                con.close();
            }catch(SQLException e){
                System.err.println(e);
            }
        }
        String[] correos_registrados = correosList.toArray(String[]::new);

        return correos_registrados;
    }
    
    //Metodo para editar datos de un donante
    public void editaDonate(int codDonante, Donante donante){
        Connection con=conectar();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            String sql = "UPDATE donante set nombre_donante = ?,correo_donante = ?,"
                    + "dni_donante = ?,telefono_donante = ?,fecha_nac_donante = ?, grupo_sanguineo_donante = ?,"
                    + "factor_rh_donante = ?, fecha_modificacion_donante = ? "
                    + "WHERE id_donante=?";
            ps = con.prepareStatement(sql);
            ps.setString(1,donante.getNombre());
            ps.setString(2,donante.getCorreo()); 
            ps.setString(3,donante.getDNI());
            ps.setString(4,donante.getTelefono());
            ps.setString(5,donante.getFechaNac());
            ps.setString(6,donante.getGrupoSanguineo());
            ps.setString(7,donante.getFactorRh());
            ps.setString(8,donante.getFechaModificacion());
            ps.setInt(9, codDonante);
            ps.execute();
        }catch(SQLException e){
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
    
    public Donante buscarDonante(int codDonante){
        Connection con=conectar();
        PreparedStatement ps=null;
        ResultSet rs=null;
        Donante donante = new Donante();
        String sql = "select * from donante where id_donante=?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,codDonante);
            rs = ps.executeQuery();
            while(rs.next()){
                donante.setCodigo(rs.getInt(1));
                donante.setActivo(rs.getBoolean(2));
                donante.setNombre(rs.getString(3));
                donante.setCorreo(rs.getString(4));
                donante.setDNI(rs.getString(5));
                donante.setTelefono(rs.getString(6));
                donante.setFechaNac(rs.getString(7));
                donante.setGrupoSanguineo(rs.getString(8));
                donante.setFactorRh(rs.getString(9));
                donante.setFechaCreacion(rs.getString(10));
                donante.setFechaModificacion(rs.getString(11));
            }
        }catch(SQLException e){
            System.err.println(e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
        return donante;
    }
    
}
