/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus_apl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KANIA
 */
public class Data_Buku extends javax.swing.JDialog {
    
    
     private DefaultTableModel tabmode;
    
    private void tampil_buku(){
        Object[]baris={"ID Buku","Judul Buku","Pengarang","Penerbit","Tahun Terbit","ID Rak"};
        tabmode = new DefaultTableModel(null,baris);
        tabel_buku.setModel(tabmode);
        String sql = "Select * from buku order by ID_Buku asc";
        //tabmode.getDataVector().removeAllElements();
        //tabmode.fireTableDataChanged();
        try{
            Connection konek= new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){ 
                String ID_Buku = hasil.getString("ID_Buku");
                String Judul_Buku = hasil.getString("Judul_Buku");
                String Pengarang = hasil.getString("Pengarang");
                String Penerbit = hasil.getString("Penerbit");
                String Tahun_Terbit = hasil.getString("Tahun_Terbit");
                String ID_Rak = hasil.getString("ID_Rak");
                String[]data={ID_Buku, Judul_Buku, Pengarang, Penerbit, Tahun_Terbit, ID_Rak};
                tabmode.addRow(data);
            }
            hasil.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    private void tampil_cari(){
        Object[]baris={"ID Buku","Judul Buku","Pengarang","Penerbit","Tahun Terbit","ID Rak"};
        tabmode = new DefaultTableModel(null,baris);
        tabel_buku.setModel(tabmode);
        String sql = "Select * from buku WHERE buku.ID_Buku = '"+cari.getText()+"' or buku.Judul_Buku = '"+cari.getText()+"' or buku.Pengarang = '"+cari.getText()+"' or buku.Penerbit = '"+cari.getText()+"' or buku.Tahun_Terbit = '"+cari.getText()+"'  or buku.ID_Rak = '"+cari.getText()+"' ";
        //tabmode.getDataVector().removeAllElements();
        //tabmode.fireTableDataChanged();
        try{
            Connection konek= new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){ 
                String ID_Buku = hasil.getString("ID_Buku");
                String Judul_Buku = hasil.getString("Judul_Buku");
                String Pengarang = hasil.getString("Pengarang");
                String Penerbit = hasil.getString("Penerbit");
                String Tahun_Terbit = hasil.getString("Tahun_Terbit");
                String ID_Rak = hasil.getString("ID_Rak");
                String[]data={ID_Buku, Judul_Buku, Pengarang, Penerbit, Tahun_Terbit, ID_Rak};
                tabmode.addRow(data);
            }
            hasil.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    /**
     * Creates new form Data_Buku
     */
    public Data_Buku(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_buku();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_buku = new javax.swing.JTable();
        cari = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        hapus = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA BUKU PERPUSTAKAAN");
        jLabel1.setOpaque(true);

        tabel_buku.setBackground(new java.awt.Color(255, 255, 204));
        tabel_buku.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        tabel_buku.setForeground(new java.awt.Color(153, 0, 0));
        tabel_buku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabel_buku.setGridColor(new java.awt.Color(153, 0, 0));
        jScrollPane1.setViewportView(tabel_buku);

        cari.setBackground(new java.awt.Color(255, 255, 204));
        cari.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        cari.setForeground(new java.awt.Color(51, 0, 0));

        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        hapus.setBackground(new java.awt.Color(255, 255, 204));
        hapus.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        hapus.setText("Masukkan ID Buku");

        jButton3.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton3.setText("Tampilkan Semua Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cari, hapus});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cari, hapus, jButton1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil_cari();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
           Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpus","root","");
           koneksi.createStatement().executeUpdate("delete from buku where ID_Buku='"+hapus.getText()+"'");  
           tampil_buku();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tampil_buku();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Data_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Buku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Data_Buku dialog = new Data_Buku(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cari;
    private javax.swing.JTextField hapus;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel_buku;
    // End of variables declaration//GEN-END:variables
}