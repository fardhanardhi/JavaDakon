/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javadakon;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author adan
 */
public class GamePlay extends javax.swing.JFrame {

    private String ip, port;
    boolean menangSuit;
    int boardArr[] = {0, 7, 7, 7, 7, 7, 7, 7, 0, 7, 7, 7, 7, 7, 7, 7};

    /**
     * Creates new form Dakon
     *
     * @param ip
     * @param port
     * @param menangSuit
     */
    public GamePlay(String ip, String port, boolean menangSuit) {
        initComponents();
        hijau0.setVisible(false);
        hijau1.setVisible(false);
        hijau2.setVisible(false);
        hijau3.setVisible(false);
        hijau4.setVisible(false);
        hijau5.setVisible(false);
        hijau5.setVisible(false);
        hijau6.setVisible(false);
        hijau7.setVisible(false);
        hijau8.setVisible(false);
        hijau9.setVisible(false);
        hijau10.setVisible(false);
        hijau11.setVisible(false);
        hijau12.setVisible(false);
        hijau13.setVisible(false);
        hijau14.setVisible(false);
        hijau15.setVisible(false);

        lblJml0.setText(String.valueOf(boardArr[0]));
        lblJml1.setText(String.valueOf(boardArr[1]));
        lblJml2.setText(String.valueOf(boardArr[2]));
        lblJml3.setText(String.valueOf(boardArr[3]));
        lblJml4.setText(String.valueOf(boardArr[4]));
        lblJml5.setText(String.valueOf(boardArr[5]));
        lblJml6.setText(String.valueOf(boardArr[6]));
        lblJml7.setText(String.valueOf(boardArr[7]));
        lblJml8.setText(String.valueOf(boardArr[8]));
        lblJml9.setText(String.valueOf(boardArr[9]));
        lblJml10.setText(String.valueOf(boardArr[10]));
        lblJml11.setText(String.valueOf(boardArr[11]));
        lblJml12.setText(String.valueOf(boardArr[12]));
        lblJml13.setText(String.valueOf(boardArr[13]));
        lblJml14.setText(String.valueOf(boardArr[14]));
        lblJml15.setText(String.valueOf(boardArr[15]));

        lblScore1.setText(String.valueOf(boardArr[8]));
        lblScore2.setText(String.valueOf(boardArr[0]));

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

        jLabel8 = new javax.swing.JLabel();
        hijau9 = new javax.swing.JLabel();
        hijau10 = new javax.swing.JLabel();
        hijau11 = new javax.swing.JLabel();
        hijau12 = new javax.swing.JLabel();
        hijau13 = new javax.swing.JLabel();
        hijau14 = new javax.swing.JLabel();
        hijau15 = new javax.swing.JLabel();
        hijau7 = new javax.swing.JLabel();
        hijau6 = new javax.swing.JLabel();
        hijau5 = new javax.swing.JLabel();
        hijau4 = new javax.swing.JLabel();
        hijau3 = new javax.swing.JLabel();
        hijau2 = new javax.swing.JLabel();
        hijau1 = new javax.swing.JLabel();
        hijau8 = new javax.swing.JLabel();
        hijau0 = new javax.swing.JLabel();
        lblJml0 = new javax.swing.JLabel();
        lblJml1 = new javax.swing.JLabel();
        lblJml2 = new javax.swing.JLabel();
        lblJml3 = new javax.swing.JLabel();
        lblJml4 = new javax.swing.JLabel();
        lblJml5 = new javax.swing.JLabel();
        lblJml6 = new javax.swing.JLabel();
        lblJml7 = new javax.swing.JLabel();
        lblJml8 = new javax.swing.JLabel();
        lblJml9 = new javax.swing.JLabel();
        lblJml10 = new javax.swing.JLabel();
        lblJml11 = new javax.swing.JLabel();
        lblJml12 = new javax.swing.JLabel();
        lblJml13 = new javax.swing.JLabel();
        lblJml14 = new javax.swing.JLabel();
        lblJml15 = new javax.swing.JLabel();
        lblPlayer2 = new javax.swing.JLabel();
        lblPlayer1 = new javax.swing.JLabel();
        lblScore2 = new javax.swing.JLabel();
        lblScore1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/merahBesar.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        hijau9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau9MouseClicked(evt);
            }
        });
        getContentPane().add(hijau9);
        hijau9.setBounds(730, 320, 90, 110);

        hijau10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau10MouseClicked(evt);
            }
        });
        getContentPane().add(hijau10);
        hijau10.setBounds(640, 320, 90, 110);

        hijau11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau11MouseClicked(evt);
            }
        });
        getContentPane().add(hijau11);
        hijau11.setBounds(550, 320, 90, 110);

        hijau12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau12MouseClicked(evt);
            }
        });
        getContentPane().add(hijau12);
        hijau12.setBounds(450, 320, 90, 110);

        hijau13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau13MouseClicked(evt);
            }
        });
        getContentPane().add(hijau13);
        hijau13.setBounds(360, 320, 90, 110);

        hijau14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau14MouseClicked(evt);
            }
        });
        getContentPane().add(hijau14);
        hijau14.setBounds(270, 320, 90, 110);

        hijau15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau15MouseClicked(evt);
            }
        });
        getContentPane().add(hijau15);
        hijau15.setBounds(170, 320, 90, 110);

        hijau7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau7MouseClicked(evt);
            }
        });
        getContentPane().add(hijau7);
        hijau7.setBounds(730, 190, 90, 110);

        hijau6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau6MouseClicked(evt);
            }
        });
        getContentPane().add(hijau6);
        hijau6.setBounds(640, 190, 90, 110);

        hijau5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau5MouseClicked(evt);
            }
        });
        getContentPane().add(hijau5);
        hijau5.setBounds(550, 190, 90, 110);

        hijau4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau4MouseClicked(evt);
            }
        });
        getContentPane().add(hijau4);
        hijau4.setBounds(450, 190, 90, 110);

        hijau3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau3MouseClicked(evt);
            }
        });
        getContentPane().add(hijau3);
        hijau3.setBounds(360, 190, 90, 110);

        hijau2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau2MouseClicked(evt);
            }
        });
        getContentPane().add(hijau2);
        hijau2.setBounds(270, 190, 90, 110);

        hijau1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijau.png"))); // NOI18N
        hijau1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hijau1MouseClicked(evt);
            }
        });
        getContentPane().add(hijau1);
        hijau1.setBounds(170, 190, 90, 110);

        hijau8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hijau8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijauBesar.png"))); // NOI18N
        getContentPane().add(hijau8);
        hijau8.setBounds(820, 250, 120, 120);

        hijau0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hijau0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hijauBesar.png"))); // NOI18N
        getContentPane().add(hijau0);
        hijau0.setBounds(50, 250, 120, 120);

        lblJml0.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml0.setForeground(new java.awt.Color(255, 255, 255));
        lblJml0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml0.setText("0");
        getContentPane().add(lblJml0);
        lblJml0.setBounds(70, 300, 80, 30);

        lblJml1.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml1.setForeground(new java.awt.Color(255, 255, 255));
        lblJml1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml1.setText("0");
        getContentPane().add(lblJml1);
        lblJml1.setBounds(185, 230, 50, 30);

        lblJml2.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml2.setForeground(new java.awt.Color(255, 255, 255));
        lblJml2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml2.setText("0");
        getContentPane().add(lblJml2);
        lblJml2.setBounds(285, 230, 50, 30);

        lblJml3.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml3.setForeground(new java.awt.Color(255, 255, 255));
        lblJml3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml3.setText("0");
        getContentPane().add(lblJml3);
        lblJml3.setBounds(375, 230, 50, 30);

        lblJml4.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml4.setForeground(new java.awt.Color(255, 255, 255));
        lblJml4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml4.setText("0");
        getContentPane().add(lblJml4);
        lblJml4.setBounds(465, 230, 50, 30);

        lblJml5.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml5.setForeground(new java.awt.Color(255, 255, 255));
        lblJml5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml5.setText("0");
        getContentPane().add(lblJml5);
        lblJml5.setBounds(565, 230, 50, 30);

        lblJml6.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml6.setForeground(new java.awt.Color(255, 255, 255));
        lblJml6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml6.setText("0");
        getContentPane().add(lblJml6);
        lblJml6.setBounds(655, 230, 50, 30);

        lblJml7.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml7.setForeground(new java.awt.Color(255, 255, 255));
        lblJml7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml7.setText("0");
        getContentPane().add(lblJml7);
        lblJml7.setBounds(745, 230, 50, 30);

        lblJml8.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml8.setForeground(new java.awt.Color(255, 255, 255));
        lblJml8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml8.setText("0");
        getContentPane().add(lblJml8);
        lblJml8.setBounds(835, 300, 90, 30);

        lblJml9.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml9.setForeground(new java.awt.Color(255, 255, 255));
        lblJml9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml9.setText("0");
        getContentPane().add(lblJml9);
        lblJml9.setBounds(740, 360, 60, 30);

        lblJml10.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml10.setForeground(new java.awt.Color(255, 255, 255));
        lblJml10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml10.setText("0");
        getContentPane().add(lblJml10);
        lblJml10.setBounds(650, 360, 60, 30);

        lblJml11.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml11.setForeground(new java.awt.Color(255, 255, 255));
        lblJml11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml11.setText("0");
        getContentPane().add(lblJml11);
        lblJml11.setBounds(560, 360, 60, 30);

        lblJml12.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml12.setForeground(new java.awt.Color(255, 255, 255));
        lblJml12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml12.setText("0");
        getContentPane().add(lblJml12);
        lblJml12.setBounds(460, 360, 60, 30);

        lblJml13.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml13.setForeground(new java.awt.Color(255, 255, 255));
        lblJml13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml13.setText("0");
        getContentPane().add(lblJml13);
        lblJml13.setBounds(370, 360, 60, 30);

        lblJml14.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml14.setForeground(new java.awt.Color(255, 255, 255));
        lblJml14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml14.setText("0");
        getContentPane().add(lblJml14);
        lblJml14.setBounds(280, 360, 60, 30);

        lblJml15.setFont(new java.awt.Font("Roboto", 1, 30)); // NOI18N
        lblJml15.setForeground(new java.awt.Color(255, 255, 255));
        lblJml15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJml15.setText("0");
        getContentPane().add(lblJml15);
        lblJml15.setBounds(180, 360, 60, 30);

        lblPlayer2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblPlayer2.setForeground(java.awt.Color.white);
        lblPlayer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer2.setText("Player 2");
        getContentPane().add(lblPlayer2);
        lblPlayer2.setBounds(690, 20, 210, 60);

        lblPlayer1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblPlayer1.setForeground(java.awt.Color.white);
        lblPlayer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPlayer1.setText("Player 1");
        getContentPane().add(lblPlayer1);
        lblPlayer1.setBounds(90, 20, 210, 60);

        lblScore2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblScore2.setForeground(new java.awt.Color(255, 255, 255));
        lblScore2.setText("0");
        getContentPane().add(lblScore2);
        lblScore2.setBounds(540, 30, 21, 40);

        lblScore1.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblScore1.setForeground(new java.awt.Color(255, 255, 255));
        lblScore1.setText("0");
        getContentPane().add(lblScore1);
        lblScore1.setBounds(440, 30, 21, 40);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("-");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(400, 20, 200, 60);

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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        if (menangSuit) {
            // jika menang suit
//            hijau1.setVisible(true);
//            hijau2.setVisible(true);
//            hijau3.setVisible(true);
//            hijau4.setVisible(true);
//            hijau5.setVisible(true);
//            hijau6.setVisible(true);
//            hijau7.setVisible(true);
            updateBoardClickable(true);
        } else {
            // jika kalah
            tm.start();
        }
    }//GEN-LAST:event_formWindowOpened

    private void hijau1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau1MouseClicked
        updateBoard(lblJml1, 1);
    }//GEN-LAST:event_hijau1MouseClicked

    private void hijau2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau2MouseClicked
        updateBoard(lblJml2, 2);
    }//GEN-LAST:event_hijau2MouseClicked

    private void hijau3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau3MouseClicked
        updateBoard(lblJml3, 3);
    }//GEN-LAST:event_hijau3MouseClicked

    private void hijau4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau4MouseClicked
        updateBoard(lblJml4, 4);
    }//GEN-LAST:event_hijau4MouseClicked

    private void hijau5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau5MouseClicked
        updateBoard(lblJml5, 5);
    }//GEN-LAST:event_hijau5MouseClicked

    private void hijau6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau6MouseClicked
        updateBoard(lblJml6, 6);
    }//GEN-LAST:event_hijau6MouseClicked

    private void hijau7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau7MouseClicked
        updateBoard(lblJml7, 7);
    }//GEN-LAST:event_hijau7MouseClicked

    private void hijau15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau15MouseClicked
        updateBoard(lblJml15, 15);
    }//GEN-LAST:event_hijau15MouseClicked

    private void hijau14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau14MouseClicked
        updateBoard(lblJml14, 14);
    }//GEN-LAST:event_hijau14MouseClicked

    private void hijau13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau13MouseClicked
        updateBoard(lblJml13, 13);
    }//GEN-LAST:event_hijau13MouseClicked

    private void hijau12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau12MouseClicked
        updateBoard(lblJml12, 12);
    }//GEN-LAST:event_hijau12MouseClicked

    private void hijau11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau11MouseClicked
        updateBoard(lblJml11, 11);
    }//GEN-LAST:event_hijau11MouseClicked

    private void hijau10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau10MouseClicked
        updateBoard(lblJml10, 10);
    }//GEN-LAST:event_hijau10MouseClicked

    private void hijau9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hijau9MouseClicked
        updateBoard(lblJml9, 9);
    }//GEN-LAST:event_hijau9MouseClicked

    public void read() {
        int portInt = Integer.parseInt(port);

        try {
            ServerSocket ss = new ServerSocket(portInt);
            Socket sk = ss.accept();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(sk.getInputStream())
            );
            String line = br.readLine();
            String arrData[] = line.split("\\,", 0);

            for (int i = 0; i < boardArr.length; i++) {
                boardArr[i] = Integer.parseInt(arrData[i]);
            }

            System.out.println("arrdata: " + line);

            if (line.equals(null)) {
                System.out.println("null");
            } else {
                tm.stop();

            }
            System.out.println("hhhhhhhhhhhhhh: " + line);

            sk.close();
            ss.close();
            updateBoardClickable(true);
        } catch (Exception err) {
            System.out.println(err);
        }
    }

    public void write() {
        String arrStr = "";
        for (int i = 0; i < boardArr.length; i++) {
            arrStr += (i == boardArr.length - 1) ? boardArr[i] : boardArr[i] + ",";
        }

        int portInt = Integer.parseInt(port);
        try {
            Socket cl = new Socket(ip, portInt);
            DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
            dos.writeBytes(arrStr);

            cl.close();
            dos.close();

            tm.start();
        } catch (Exception e) {
            System.out.println("gagal");
        }   
        
        if ((boardArr[1] == 0 && boardArr[2] == 0 && boardArr[3] == 0 && boardArr[4] == 0 && boardArr[5] == 0 && boardArr[6] == 0 && boardArr[7] == 0) && (boardArr[8] > boardArr[0])) {
            JOptionPane.showMessageDialog(null, "Selamat... !\nPlayer 1 Menang", "Pemenang", JOptionPane.INFORMATION_MESSAGE);
        } else if ((boardArr[9] == 0 && boardArr[10] == 0 && boardArr[11] == 0 && boardArr[12] == 0 && boardArr[13] == 0 && boardArr[14] == 0 && boardArr[15] == 0) && (boardArr[0] > boardArr[8])) {
            JOptionPane.showMessageDialog(null, "Selamat... !\nPlayer 2 Menang", "Pemenang", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void updateBoard(JLabel label, int posisi) {
        int jmlAmbil = Integer.parseInt(label.getText().toString());
        boardArr[posisi] = 0;
        while (jmlAmbil > 0) {
            if (menangSuit) {
                if (posisi == 15) {
                    posisi = 1;
                } else {
                    posisi++;
                }
            } else {
                if (posisi == 15) {
                    posisi = 0;
                } else if (posisi == 7) {
                    posisi = 9;
                } else {
                    posisi++;
                }
            }
            jmlAmbil--;
            boardArr[posisi]++;

            if (jmlAmbil == 0) {
                if (boardArr[posisi] == 1) {
                    if (menangSuit && posisi > 0 && posisi < 8) {
                        int temp = 0;
                        switch(posisi) {
                            case 1:
                                temp = 15;
                                break;
                            case 2:
                                temp = 14;
                                break;
                            case 3:
                                temp = 13;
                                break;
                            case 4:
                                temp = 12;
                                break;
                            case 5:
                                temp = 11;
                                break;
                            case 6:
                                temp = 10;
                                break;
                            case 7:
                                temp = 9;
                                break;
                        }
                        boardArr[8] += boardArr[temp];
                        boardArr[temp] = 0;
                    } else if (!menangSuit && posisi > 8 && posisi <= 15) {
                        int temp = 0;
                        switch(posisi) {
                            case 15:
                                temp = 1;
                                break;
                            case 14:
                                temp = 2;
                                break;
                            case 13:
                                temp = 3;
                                break;
                            case 12:
                                temp = 4;
                                break;
                            case 11:
                                temp = 5;
                                break;
                            case 10:
                                temp = 6;
                                break;
                            case 9:
                                temp = 7;
                                break;
                        }
                        boardArr[0] += boardArr[temp];
                        boardArr[temp] = 0;
                    }else if (menangSuit && posisi==8 && boardArr[posisi]==1) {
                        updateBoardClickable(true);
                    }else if (!menangSuit && posisi==0 && boardArr[posisi]==1) {
                        updateBoardClickable(true);
                    }
                }else {
                    jmlAmbil = boardArr[posisi];
                    boardArr[posisi] = 0;
                }
            }
        }
        updateBoardClickable(false);
        write();
    }

    public void updateBoardClickable(boolean clickable) {
        for (int i = 0; i < boardArr.length; i++) {
            JLabel labelAktif = getJLabelHijau(i);
            JLabel labelJumlah = getJLabelJumlah(i);
            if (clickable) {
                if (boardArr[i] == 0) {
                    labelAktif.setVisible(false);
                } else {
                    if (menangSuit) {
                        if (i > 0 && i < 8) {
                            labelAktif.setVisible(true);
                        } else {
                            labelAktif.setVisible(false);
                        }
                    } else {
                        if (i > 8 && i <= 15) {
                            labelAktif.setVisible(true);
                        } else {
                            labelAktif.setVisible(false);

                        }
                    }
                }
            } else {
                labelAktif.setVisible(false);
            }
            labelJumlah.setText(String.valueOf(boardArr[i]));

        }
    }

    public JLabel getJLabelJumlah(int index) {
        JLabel label = null;
        switch (index) {
            case 0:
                label = lblJml0;
                break;
            case 1:
                label = lblJml1;
                break;
            case 2:
                label = lblJml2;
                break;
            case 3:
                label = lblJml3;
                break;
            case 4:
                label = lblJml4;
                break;
            case 5:
                label = lblJml5;
                break;
            case 6:
                label = lblJml6;
                break;
            case 7:
                label = lblJml7;
                break;
            case 8:
                label = lblJml8;
                break;
            case 9:
                label = lblJml9;
                break;
            case 10:
                label = lblJml10;
                break;
            case 11:
                label = lblJml11;
                break;
            case 12:
                label = lblJml12;
                break;
            case 13:
                label = lblJml13;
                break;
            case 14:
                label = lblJml14;
                break;
            case 15:
                label = lblJml15;
                break;
        }
        return label;
    }

    public JLabel getJLabelHijau(int index) {
        JLabel label = null;
        switch (index) {
            case 0:
                label = hijau0;
                break;
            case 1:
                label = hijau1;
                break;
            case 2:
                label = hijau2;
                break;
            case 3:
                label = hijau3;
                break;
            case 4:
                label = hijau4;
                break;
            case 5:
                label = hijau5;
                break;
            case 6:
                label = hijau6;
                break;
            case 7:
                label = hijau7;
                break;
            case 8:
                label = hijau8;
                break;
            case 9:
                label = hijau9;
                break;
            case 10:
                label = hijau10;
                break;
            case 11:
                label = hijau11;
                break;
            case 12:
                label = hijau12;
                break;
            case 13:
                label = hijau13;
                break;
            case 14:
                label = hijau14;
                break;
            case 15:
                label = hijau15;
                break;
        }
        return label;
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
    private javax.swing.JLabel hijau0;
    private javax.swing.JLabel hijau1;
    private javax.swing.JLabel hijau10;
    private javax.swing.JLabel hijau11;
    private javax.swing.JLabel hijau12;
    private javax.swing.JLabel hijau13;
    private javax.swing.JLabel hijau14;
    private javax.swing.JLabel hijau15;
    private javax.swing.JLabel hijau2;
    private javax.swing.JLabel hijau3;
    private javax.swing.JLabel hijau4;
    private javax.swing.JLabel hijau5;
    private javax.swing.JLabel hijau6;
    private javax.swing.JLabel hijau7;
    private javax.swing.JLabel hijau8;
    private javax.swing.JLabel hijau9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblJml0;
    private javax.swing.JLabel lblJml1;
    private javax.swing.JLabel lblJml10;
    private javax.swing.JLabel lblJml11;
    private javax.swing.JLabel lblJml12;
    private javax.swing.JLabel lblJml13;
    private javax.swing.JLabel lblJml14;
    private javax.swing.JLabel lblJml15;
    private javax.swing.JLabel lblJml2;
    private javax.swing.JLabel lblJml3;
    private javax.swing.JLabel lblJml4;
    private javax.swing.JLabel lblJml5;
    private javax.swing.JLabel lblJml6;
    private javax.swing.JLabel lblJml7;
    private javax.swing.JLabel lblJml8;
    private javax.swing.JLabel lblJml9;
    private javax.swing.JLabel lblPlayer1;
    private javax.swing.JLabel lblPlayer2;
    private javax.swing.JLabel lblScore1;
    private javax.swing.JLabel lblScore2;
    // End of variables declaration//GEN-END:variables
}
