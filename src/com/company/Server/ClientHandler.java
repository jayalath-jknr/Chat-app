package com.company.Server;

import java.io.*;
import java.net.Socket;

//ways to create threads
//1 extend the class using thread super class
//2 Implement the class using runnable interface

public class ClientHandler implements Runnable {

    private Socket client;
    public ClientHandler(Socket socket){
        this.client = socket;
    }
    public void run() {

        try {
            Thread.sleep(10000);//wait for 30 s
//            InputStream inputStream = client.getInputStream();
            DataInputStream inputStream = new DataInputStream(client.getInputStream());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));//changed with inputstream
            //send data
            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());

            String msgIn = "";
            String msgOut = "";

            while (!msgIn.equals("end")){
                //String receivedData = bufferedReader.readLine();
//                msgIn = bufferedReader.readLine();
                msgIn = inputStream.readUTF();
                System.out.println(msgIn);
                msgOut = bufferedReader.readLine();
//                outputStream.writeBytes(msgOut);
                outputStream.writeUTF(msgOut);
                outputStream.flush();
            }
            this.client.close();
        } catch (InterruptedException | IOException interruptedException) {
            interruptedException.printStackTrace();
        }
            //get data


//            String inputData;
//
//            while ((inputData = bufferedReader.readLine())!= null){
//                System.out.println("data from client "+ inputData);
//
//                switch (inputData){
//                    case "Hello from client.....":
//                        outputStream.writeBytes("Hello from server.....");
//                        break;
//                    case "How are you....":
//                        outputStream.writeBytes("I'm fine How are you....");
//                        break;
//                    case "im fine....":
//                        outputStream.writeBytes("okay good to know....");
//                        break;
//                    case "Thank you.....":
//                        outputStream.writeBytes("you are welcome.....");
//                        break;
//                    case "Exit":
//                        outputStream.writeBytes("bye");
//                        break;
//                    default:
//                        outputStream.writeBytes("I didnt understand that");
//                }

//            outputStream.writeBytes("Hello f t  S \n");
//
//                if (inputData.equals("exit")){
//                    break;
//                }
            }
//            this.client.close();

//        } catch (InterruptedException | IOException e) {
//            if (e != null) {
//                e.printStackTrace();
//            }
//    }

        //InputStream and outputStream
//    }

}
