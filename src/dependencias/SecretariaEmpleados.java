
package dependencias;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 05:18:45 PM
 * @desciption: Esta clase corresponde a SecretariaEmpleados
 *
 */

public class SecretariaEmpleados implements Empleados{

    @Override
    public String getTarea(String nombre) {
         return "Mi "+nombre+" y soy SECRETARIO";
    }
}
