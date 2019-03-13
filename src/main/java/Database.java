import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.io.IOException;

public class Database implements ApplicationEventPublisherAware {
    private String name;
    private int port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }

    ApplicationEventPublisher applicationEventPublisher;

    public void connect() {
        MyCustomEvent myCustomEvent = new MyCustomEvent(this);
        applicationEventPublisher.publishEvent(myCustomEvent);
        System.out.println("connecting to Database");
    }

    public void throwsException() throws IOException {
        System.out.println("Throwing IOException ");
        throw new IOException();
    }


    public void checkPointcutTypes() {
        System.out.println("This is CheckPointTypes");
    }

    public void argsMethod(Integer a){
        System.out.println(a);
    }

    public void argsMethod1(Integer a,Integer b){
        System.out.println(a);
        System.out.println(b);
    }
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
