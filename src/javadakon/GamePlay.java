/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadakon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author adan
 */
public class GamePlay extends javax.swing.JFrame {
    private String ip, port;
    boolean menangSuit;

    /**
     * Creates new form Dakon
     *
     * @param ip
     * @param port
     * @param menangSuit
     */
    public GamePlay(String ip, String port, boolean menangSuit) {
        initComponents();
        
        this.ip = ip;
        this.port = port;
        this.menangSuit = menangSuit;
        
        System.out.println("ip: " + ip + ", port: " + port + ", menang suit: " + menangSuit);
    }

    int tampung = 0;
    Timer tm = new Timer(100, new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            read();
//            tampung++;
//            if (tampung == 3) {
//                tm.stop();
//            }

        }
    });

    private GamePlay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        txtInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton7.setText("jButton7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(240, 560, 68, 31);
        getContentPane().add(txtInput);
        txtInput.setBounds(30, 580, 174, 29);

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 470, 262, 87);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(254, 254, 254));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Player 2");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(690, 20, 210, 60);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Player 1");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 20, 210, 60);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 20, 200, 60);

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("0");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 30, 21, 40);

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("0");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(440, 30, 21, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player1.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 300, 90);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/player2.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(680, 10, 300, 90);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skor.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 10, 200, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Dakon.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 950, 270);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/background.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, -6, 990, 640);

        setSize(new java.awt.Dimension(1000, 666));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String tempChat = txtChat.getText();
        String text = txtInput.getText();
        int portInt = Integer.parseInt(port);
        try {
            Socket cl = new Socket(ip, portInt);
            DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
            dos.writeBytes(text);

            cl.close();
            dos.close();

            txtChat.setText(tempChat + "\n" + text);

            tm.start();
        } catch (Exception e) {
            System.out.println("gagal");
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (menangSuit) {
            // jika menang suit
        } else {
            // jika kalah
            tm.start();
        }
    }//GEN-LAST:event_formWindowOpened

    public void read() {
        String tempChat = txtChat.getText();
        int portInt = Integer.parseInt(port);

        try {
            ServerSocket ss = new ServerSocket(portInt);
            Socket sk = ss.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(sk.getInputStream())
            );
            String line = br.readLine();

            txtChat.setText(tempChat + "\n" + line);

            if (line.equals(null)) {
                System.out.println("null");
            } else {
                tm.stop();
            }
            System.out.println(line);

            sk.close();
            ss.close();
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GamePlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GamePlay().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
