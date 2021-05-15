package com.hit.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable{
    ServerSocket serverSocket;
    Socket socket;
  DataInputStream dis;
    DataOutputStream dos;

    public Server(int port) throws IOException  {
        serverSocket=new ServerSocket(port);

    }
    public void run() {
       while(true)
        try {
            socket = serverSocket.accept();

            if (socket.isBound()) {
                System.out.println("Server with port " + serverSocket.getLocalPort() + " has started running");
                dis=new DataInputStream(socket.getInputStream());
                dos=new DataOutputStream(socket.getOutputStream());
                dos.writeUTF("hello client you are now connected feel free to chat ...write exit to exit chat");
                if(dis.readUTF().equals("exit")){
                    dos.writeUTF("connection closing...");
                    dis.close();
                    dos.close();
                    socket.close();
                }
            }
        }
    catch (IOException e) {
            e.printStackTrace();
        }
    }

}
