package br.com.designpatterns.decorator.decorators.base;

public class NotifierImpl implements Notifier {
    
    @Override
    public void send(String message) {
        System.out.println("\nStart sending messages...");    
    }
    
}
