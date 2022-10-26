package br.com.designpatterns.decorator.decorators.base;

public class NotifierDecorator implements Notifier {

    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    
    @Override
    public void send(String message) {
        notifier.send(message);
    }

}
