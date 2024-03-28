package concerttours.events;

import de.hybris.platform.servicelayer.event.events.AbstractEvent;

public class HelloWorldEvent extends AbstractEvent {

    private String fullName;

    public HelloWorldEvent(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
}
