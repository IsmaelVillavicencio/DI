
package dependencias;

import org.springframework.context.annotation.Bean;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 06:17:25 PM
 * @desciption: Esta clase corresponde a 
 *
 */
public class MyBeans {
@Bean
    public DirectorEmpleados getDirectorEmpleados(){
        return new DirectorEmpleados();
    }
    @Bean
    public JefeEmpleados getEmpleados(){
        return new JefeEmpleados();
    }
    @Bean
    public SecretariaEmpleados getSecretariaEmpleados(){
        return new SecretariaEmpleados();
    }
    @Bean
    public IntendenteEmpleados geIntendenteEmpleados(){
        return new IntendenteEmpleados();
    }
    @Bean
    public ProfesorEmpleado getProfesorEmpleado(){
        return new ProfesorEmpleado();
    }
}
