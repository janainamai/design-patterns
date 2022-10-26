package br.com.designpatterns.decorator.run;

import br.com.designpatterns.decorator.decorators.FacebookDecorator;
import br.com.designpatterns.decorator.decorators.SMSDecorator;
import br.com.designpatterns.decorator.decorators.SlackDecorator;
import br.com.designpatterns.decorator.decorators.base.Notifier;
import br.com.designpatterns.decorator.decorators.base.NotifierImpl;

public class RunnerTest {

    public static void main(String[] args) {
        boolean smsEnabled = true;
        boolean facebookEnabled = false;
        boolean slackEnabled = false;

        Notifier notifier = new NotifierImpl();

        if (smsEnabled) {
            notifier = new SMSDecorator(notifier);
        }

        if (facebookEnabled) {
            notifier = new FacebookDecorator(notifier);
        }

        if (slackEnabled) {
            notifier = new SlackDecorator(notifier);
        }

        notifier.send("Hello, world!");
    }

}
