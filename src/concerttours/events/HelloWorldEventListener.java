package concerttours.events;

import de.hybris.platform.servicelayer.event.impl.AbstractEventListener;

public class HelloWorldEventListener extends AbstractEventListener<HelloWorldEvent> {

    @Override
    protected void onEvent(HelloWorldEvent helloWorldEvent) {

        String fullName = helloWorldEvent.getFullName();

        System.out.println("Hello " + fullName);
    }

}