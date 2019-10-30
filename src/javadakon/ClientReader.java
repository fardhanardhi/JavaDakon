/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadakon;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author adan
 */
public class ClientReader extends Thread {
    int port;
    boolean menangSuit;

    public ClientReader(int port, boolean menangSuit) {
        this.port = port;
        this.menangSuit = menangSuit;
    }
    
    static ServerSocket ss;
    static Socket s;
    static DataOutputStream dos;
    static DataInputStream dis;
    static BufferedReader br;

    @Override
    public void run() {
        try {
            ss = new ServerSocket(port);
            s = ss.accept();
            br = new BufferedReader(
                    new InputStreamReader(s.getInputStream())
            );
//            while (true) {
                String data = br.readLine();
                
                ss.close();
                s.close();
                br.close();
                
                System.out.println("ClientReader: " + data);

                GamePlay gamePlay = new GamePlay(data);
                gamePlay.dummy();
                
                System.out.println("dah");
//            }
            
            
        } catch (Exception e) {
            System.out.println("error bro: " + e);
        }

    }

}
