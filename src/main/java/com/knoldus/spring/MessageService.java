package com.knoldus.spring;

public class MessageService {

    MessagePrinter messagePrinter;

    public MessagePrinter getMessagePrinter() {
        return messagePrinter;
    }

    public void setMessagePrinter(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void displayMessage() {
        System.out.println("Message : "+getMessagePrinter().getMessage());
    }
}
