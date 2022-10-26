package br.com.designpatterns.decorator.decorators;

import br.com.designpatterns.decorator.decorators.base.Notifier;
import br.com.designpatterns.decorator.decorators.base.NotifierDecorator;

public class SMSDecorator extends NotifierDecorator {
    
    public SMSDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSMS(message);
    }

    private void sendSMS(String message) {
        System.out.println("Sent by SMS: " + message);
    }
    
}
