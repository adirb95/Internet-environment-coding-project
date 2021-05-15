package util;

import com.hit.server.Server;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CLI implements Runnable {
    Scanner scanner;
    InputStream in;
    PrintStream out;
    Server server;

    public CLI(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.in = in;
        this.out = out;
    }

    public void addPropertyChangeListener(Server server) {
        this.server = server;
    }

    @Override
    public void run() {
        out.println("Welcome to our store!");
        out.println("Please choose a case!");
        out.println("1. Log in to Server");
        out.println("2. Quit");
        int answer = scanner.nextInt();
        switch (answer) {
            case 1: {
                new Thread(server).start();
                out.println("Logged in!");
                break;

            }
            case 2: {
                out.println("Quit!");
                System.exit(0);
                break;
            }
            default: {
                out.println("wtf are you doing?!");
            }
        }


    }
}
