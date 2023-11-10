/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anhtutran
 */
public class QuanLiTaiKhoan_ITF extends javax.swing.JFrame {

    /**
     * Creates new form QuanLiTaiKhoan_ITF
     */
    public QuanLiTaiKhoan_ITF() {
        initComponents();
         setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public ArrayList<TaiKhoan_Class> qltk=new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txttendn = new javax.swing.JTextField();
        txtmk = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Tên Đăng Nhập");

        jLabel2.setText("Mật Khẩu");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tên ĐN", "Mật Khẩu"
            }
        ));
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        jButton4.setText("Thoát");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttendn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Xoa)
                            .addComponent(btn_Them)
                            .addComponent(btn_Sua)
                            .addComponent(jButton4))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btn_Them)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txttendn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Sua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Xoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void loadFile() {
        try {
            FileInputStream fis = new FileInputStream("TAIKHOAN.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            var resultList = (ArrayList) ois.readObject();
            qltk = resultList;
            ois.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
private void reset() {
        loadFile();
        JTable table = new JTable();
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnNames = {"Tên ĐN", "Mật Khẩu"};
        model.setColumnIdentifiers(columnNames);
        Object[][] rowData = new Object[qltk.size()][6];
        for (int i = 0; i < qltk.size(); i++) {
            rowData[i][0] = qltk.get(i).getTenDN();
            rowData[i][1] = qltk.get(i).getMatKhau();
        }
        model.setDataVector(rowData, columnNames);
        this.table.setModel(model);
        this.add(new JScrollPane(table));
        this.pack();
        this.setVisible(true);
    }

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
 reset();
    }//GEN-LAST:event_tableAncestorAdded

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        loadFile();
        String TaiKhoan= txttendn.getText();
        String MatKhau= txtmk.getText();
        if(TaiKhoan.isEmpty()||MatKhau.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tài khoản hoặc mật khẩu không được để trống!");
        }else{
            boolean check=false;
            for (TaiKhoan_Class a : qltk) {
                if(a.getTenDN().equals(TaiKhoan)){
                    check=true;
                    break;
                }
            }
            if(check){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập đã tồn tại :( ");
            }else{
                qltk.add(new TaiKhoan_Class(TaiKhoan, MatKhau));
                try {
                    FileOutputStream fos = new FileOutputStream("TAIKHOAN.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(qltk);
                    oos.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(rootPane, "Đăng kí thành công :) ");
                txttendn.setText("");
                txtmk.setText("");
                reset();
            }
        }
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
        loadFile();
        String TaiKhoan= txttendn.getText();
        String MatKhau= txtmk.getText();
        if(TaiKhoan.isEmpty()||MatKhau.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tài khoản hoặc mật khẩu không được để trống!");
        }else{
            boolean check=false;
            for (TaiKhoan_Class a : qltk) {
                if(a.getTenDN().equals(TaiKhoan)){
                    check=true;
                    break;
                }
            }
            if(!check){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không  tồn tại :( ");
            }else{
                for (TaiKhoan_Class a : qltk) {
                if(a.getTenDN().equals(TaiKhoan)){
                    a.setMatKhau(MatKhau);
                    break;
                }
            }
                try {
                    FileOutputStream fos = new FileOutputStream("TAIKHOAN.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(qltk);
                    oos.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(rootPane, "Sửa Mật Khẩu thành công :) ");
                txttendn.setText("");
                txtmk.setText("");
                reset();
            }
        }
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        loadFile();
        String TaiKhoan= txttendn.getText();
      
        if(TaiKhoan.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tài khoản hoặc mật khẩu không được để trống!");
        }else{
            boolean check=false;
            for (TaiKhoan_Class a : qltk) {
                if(a.getTenDN().equals(TaiKhoan)){
                    check=true;
                    break;
                }
            }
            if(!check){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không tồn tại :( ");
            }else{
                for (TaiKhoan_Class a : qltk) {
                if(a.getTenDN().equals(TaiKhoan)){
                    qltk.remove(a);
                    break;
                }
                
            }
                try {
                    FileOutputStream fos = new FileOutputStream("TAIKHOAN.txt");
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    oos.writeObject(qltk);
                    oos.close();
                    fos.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                JOptionPane.showMessageDialog(rootPane, "Xóa thành công :) ");
                txttendn.setText("");
                txtmk.setText("");
                reset();
            }
        }
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int row = table.rowAtPoint(evt.getPoint());
        String TenDN = (String) table.getValueAt(row, 0);
        String MK = (String) table.getValueAt(row, 1);
        txttendn.setText(TenDN);
        txtmk.setText(MK);
    }//GEN-LAST:event_tableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn Thoát?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            // Người dùng chọn YES
            MenuForm a = new MenuForm();
            a.setVisible(true);
            setVisible(false);
        } else {
            JOptionPane.getRootFrame().dispose();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLiTaiKhoan_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLiTaiKhoan_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLiTaiKhoan_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLiTaiKhoan_ITF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLiTaiKhoan_ITF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtmk;
    private javax.swing.JTextField txttendn;
    // End of variables declaration//GEN-END:variables
}