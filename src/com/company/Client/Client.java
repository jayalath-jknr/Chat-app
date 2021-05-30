package com.company.Client;

import java.io.*;
import java.net.Socket;

public class Client {

//    Socket client;
    DataOutputStream outputStream;
    BufferedReader bufferedReader;

    public void start() throws IOException {
//        System.out.println();
//        Socket socket = new Socket("localhost",6000);
        Socket client = new Socket("localhost",6000);
        DataInputStream inputStream = new DataInputStream(client.getInputStream());

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //send data
        DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());

        String msgIn = "";
        String msgOut = "";

        while (!msgIn.equals("end")){
            //String receivedData = bufferedReader.readLine();
//                msgIn = bufferedReader.readLine();
            msgOut = bufferedReader.readLine();
//                outputStream.writeBytes(msgOut);
            outputStream.writeUTF(msgOut);
            msgIn = inputStream.readUTF();
            System.out.println(msgIn);

            outputStream.flush();
        }

        client.close();
//        this.outputStream = new DataOutputStream(socket.getOutputStream());
////        InputStream inputStream = socket.getInputStream();
//        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

    }

//    public void sendMessage(String message) throws IOException{
//        System.out.println("Client Says "+ message);
//        this.outputStream.writeBytes(message + "\n");
//        String dataFromServer = this.bufferedReader.readLine();
//        System.out.println("Server says : " + dataFromServer);
//
//    }

//    public void readMessage(Socket client, String msgIn) throws IOException{
//
//        DataInputStream inputStream = new DataInputStream(client.getInputStream());
//
//        msgIn = inputStream.readUTF();
//        System.out.println(msgIn);
//    }
//
//    public void sendMessage(String message) throws IOException{
//
////        DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
//
//    }

}
