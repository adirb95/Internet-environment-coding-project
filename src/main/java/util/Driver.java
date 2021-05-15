package util;

import com.hit.server.Server;

import java.io.IOException;
import java.net.InetAddress;

public class Driver {

    public static void main(String[] args) throws IOException {
        CLI cli = new CLI(System.in, System.out);
        Server server = new Server(34567);
        cli.addPropertyChangeListener(server);
        new Thread(server).start();
        Client client = new Client("127.0.0.1", 34567);
        new Thread(cli).start();

    }
}
