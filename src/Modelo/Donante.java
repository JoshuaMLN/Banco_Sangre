
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Donante {                  //BD
    private int codigo;                 //id_donante
    private boolean activo;             //activo_donante
    private String nombre;              //nombre_donante
    private String correo;              //correo_donante
    private String DNI;                 //dni_donante
    private String telefono;            //telefono_donante
    private String fechaNac;            //fecha_nac_donante
    private String grupoSanguineo;      //grupo_sanguineo_donante
    private String factorRh;            //factor_rh_donante
    private String fechaCreacion;       //fecha_creacion_donante
    private String fechaModificacion;   //fecha_modificacion_donante
    
    private SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY HH:mm");

    public Donante() {
    }
    
    public Donante(String nombre, String correo, String DNI, String telefono, String fechaNac, String grupoSanguineo, String factorRh) {
        this.codigo = 0;
        this.activo = true;
        this.nombre = nombre;
        this.correo = correo;
        this.DNI = DNI;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
        this.grupoSanguineo = grupoSanguineo;
        this.factorRh = factorRh;
        this.fechaCreacion = sdf.format(new Date());
        this.fechaModificacion = this.fechaCreacion;
    }  

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public boolean getActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDNI() {
        return DNI;
    }
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getFechaNac() {
        return fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }
    
    public String getFactorRh() {
        return factorRh;
    }
    public void setFactorRh(String factorRh) {
        this.factorRh = factorRh;
    }
    
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    public String getFechaModificacion() {
        return fechaModificacion;
    }
    public void setFechaModificacion(String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
}
