package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("auto-wireconfig.xml");
        Employe emp1= context.getBean("emp1" ,Employe.class);
        System.out.println(emp1);
    }
}
