
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class SdirJF extends javax.swing.JFrame {
     public static String chooseDirectory() {
        JFrame parentFrame = new JFrame();
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int option = fileChooser.showOpenDialog(parentFrame);
        if (option == JFileChooser.APPROVE_OPTION) {
            java.io.File selectedDirectory = fileChooser.getSelectedFile();
            String path = selectedDirectory.getAbsolutePath();
            return path;
        } else {
            return null;
        }
    }
    public void Search(String str){
       Object[] obj01 ={"Name","Father's Name","Date Of Birth","Gender","Contact No","Address","Class-Section"} ;
       DefaultTableModel model = (DefaultTableModel)tableMain.getModel();
       model.addRow(obj01);
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tableMain.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
        
  
        
    }
    public SdirJF() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        SearchBox = new javax.swing.JTextField();
        Icon_mainpage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMain = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Background_Iamge = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Management System \\ Directory");
        setMinimumSize(new java.awt.Dimension(1366, 690));

        jPanel1.setMaximumSize(new java.awt.Dimension(1366, 690));
        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 690));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_student_edited 40 x 44.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1200, 150, 50, 50);

        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });
        SearchBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchBoxKeyReleased(evt);
            }
        });
        jPanel1.add(SearchBox);
        SearchBox.setBounds(170, 140, 230, 40);

        Icon_mainpage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/school-management-icon 50 x 50.png"))); // NOI18N
        jPanel1.add(Icon_mainpage);
        Icon_mainpage.setBounds(100, 80, 50, 50);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Student Directory");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(150, 80, 290, 50);

        tableMain.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name ", "Father's Name", "Date of Birth", "Gender", "Contact No", "Address", "Class-Section"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableMain);
        if (tableMain.getColumnModel().getColumnCount() > 0) {
            tableMain.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(100, 200, 1170, 410);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stock-vector-isolated-refresh-ve.jpg"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(1140, 150, 50, 50);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(1080, 150, 50, 50);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Search :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(110, 140, 60, 40);

        Background_Iamge.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back ground001 1366 x 690.jpg"))); // NOI18N
        Background_Iamge.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(Background_Iamge);
        Background_Iamge.setBounds(0, 0, 1366, 690);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1382, 712));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableMain.setModel(new DefaultTableModel(null,new String [] {"Name","Father's Name","Date Of Birth","Gender","Contact No","Address","Class-Section"}));
        String filePath = "stdentRecordFiles.txt";
         File file = new File(filePath);
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr) ;
            
            DefaultTableModel model = (DefaultTableModel) tableMain.getModel();
            Object[] lines = br.lines().toArray();
             for (Object line : lines) {
                 String[] row = line.toString().split("#");
                 model.addRow(row);
             }
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(SdirJF.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String path = chooseDirectory();
        if (path == null){
            JOptionPane.showMessageDialog(this,"Your File is not saved. ");
        }
        else{
             String fileName = JOptionPane.showInputDialog("Enter the File name: ");
        String filePath = path+"\\"+fileName+".txt";
        File file = new File(filePath);
        try {
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i = 0;i < tableMain.getRowCount();i++){
                for(int j = 0;j < tableMain.getColumnCount();j++){
                    bw.write(tableMain.getValueAt(i,j).toString()+" ");
                    }
                bw.newLine();
            }
            bw.close();
            fw.close();
            JOptionPane.showMessageDialog(this,"Your  File is saved. ");
        } 
        catch (IOException ex) {
            Logger.getLogger(SdirJF.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Your File is not saved. ");
         }
        }
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void SearchBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchBoxKeyReleased
        
    }//GEN-LAST:event_SearchBoxKeyReleased

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        
    }//GEN-LAST:event_jButton1MouseClicked

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SdirJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SdirJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SdirJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SdirJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SdirJF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background_Iamge;
    private javax.swing.JLabel Icon_mainpage;
    private javax.swing.JTextField SearchBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableMain;
    // End of variables declaration//GEN-END:variables
}
