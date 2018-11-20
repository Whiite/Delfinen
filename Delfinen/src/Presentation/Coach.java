/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Data.Results;
import Data.TxtAccess;
import Logic.CompRes;
import Logic.Competition;
import Logic.Controller;
import java.io.IOException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mikkel
 */
public class Coach extends javax.swing.JFrame {

    Controller cp = new Controller();
    TxtAccess ta = new TxtAccess();
    Results re = new Results();

    /**
     * Creates new form Træner
     */
    public Coach() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTrainingOrComp = new javax.swing.JFrame();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSetTrainingResultWindow = new javax.swing.JFrame();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jMemberID = new javax.swing.JTextField();
        jDateTraining = new javax.swing.JTextField();
        jDistance = new javax.swing.JTextField();
        jTimeTraining = new javax.swing.JTextField();
        jRegistrerTraining = new javax.swing.JButton();
        jSetCompResultWindow = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jMemberID1 = new javax.swing.JTextField();
        jPlacement = new javax.swing.JTextField();
        jRegistrerComp = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jShowTopFiveWindow = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jRegisterCompWindow = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTrainOrCompResultWindow = new javax.swing.JFrame();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jFindTResultWindow = new javax.swing.JFrame();
        jFindKResultWindow = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jButton7.setText("Træning");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton9.setText("Konkurrence");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTrainingOrCompLayout = new javax.swing.GroupLayout(jTrainingOrComp.getContentPane());
        jTrainingOrComp.getContentPane().setLayout(jTrainingOrCompLayout);
        jTrainingOrCompLayout.setHorizontalGroup(
            jTrainingOrCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrainingOrCompLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jTrainingOrCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jTrainingOrCompLayout.setVerticalGroup(
            jTrainingOrCompLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrainingOrCompLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jButton7)
                .addGap(55, 55, 55)
                .addComponent(jButton9)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jSetTrainingResultWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jSetTrainingResultWindow.setTitle("Indberet Resultat");

        jLabel9.setText("Medlems ID");

        jLabel10.setText("Dato");

        jLabel11.setText("Distance");
        jLabel11.setToolTipText("");

        jLabel12.setText("Time");

        jLabel13.setText("M.");

        jLabel14.setText("Sek.");

        jMemberID.setText("0");

        jDateTraining.setText("yyyy-mm-dd");

        jDistance.setText("0");

        jTimeTraining.setText("0.0");

        jRegistrerTraining.setText("Registrer");
        jRegistrerTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrerTrainingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSetTrainingResultWindowLayout = new javax.swing.GroupLayout(jSetTrainingResultWindow.getContentPane());
        jSetTrainingResultWindow.getContentPane().setLayout(jSetTrainingResultWindowLayout);
        jSetTrainingResultWindowLayout.setHorizontalGroup(
            jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSetTrainingResultWindowLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSetTrainingResultWindowLayout.createSequentialGroup()
                        .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTimeTraining, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jDistance)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSetTrainingResultWindowLayout.createSequentialGroup()
                        .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                        .addGap(34, 34, 34)
                        .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateTraining, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jMemberID)))
                    .addComponent(jRegistrerTraining))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(186, 186, 186))
        );
        jSetTrainingResultWindowLayout.setVerticalGroup(
            jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSetTrainingResultWindowLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDateTraining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDistance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jSetTrainingResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTimeTraining, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(68, 68, 68)
                .addComponent(jRegistrerTraining)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jLabel15.setText("Medlems ID");

        jLabel16.setText("Stævne");

        jLabel17.setText("Placering");
        jLabel17.setToolTipText("");

        jMemberID1.setText("0");

        jPlacement.setText("0");

        jRegistrerComp.setText("Registrer");
        jRegistrerComp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRegistrerCompActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jSetCompResultWindowLayout = new javax.swing.GroupLayout(jSetCompResultWindow.getContentPane());
        jSetCompResultWindow.getContentPane().setLayout(jSetCompResultWindowLayout);
        jSetCompResultWindowLayout.setHorizontalGroup(
            jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSetCompResultWindowLayout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jSetCompResultWindowLayout.createSequentialGroup()
                        .addComponent(jRegistrerComp)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSetCompResultWindowLayout.createSequentialGroup()
                        .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jMemberID1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPlacement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(223, 223, 223))
        );
        jSetCompResultWindowLayout.setVerticalGroup(
            jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSetCompResultWindowLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMemberID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jSetCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPlacement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(102, 102, 102)
                .addComponent(jRegistrerComp)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jShowTopFiveWindow.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jShowTopFiveWindow.setTitle("Top Fem");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Junior", "Senior"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crawl", "Rygcrawl", "Butterfly", "Brystsvømning" }));

        jLabel2.setText("Disciplin");

        javax.swing.GroupLayout jShowTopFiveWindowLayout = new javax.swing.GroupLayout(jShowTopFiveWindow.getContentPane());
        jShowTopFiveWindow.getContentPane().setLayout(jShowTopFiveWindowLayout);
        jShowTopFiveWindowLayout.setHorizontalGroup(
            jShowTopFiveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jShowTopFiveWindowLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(jShowTopFiveWindowLayout.createSequentialGroup()
                .addGroup(jShowTopFiveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jShowTopFiveWindowLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jShowTopFiveWindowLayout.createSequentialGroup()
                        .addGap(258, 258, 258)
                        .addComponent(jButton2)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jShowTopFiveWindowLayout.setVerticalGroup(
            jShowTopFiveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jShowTopFiveWindowLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jShowTopFiveWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(jButton2)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        jLabel3.setText("Navn på stævne");

        jTextField2.setText("yyyy-mm-dd");

        jLabel4.setText("Dato");

        jButton10.setText("Registrer");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jRegisterCompWindowLayout = new javax.swing.GroupLayout(jRegisterCompWindow.getContentPane());
        jRegisterCompWindow.getContentPane().setLayout(jRegisterCompWindowLayout);
        jRegisterCompWindowLayout.setHorizontalGroup(
            jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegisterCompWindowLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addGroup(jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegisterCompWindowLayout.createSequentialGroup()
                        .addGroup(jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jRegisterCompWindowLayout.createSequentialGroup()
                        .addComponent(jButton10)
                        .addGap(57, 57, 57)))
                .addGap(209, 209, 209))
        );
        jRegisterCompWindowLayout.setVerticalGroup(
            jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jRegisterCompWindowLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jRegisterCompWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(87, 87, 87)
                .addComponent(jButton10)
                .addContainerGap(157, Short.MAX_VALUE))
        );

        jButton11.setText("Træning");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("Koncurrence");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jTrainOrCompResultWindowLayout = new javax.swing.GroupLayout(jTrainOrCompResultWindow.getContentPane());
        jTrainOrCompResultWindow.getContentPane().setLayout(jTrainOrCompResultWindowLayout);
        jTrainOrCompResultWindowLayout.setHorizontalGroup(
            jTrainOrCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrainOrCompResultWindowLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jTrainOrCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jTrainOrCompResultWindowLayout.setVerticalGroup(
            jTrainOrCompResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTrainOrCompResultWindowLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton11)
                .addGap(55, 55, 55)
                .addComponent(jButton12)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFindTResultWindowLayout = new javax.swing.GroupLayout(jFindTResultWindow.getContentPane());
        jFindTResultWindow.getContentPane().setLayout(jFindTResultWindowLayout);
        jFindTResultWindowLayout.setHorizontalGroup(
            jFindTResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jFindTResultWindowLayout.setVerticalGroup(
            jFindTResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFindKResultWindowLayout = new javax.swing.GroupLayout(jFindKResultWindow.getContentPane());
        jFindKResultWindow.getContentPane().setLayout(jFindKResultWindowLayout);
        jFindKResultWindowLayout.setHorizontalGroup(
            jFindKResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFindKResultWindowLayout.setVerticalGroup(
            jFindKResultWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Træner");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Træner");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setMaximumSize(new java.awt.Dimension(144, 42));
        jLabel1.setMinimumSize(new java.awt.Dimension(144, 42));
        jLabel1.setPreferredSize(null);

        jButton3.setText("Indberet resultat");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Vis top fem");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Registrer stævne");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Find resultat");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton1.setText("Tilbage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(328, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(328, 328, 328))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jButton3)
                .addGap(50, 50, 50)
                .addComponent(jButton4)
                .addGap(50, 50, 50)
                .addComponent(jButton5)
                .addGap(50, 50, 50)
                .addComponent(jButton6)
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTrainingOrComp.setVisible(true);
        jTrainingOrComp.setSize(400, 300);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jShowTopFiveWindow.setVisible(true);
        jShowTopFiveWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jRegisterCompWindow.setVisible(true);
        jRegisterCompWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFindTResultWindow.setVisible(true);
        jFindTResultWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new Delfinen().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // To be written...
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRegistrerTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrerTrainingActionPerformed
        String id = jMemberID.getText();
        LocalDate date = LocalDate.parse(jDateTraining.getText());
        int dis = Integer.parseInt(jDistance.getText());
        double time = Double.parseDouble(jTimeTraining.getText());
        cp.MakeTrainingResult(id, dis, time, date);
        jSetTrainingResultWindow.setVisible(false);
        new Coach().setVisible(true);
    }//GEN-LAST:event_jRegistrerTrainingActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jSetTrainingResultWindow.setVisible(true);
        jSetTrainingResultWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        for(Competition comp : ta.getCompetitions())
            {
                jComboBox2.addItem(comp.getName());
            }
        jSetCompResultWindow.setVisible(true);
        jSetCompResultWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String name = jTextField1.getText();
        LocalDate date = LocalDate.parse(jTextField2.getText());
        cp.competitionRegistrer(name, date);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jFindKResultWindow.setVisible(true);
        jFindKResultWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jFindTResultWindow.setVisible(true);
        jFindTResultWindow.setSize(600, 450);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jRegistrerCompActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRegistrerCompActionPerformed
        String id = jMemberID1.getText();
        int place = Integer.parseInt(jPlacement.getText());
        String compName = (String) jComboBox2.getSelectedItem();
        for(Competition comp : ta.getCompetitions()) {
            if (compName.matches(comp.getName())) {
                CompRes res = new CompRes(id, comp, place);
                ta.compResToFile(res);
            }
        }
        jSetCompResultWindow.setVisible(false);
        new Coach().setVisible(true);
    }//GEN-LAST:event_jRegistrerCompActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JTextField jDateTraining;
    private javax.swing.JTextField jDistance;
    private javax.swing.JFrame jFindKResultWindow;
    private javax.swing.JFrame jFindTResultWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jMemberID;
    private javax.swing.JTextField jMemberID1;
    private javax.swing.JTextField jPlacement;
    private javax.swing.JFrame jRegisterCompWindow;
    private javax.swing.JButton jRegistrerComp;
    private javax.swing.JButton jRegistrerTraining;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFrame jSetCompResultWindow;
    private javax.swing.JFrame jSetTrainingResultWindow;
    private javax.swing.JFrame jShowTopFiveWindow;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTimeTraining;
    private javax.swing.JFrame jTrainOrCompResultWindow;
    private javax.swing.JFrame jTrainingOrComp;
    // End of variables declaration//GEN-END:variables
}
