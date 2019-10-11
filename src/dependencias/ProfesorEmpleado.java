
package dependencias;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 06:37:57 PM
 * @desciption: Esta clase corresponde a 
 *
 */

public class ProfesorEmpleado implements Empleados{

   @Override
    public String getTarea(String nombre) {
         return "Mi "+nombre+" y soy PROFESOR";
    }

}
