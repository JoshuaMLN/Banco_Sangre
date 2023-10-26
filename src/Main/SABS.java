
package Main;

import Controlador.ControladorLogin;
import Datos.Repositorio;
import Modelo.ConsultasAdministrador;
import Modelo.ConsultasUsuarios;
import Vista.frmLogin;

public class SABS {
    public static void main(String[] args) {
        ConsultasUsuarios cU = new ConsultasUsuarios();
        cU.llenar();
        ConsultasAdministrador cA = new ConsultasAdministrador();
        cA.llenar();
        ControladorLogin controlador = new ControladorLogin(new frmLogin(), Repositorio.usuarios, Repositorio.administradores);
        controlador.iniciar();
    }
}
