package com.company;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ServerGui {

    ServerSocket serverSocket;
    HashMap clientColl = new HashMap();

    {
        try {
            serverSocket = new ServerSocket( 6000);
            this.sStatus.setText("sever socket created...");
            Socket client1 = serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    private JTextArea txtMsgBox;
//    private JTextField txtField1
    private JButton btnSend;
    private JTextField TxtSendMsg;
    private JPanel panalMain;
    private JLabel sStatus;

//    private void createUIComponents() {
//        TODO: place custom component creation code here
//    }

    public static void main(String[] args) {
       JFrame frame = new JFrame("Chat Application");
//        ServerGui frame = new ServerGui();
        frame.setContentPane(new ServerGui().panalMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
//
//    public class Clienthandler implements Runnable {
//        @Override
//        public void run() {
//
////            InputStream inputStream = client.getInputStream();
////            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//
//            String i = null;
//            try {
//                Socket s = ServerSocket.accept();
//                i = new DataInputStream(s.getInputStream()).readUTF();
//                if (clientColl.containsKey(i)){
//                    DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
//                    dataOutputStream.writeUTF("you are reg");
//                }else {
//                    clientColl.put(i,s);
//                    txtMsgBox.append(i+ "joined \n");
//                    DataOutputStream dataOutputStream = new DataOutputStream(s.getOutputStream());
//                    dataOutputStream.writeUTF("");
//                    new MsgRead(s,i).start();
//                    new prepareClientList().start();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            //client call ehat
//
//        }
//    }
//    public void sendMessage(String message) throws IOException{
//        System.out.println("Client Says "+ message);
//        this.outputStream.writeBytes(message + "\n");
//        String dataFromServer = this.bufferedReader.readLine();
//        System.out.println("Server says : " + dataFromServer);
//
//    }
//    class MsgRead implements Runnable{
//        Socket s;
//        String ID;
//        private MsgRead(Socket s, String ID){
//            this.s = s;
//            this.ID = ID;
//        }
//
//        @Override
//        public void run() {
//            while (!clientColl.isEmpty()){
//                try {
//                    String i = new DataInputStream(s.getInputStream()).readUTF();
//                    if (i.equals("")){
//                        clientColl.remove(ID);
//                        txtMsgBox.append(ID+ ": removed \n" );
//                        new prepareClientList().start();
//
//                        Set k = clientColl.keySet();
//                        Iterator itr = k.iterator();
//                        while (itr.hasNext()){
//
//                        }
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//
//    class prepareClientList implements Runnable{
//
//        @Override
//        public void run() {
//
//        }
//
//        public void start() {
//        }
//    }
}
