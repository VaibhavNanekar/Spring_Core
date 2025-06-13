package springlifecyclexmlinteranno;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLifeMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("springlifecconfig.xml");
        //registring shutdown hook

        // object for xml
        context.registerShutdownHook();
       // Samosa s= (Samosa) context.getBean("sam");
       // System.out.println(s);

        System.out.println("**********************************************************");

        // object for interface
      //Pepsi p= (Pepsi) context.getBean("pepsi");
        //System.out.println(p);

        System.out.println("*****************************************************");

        //Object for annotation
       Example examp= (Example) context.getBean("example1");
        System.out.println(examp);



    }
}
