package injectingconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class consMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("constructorconfig.xml");
        Person p= (Person) context.getBean("person");
        System.out.println(p);

        Addition add= (Addition) context.getBean("add");
        add.sum();

    }
}
