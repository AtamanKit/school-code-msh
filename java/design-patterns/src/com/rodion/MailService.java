package com.rodion;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        // send email
        disconnect();
    }

    private void connect() {
        System.out.println("Connect");
    }

    private void authenticate() {
        System.out.println("Authenticate");
    }

    private void disconnect() {
        System.out.println("Disconnect");
    }
}