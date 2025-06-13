package standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("standalonecollectionconfig.xml");
        Person p=context.getBean("person1",Person.class);
        System.out.println(p);

        //For which list we can use for that
        System.out.println(p.getFriends().getClass().getName());

        System.out.println("********************************");
        System.out.println(p.getFeestructure());
        System.out.println(p.getFeestructure().getClass().getName());
    }
}
