/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus_apl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author KANIA
 */
public class Data_Peminjaman extends javax.swing.JDialog {
    
    private DefaultTableModel tabmode;
    
    private void tampil_pinjaman(){
        Object[]baris={"ID Peminjaman","ID_Petugas","Nama_Petugas","ID_Anggota","Nama_Anggota","ID_Buku","Judul_Buku"," Tanggal_Pinjam", "Tanggal_Kembali","Tanggal_Pengembalian", "Keterangan", "Denda"};
        tabmode = new DefaultTableModel(null,baris);
        tabel_pinjaman.setModel(tabmode);
        String sql = "SELECT ID_Peminjaman, ID_Petugas, Nama_Petugas, ID_Anggota, Nama_Anggota, ID_Buku, Judul_Buku, Tanggal_Pinjam, Tanggal_Kembali, Tanggal_Pengembalian, Keterangan, Denda FROM `peminjaman` JOIN petugas USING (ID_Petugas) JOIN anggota USING (ID_Anggota) JOIN buku USING (ID_Buku) order by ID_Peminjaman asc";
      
        try{
            Connection konek= new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String ID_Peminjaman = hasil.getString("ID_Peminjaman");
                String ID_Petugas = hasil.getString("ID_Petugas");
                String Nama_Petugas = hasil.getString("Nama_Petugas");
                String ID_Anggota = hasil.getString("ID_Anggota");
                String Nama_Anggota = hasil.getString("Nama_Anggota");
                String ID_Buku = hasil.getString("ID_Buku");
                String Judul_Buku = hasil.getString("Judul_Buku");
                String Tanggal_Pinjam = hasil.getString("Tanggal_Pinjam");
                String Tanggal_Kembali = hasil.getString("Tanggal_Kembali");
                String Tanggal_Pengembalian = hasil.getString("Tanggal_Pengembalian");
                String Keterangan = hasil.getString("Keterangan");
                String Denda = hasil.getString("Denda");
                String[]data={ID_Peminjaman, ID_Petugas, Nama_Petugas, ID_Anggota, Nama_Anggota, ID_Buku, Judul_Buku, Tanggal_Pinjam, Tanggal_Kembali, Tanggal_Pengembalian, Keterangan, Denda};
                tabmode.addRow(data);
            }
            hasil.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    private void tampil_cari(){
        Object[]baris={"ID Peminjaman","ID_Petugas","Nama_Petugas","ID_Anggota","Nama_Anggota","ID_Buku","Judul_Buku"," Tanggal_Pinjam", "Tanggal_Kembali","Tanggal_Pengembalian", "Keterangan", "Denda"};
        tabmode = new DefaultTableModel(null,baris);
        tabel_pinjaman.setModel(tabmode);
        String sql = "SELECT ID_Peminjaman, ID_Petugas, Nama_Petugas, ID_Anggota, Nama_Anggota, ID_Buku, Judul_Buku, Tanggal_Pinjam, Tanggal_Kembali, Tanggal_Pengembalian, Keterangan, Denda FROM `peminjaman` JOIN petugas USING (ID_Petugas) JOIN anggota USING (ID_Anggota) JOIN buku USING (ID_Buku) where peminjaman.ID_Peminjaman = '"+cari.getText()+"' or peminjaman.ID_Petugas='"+cari.getText()+"' or peminjaman.ID_Anggota ='"+cari.getText()+"' or peminjaman.ID_Buku ='"+cari.getText()+"' or peminjaman.Tanggal_Pinjam ='"+cari.getText()+"' or peminjaman.Tanggal_Kembali ='"+cari.getText()+"' or peminjaman.Tanggal_Pengembalian ='"+cari.getText()+"' or peminjaman.Keterangan ='"+cari.getText()+"' or peminjaman.Denda ='"+cari.getText()+"' or anggota.Nama_Anggota ='"+cari.getText()+"' or buku.Judul_Buku ='"+cari.getText()+"' or petugas.Nama_Petugas ='"+cari.getText()+"' ";
      
        try{
            Connection konek= new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                String ID_Peminjaman = hasil.getString("ID_Peminjaman");
                String ID_Petugas = hasil.getString("ID_Petugas");
                String Nama_Petugas = hasil.getString("Nama_Petugas");
                String ID_Anggota = hasil.getString("ID_Anggota");
                String Nama_Anggota = hasil.getString("Nama_Anggota");
                String ID_Buku = hasil.getString("ID_Buku");
                String Judul_Buku = hasil.getString("Judul_Buku");
                String Tanggal_Pinjam = hasil.getString("Tanggal_Pinjam");
                String Tanggal_Kembali = hasil.getString("Tanggal_Kembali");
                String Tanggal_Pengembalian = hasil.getString("Tanggal_Pengembalian");
                String Keterangan = hasil.getString("Keterangan");
                String Denda = hasil.getString("Denda");
                String[]data={ID_Peminjaman, ID_Petugas, Nama_Petugas, ID_Anggota, Nama_Anggota, ID_Buku, Judul_Buku, Tanggal_Pinjam, Tanggal_Kembali, Tanggal_Pengembalian, Keterangan, Denda};
                tabmode.addRow(data);
            }
            hasil.close();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
        }
    /**
     * Creates new form Data_Peminjaman
     */
    public Data_Peminjaman(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tampil_pinjaman();
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
        tabel_pinjaman = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cari = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1014, 299));

        jLabel1.setBackground(new java.awt.Color(153, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 194));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PEMINJAMAN & PENGEMBALIAN PERPUSTAKAAN");
        jLabel1.setToolTipText("");
        jLabel1.setOpaque(true);

        tabel_pinjaman.setBackground(new java.awt.Color(255, 255, 204));
        tabel_pinjaman.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        tabel_pinjaman.setForeground(new java.awt.Color(153, 0, 0));
        tabel_pinjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        tabel_pinjaman.setGridColor(new java.awt.Color(153, 0, 0));
        jScrollPane1.setViewportView(tabel_pinjaman);

        jButton1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cari.setBackground(new java.awt.Color(255, 255, 204));
        cari.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N

        jTextField1.setBackground(new java.awt.Color(255, 255, 204));
        jTextField1.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jTextField1.setText("Masukkan ID Peminjaman");

        jButton2.setFont(new java.awt.Font("Calisto MT", 0, 12)); // NOI18N
        jButton2.setText("Hapus");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cari, jTextField1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(157, 157, 157))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cari, jButton1, jTextField1});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil_cari();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tampil_pinjaman();
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
            java.util.logging.Logger.getLogger(Data_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Data_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Data_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Data_Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Data_Peminjaman dialog = new Data_Peminjaman(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabel_pinjaman;
    // End of variables declaration//GEN-END:variables
}
