import java.io.*;
//import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
/*
For creating the server we have ServerSocket class in java.net package.
 */

public class SocketPrograming1 {
    public static void main(String[] args) throws  IOException {
        Scanner sc=new Scanner(System.in);
        /*
        server socket class follows the Tcp protocol internally.
         */
      ServerSocket ss=new ServerSocket(99/*here give a port number*/ );
        System.out.println("Server is started ,waiting for client...");
        Socket s=ss.accept(); // accept method is used to accept a copy of Socket or client
        /*
        printing the copy of client socket
         */

        System.out.println(s);

        /*
        receiving the message from the client.
         */
        InputStream is=s.getInputStream();
        OutputStream os=s.getOutputStream();
        DataInputStream ds=new DataInputStream(is);
        DataOutputStream dos=new DataOutputStream(os);
        String str= ds.readUTF();

        System.out.println(str+" -by client");

        System.out.println("enter message for client : ");
        String str1= sc.nextLine();
        dos.writeUTF(str1);
        System.out.println("message sent !!");

        dos.close();
        ds.close();
    }
}
