package br.com.designpatterns.decorator.decorators;

import br.com.designpatterns.decorator.decorators.base.Notifier;
import br.com.designpatterns.decorator.decorators.base.NotifierDecorator;

public class FacebookDecorator extends NotifierDecorator {

    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebook(message);
    }

    private void sendFacebook(String message) {
        System.out.println("Sent by Facebook: " + message);
    }
    
}
