
package Controlador;

import Datos.*;
import Modelo.*;
import Vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorLogin {
    private final frmLogin vista;
    private UsuarioArreglo modelousuario;
    private AdministradorArreglo modeloadministrador;
    
    
    public ControladorLogin(frmLogin vista, UsuarioArreglo modelousuario,AdministradorArreglo modeloadministrador) {
        this.vista = vista;
        this.modelousuario=modelousuario;
        this.modeloadministrador=modeloadministrador;
        
        this.vista.btn_ingresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (validar_campos()){
                    
                    Usuario user = ControladorLogin.this.modelousuario.ingresar(vista.fld_usuario.getText(), vista.fld_contraseña.getText());
                    Administrador admin = ControladorLogin.this.modeloadministrador.ingresar(vista.fld_usuario.getText(), vista.fld_contraseña.getText());
                    
                    switch(validar_credenciales(user,admin)){
                        case "administrador" -> {
                            Repositorio.administrador_validado = admin;
                            lanzar_menu_administrador(admin);
                            break;
                        }
                        case "usuario" -> {
                            Repositorio.usuario_validado = user;
                            lanzar_menu_usuario(user);
                            break;
                        }
                        case "incorrectos" -> {
                            JOptionPane.showMessageDialog(vista, "Usuario y/o contraseña incorrectas");
                            limpiar_campos();
                            break;
                        }
                    }
                }
            }
        });
    }
        
    public boolean validar_campos(){
        String usuario = vista.fld_usuario.getText();
        String contraseña = vista.fld_usuario.getText();
        
        if (usuario.isEmpty()){
            if(contraseña.isEmpty()){
                JOptionPane.showMessageDialog(vista, "Ingrese un usuario y contraseña");
            }
            else{
                JOptionPane.showMessageDialog(vista, "Ingrese un usuario");
            }
            return false;
        }
        else if(contraseña.isEmpty()){
            JOptionPane.showMessageDialog(vista, "Ingrese una contraseña");
            return false;
        }
        return true;
    }
    
    public String validar_credenciales(Usuario user, Administrador admin){
        if(admin != null){
            return "administrador";
        }else if(user != null){
            return "usuario";
        }else{
            return "incorrectos";
        }
    }
    
    public void lanzar_menu_administrador(Administrador admin){
        ControladorPrincipalAdmin controladoradmin = new ControladorPrincipalAdmin( admin, new frmPrincipalAdmin() );
        controladoradmin.iniciar();
        vista.dispose();
    }
    
    public void lanzar_menu_usuario(Usuario user){
        ControladorPrincipalUser controladoruser = new ControladorPrincipalUser(new frmPrincipalUser(), user);
        controladoruser.iniciar();
        vista.dispose();
    }
    
    public void limpiar_campos(){
        this.vista.fld_usuario.setText("");
        this.vista.fld_contraseña.setText("");
    }
    
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        limpiar_campos();
        this.vista.setVisible(true);
    }
}
