package br.com.designpatterns.decorator.decorators;

import br.com.designpatterns.decorator.decorators.base.Notifier;
import br.com.designpatterns.decorator.decorators.base.NotifierDecorator;

public class SlackDecorator extends NotifierDecorator {

    public SlackDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendSlack(message);
    }

    private void sendSlack(String message) {
        System.out.println("Sent by Slack: " + message);
    }
    
}
