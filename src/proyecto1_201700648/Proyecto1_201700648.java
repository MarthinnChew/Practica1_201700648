
package proyecto1_201700648;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
/**
 *
 * @author Marthinn Chew
 */
public class Proyecto1_201700648 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Bienvenida llamada = new Bienvenida();
       llamada.Ventana();//llamo a la ventana
       
       LoginAdmin llamada2 = new LoginAdmin();
       llamada2.LoginAdmin();//llamo a la ventana 
       
       LoginVendedor llamada3 = new LoginVendedor();
       llamada3.LoginVendedor();//llamo a la ventana
       
       RegistrarAdmin llamada4 = new RegistrarAdmin();
       llamada4.RegistrarAdmin();//llamo a la ventana
       
       RegistrarVendedor llamada5 = new RegistrarVendedor();
       llamada5.RegistrarVendedor();//llamo a la ventana
       
       AvisoUsuarioRegistrado llamada6 = new AvisoUsuarioRegistrado();
       llamada6.AvisoUsuarioRegistrado();//llamo a la ventana
       
       AvisoAdminRegistrado llamada7 = new AvisoAdminRegistrado();
       llamada7.AvisoAdminRegistrado();//llamo a la ventana
       
       MenuAdmin llamada8 = new MenuAdmin();
       llamada8.MenuAdmin();//llamo a la ventana
       
       ModuloVentas llamada9 = new ModuloVentas();
       llamada9.ModuloVentas();//llamo a la ventana
       
       ModuloRemitente llamada10 = new ModuloRemitente();
       llamada10.ModuloRemitente();//llamo a la ventana
       
       ModuloBeneficiario llamada11 = new ModuloBeneficiario();
       llamada11.ModuloBeneficiario();//llamo a la ventana
       
       Observador llamada12 = new Observador();
       llamada12.Observador();//llamo a la ventana
    }
    
}

    
     