
package dependencias;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 06:37:42 PM
 * @desciption: Esta clase corresponde a 
 *
 */

public class IntendenteEmpleados implements Empleados{

    @Override
    public String getTarea(String nombre) {
         return "Mi "+nombre+" y soy INTENDENTE";
    }

}
