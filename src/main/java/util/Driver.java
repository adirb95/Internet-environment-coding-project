package util;

import com.hit.server.Server;

import java.io.*;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file =new File("C:\\Users\\Adir-pc\\IdeaProjects\\Java  Internet environment\\src\\main\\java\\com\\hit\\model\\DataBase_project.txt");
        Scanner sc =new Scanner(System.in);
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        if(file.createNewFile()){
            System.out.println("new file created "+ file.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileInputStream fileInputStream = new FileInputStream(file);
        List<String> list = new ArrayList();
       objectOutputStream = new ObjectOutputStream(fileOutputStream);

        Boolean state=true;
        while(state){
            System.out.println("enter an animal");
            String str=sc.nextLine();
            if(str.equals("exit")){
                state=false;
            }
        list.add(str);
        }
        objectOutputStream.writeObject(list);
        objectInputStream =new ObjectInputStream(fileInputStream);
        List<String> newlist= objectInputStream.readObject();
        CLI cli = new CLI(System.in, System.out);
        Server server = new Server(34567);
        cli.addPropertyChangeListener(server);
        new Thread(server).start();
//        Client client = new Client("127.0.0.1", 34567);
        new Thread(cli).start();

    }
}
