import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ConfigurableApplicationContext ctx=new ClassPathXmlApplicationContext("Spring-config.xml");
        ctx.start();
        Database database=(Database) ctx.getBean("database");

        System.out.println(database);
        ctx.stop();
        System.out.println("\n");
        database.connect();

        System.out.println("\n");
        database.checkPointcutTypes();


        System.out.println("\n");
        database.argsMethod(20);


        System.out.println("\n");
        System.out.println(ctx.getBean("database1"));


        System.out.println("\n");
        System.out.println("\n");
        database.argsMethod1(20,20);

        System.out.println("\n");
        database.throwsException();
        ctx.stop();
//        ctx.close();
    }
}
