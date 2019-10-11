
package dependencias;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 05:21:44 PM
 * @desciption: Esta clase corresponde a 
 *
 */

public class DirectorEmpleados implements Empleados{

    public DirectorEmpleados() {}
    @Override
    public String getTarea(String nombre) {
         return "Mi "+nombre+" y soy DIRECTOR";
    }

}
