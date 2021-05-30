package com.company.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class server {

    //this has main class
    public static void main(String[] args) throws IOException {

        System.out.println("Server is running......");
        ServerSocket serverSocket = new ServerSocket( 6000);
        System.out.println("sever socket created...");

        while (true){
            //server running
            Socket client1 = serverSocket.accept();
            System.out.println("server accepted a client");
            ClientHandler clientHandler = new ClientHandler(client1);
            Thread thread = new Thread(clientHandler);
            thread.start();
        }
   /*     Socket com.company.Client.client = serverSocket.accept();// wait until a com.company.Client.client connects
        System.out.println("sever accepted a com.company.Client.client...");
        //try , catch or throw, throws

        Thread.sleep(20000);
        //send data to com.company.Client.client
        InputStream inputStream = com.company.Client.client.getInputStream();
//        DataOutputStream outputStream = new DataOutputStream(com.company.Client.client.getOutputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
     //   outputStream.writeBytes( "Hello from the com.company.Server.server ....\n" );
        DataOutputStream outputStream = new DataOutputStream(com.company.Client.client.getOutputStream());
*/
//        System.out.println("com.company.Server.server finished the execution.....");

//        String msgIn = "";
//        String msgOut = "";
//
//        while (!msgIn.equals("end")){
//            //String receivedData = bufferedReader.readLine();
//            msgIn = inputStream.readUTF();
//            System.out.println(msgIn);
//            msgOut = bufferedReader.readLine();
//            outputStream.writeBytes(msgOut);
//            //outputStream.writeUTF(msgOut);
//            outputStream.flush();
//        }
//      continous reading data from com.company.Client.client

    }
}
