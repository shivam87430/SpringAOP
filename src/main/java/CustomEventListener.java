import org.springframework.context.ApplicationListener;

public class CustomEventListener implements ApplicationListener<MyCustomEvent> {

    @Override
    public void onApplicationEvent(MyCustomEvent event) {
        System.out.println("This is my Custom Event " + event.getSource());
    }
}
