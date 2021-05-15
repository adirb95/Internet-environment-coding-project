package util;

import java.io.IOException;
import java.net.Socket;

public class Client implements  Runnable{
    Socket socket;
    String proxy;
    int port;
    public Client(String proxy,int port) throws IOException {
            this.proxy=proxy;
            this.port=port;
            }
            @Override
    public void run() {
                try {
                    socket=new Socket(proxy,port);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
}
