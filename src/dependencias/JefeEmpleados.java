
package dependencias;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 05:16:58 PM
 * @desciption: Esta clase corresponde a 
 *
 */

public class JefeEmpleados implements Empleados {

    public JefeEmpleados() {}
    
    @Override
    public String getTarea(String nombre) {
         return "Mi "+nombre+" y soy JEFE";
    }
}
