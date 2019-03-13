import org.springframework.context.ApplicationEvent;

public class MyCustomEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public MyCustomEvent(Object source) {
        super(source);
    }
}
