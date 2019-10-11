package dependencias;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author: Ismael Villavicencio
 * @date: 10/10/2019
 * @time: 05:24:03 PM
 * @desciption: Esta clase corresponde a
 *
 */
public class UsoEmpleados {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MyBeans.class);
        context.refresh();

        DirectorEmpleados de = context.getBean(DirectorEmpleados.class);
        JefeEmpleados je = context.getBean(JefeEmpleados.class);
        SecretariaEmpleados se = context.getBean(SecretariaEmpleados.class);
        IntendenteEmpleados in = context.getBean(IntendenteEmpleados.class);
        ProfesorEmpleado pro = context.getBean(ProfesorEmpleado.class);
        String nombre = "Ismael";
        System.out.println(de.getTarea(nombre));
        System.out.println(je.getTarea(nombre));
        System.out.println(se.getTarea(nombre));
        System.out.println(in.getTarea(nombre));
        System.out.println(pro.getTarea(nombre));

        /*
        Empleados de = new DirectorEmpleados();
        Empleados je = new JefeEmpleados();
        Empleados se = new SecretariaEmpleados();

        System.out.println(de.getTarea());
        System.out.println(je.getTarea());
        System.out.println(se.getTarea());*/
    }
}
