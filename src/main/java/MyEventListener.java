import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;


public class MyEventListener implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("*******Event*******" + event);
    }
}
