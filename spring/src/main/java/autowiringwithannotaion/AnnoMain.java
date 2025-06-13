package autowiringwithannotaion;

import autowiring.Employe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnoMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("auto-wireconfig.xml");
        Employe emp1= context.getBean("emp1" ,Employe.class);
        System.out.println(emp1);

       // Employe emp2= context.getBean("emp2" ,Employe.class);
       // System.out.println(emp2);
    }
}



