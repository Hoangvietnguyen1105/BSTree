/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;
import javax.swing.JTextField;

/**
 *
 * @author Hoang Viet
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        soluong = new javax.swing.JTextField();
        nhapphantu = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        them = new javax.swing.JButton();
        Pre = new javax.swing.JTextField();
        In = new javax.swing.JTextField();
        Post = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        xoatext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        timtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tim = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        themtext = new javax.swing.JTextField();
        them1 = new javax.swing.JButton();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("them phan tu");

        soluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soluongActionPerformed(evt);
            }
        });

        jLabel2.setText("so luong phan tu muon them");

        jLabel3.setText("nhap phan tu");

        them.setText("Ok");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        Pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreActionPerformed(evt);
            }
        });

        jLabel4.setText(" preOder");

        jLabel5.setText("InOder");

        jLabel6.setText("PostOder");

        xoatext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoatextActionPerformed(evt);
            }
        });

        jLabel8.setText("nut can xoa");

        jLabel9.setText("tim nut");

        jButton1.setText("xoa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tim.setText("tim");
        tim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timActionPerformed(evt);
            }
        });

        jLabel10.setText("them nut");

        themtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themtextActionPerformed(evt);
            }
        });

        them1.setText("thêm");
        them1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                them1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(them))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(78, 78, 78)
                                .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nhapphantu, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel10))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(themtext)
                                    .addComponent(timtext, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tim)
                                    .addComponent(them1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(xoatext, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Post, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(In, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Pre, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(0, 96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(soluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nhapphantu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Pre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Post, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(xoatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(timtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tim))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(themtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(them1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(them)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soluongActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        // TODO add your handling code here:
        MyBST d = new MyBST();
        String a = nhapphantu.getText();
        String a1 = soluong.getText();
        int a2 = Integer.parseInt(a1);
        String[] b = null;
        b = a.split(" ");
        int[] c = new int[b.length];           
        for (int i =0; i < b.length;i++){
            c[i] = Integer.parseInt(b[i]);
        }
        for (int i = 0; i < c.length ; i++){
            d.mRoot = d.insert(d.mRoot, c[i]);
        }
        
       
//        if(xoa == "no"){
//           
//        }
//        else{
//             a2 = a2-1;
//            int xoa1 = Integer.parseInt(xoa);
//            d.deleteNode(d.mRoot,xoa1 );
//        }
//        
         String p ="";
        p = d.PostOder(d.mRoot, p);
//        System.out.print(p);
        String[] b1 = null;
        b1 = p.split(" ");
        String[] c1 = new String[a2];
        int j = a2-1;
        for (int i = b1.length-1; i >= b1.length-a2;i--){
            c1[j]=b1[i];
            j--;
            }
           String postoder="";
          for(int i = 0; i < a2 ;i++){
                postoder = postoder+ c1[i]+" ";
            }
        Post.setText(postoder);
        String pre = "";
        pre = d.PreOder(d.mRoot, pre);
        String[] bre = null;
        bre = pre.split(" ");
        String[] cre = new String[a2];
        int jre =a2-1;
        for (int ire = bre.length-1; ire >= bre.length-a2;ire--){
            cre[jre]=bre[ire];
            jre--;
            }
        String preoder ="";
          for(int ire = 0; ire < a2 ;ire++){
                preoder = preoder + cre[ire]+" ";
            }
         Pre.setText(preoder);
         String pIn ="";
        pIn = d.InOder(d.mRoot, pIn);
//        System.out.print(p);
        String[] bIn = null;
        bIn = pIn.split(" ");
        String[] cIn = new String[a2];
        int jIn =a2-1;
        for (int iIn = bIn.length-1; iIn >= bIn.length-a2;iIn--){
            cIn[jIn]=bIn[iIn];
            jIn--;
            }
        String Inoder="";
          for(int iIn = 0; iIn < a2 ;iIn++){
                Inoder=Inoder+ cIn[iIn]+" ";
            }
          In.setText(Inoder);
          
         
          
    
    }//GEN-LAST:event_themActionPerformed

    private void PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PreActionPerformed

    private void xoatextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoatextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xoatextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         MyBST d = new MyBST();
        String a = nhapphantu.getText();
        String a1 = soluong.getText();
        int a2 = Integer.parseInt(a1);
        String[] b = null;
        b = a.split(" ");
        int[] c = new int[b.length];           
        for (int i =0; i < b.length;i++){
            c[i] = Integer.parseInt(b[i]);
        }
        for (int i = 0; i < c.length ; i++){
            d.mRoot = d.insert(d.mRoot, c[i]);
        }
        
       
        String xoa = xoatext.getText();
             a2 = a2-1;
            int xoa1 = Integer.parseInt(xoa);
            d.deleteNode(d.mRoot,xoa1 );
        
        
         String p ="";
        p = d.PostOder(d.mRoot, p);
//        System.out.print(p);
        String[] b1 = null;
        b1 = p.split(" ");
        String[] c1 = new String[a2];
        int j = a2-1;
        for (int i = b1.length-1; i >= b1.length-a2;i--){
            c1[j]=b1[i];
            j--;
            }
           String postoder="";
          for(int i = 0; i < a2 ;i++){
                postoder = postoder+ c1[i]+" ";
            }
        Post.setText(postoder);
        String pre = "";
        pre = d.PreOder(d.mRoot, pre);
        String[] bre = null;
        bre = pre.split(" ");
        String[] cre = new String[a2];
        int jre =a2-1;
        for (int ire = bre.length-1; ire >= bre.length-a2;ire--){
            cre[jre]=bre[ire];
            jre--;
            }
        String preoder ="";
          for(int ire = 0; ire < a2 ;ire++){
                preoder = preoder + cre[ire]+" ";
            }
         Pre.setText(preoder);
         String pIn ="";
        pIn = d.InOder(d.mRoot, pIn);
//        System.out.print(p);
        String[] bIn = null;
        bIn = pIn.split(" ");
        String[] cIn = new String[a2];
        int jIn =a2-1;
        for (int iIn = bIn.length-1; iIn >= bIn.length-a2;iIn--){
            cIn[jIn]=bIn[iIn];
            jIn--;
            }
        String Inoder="";
          for(int iIn = 0; iIn < a2 ;iIn++){
                Inoder=Inoder+ cIn[iIn]+" ";
            }
          In.setText(Inoder);
          String len = soluong.getText();
          int len1 = Integer.parseInt(len);
          soluong.setText(Integer.toString(len1-1));
//          String nhapphantuxoa = nhapphantu.getText();
//          String[] nhapphantuxoa1 = null;
//          nhapphantuxoa1 = nhapphantuxoa.split(" ");
////          for(int i = 0; i < nhapphantuxoa1.length; i++){
////              if(nhapphantuxoa1[i] == xoa);
////          }
//          int k=0;
//          
//          for (int i = 0; i < nhapphantuxoa1.length; i++) {
//            if (nhapphantuxoa1[i] != xoa) {
//                nhapphantuxoa1[k] = nhapphantuxoa1[i];
//                k++;
//            }
//          }
//          String temp2="";
//          for(int i = 0; i < nhapphantuxoa1.length;i++){
//              temp2 = temp2 + nhapphantuxoa1[i]+" ";
//          }
//         
//          timtext.setText(temp2);
//    
    String n1 = nhapphantu.getText();
    String xoa2 = xoatext.getText();
    String[] n2 = n1.split(" ");
    int k =0;
    for (int i =0; i < n2.length;i++){
        if(!n2[i].equals(xoa2)){
            n2[k] = n2[i];
            k++;
        }
    }
    String temp="";
    for(int i = 0; i < len1-1;i++){
        temp = temp + n2[i]+" ";
    }
    temp= temp.trim();
    nhapphantu.setText(temp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void timActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timActionPerformed
        // TODO add your handling code here:
         MyBST d = new MyBST();
        String a = nhapphantu.getText();
        String a1 = soluong.getText();
        int a2 = Integer.parseInt(a1);
        String[] b = null;
        b = a.split(" ");
        int[] c = new int[b.length];           
        for (int i =0; i < b.length;i++){
            c[i] = Integer.parseInt(b[i]);
        }
        for (int i = 0; i < c.length ; i++){
            d.mRoot = d.insert(d.mRoot, c[i]);
        }
        
       
//        if(xoa == "no"){
//           
//        }
//        else{
//             a2 = a2-1;
//            int xoa1 = Integer.parseInt(xoa);
//            d.deleteNode(d.mRoot,xoa1 );
//        }
//        
         String p ="";
        p = d.PostOder(d.mRoot, p);
//        System.out.print(p);
        String[] b1 = null;
        b1 = p.split(" ");
        String[] c1 = new String[a2];
        int j = a2-1;
        for (int i = b1.length-1; i >= b1.length-a2;i--){
            c1[j]=b1[i];
            j--;
            }
           String postoder="";
          for(int i = 0; i < a2 ;i++){
                postoder = postoder+ c1[i]+" ";
            }
        Post.setText(postoder);
        String pre = "";
        pre = d.PreOder(d.mRoot, pre);
        String[] bre = null;
        bre = pre.split(" ");
        String[] cre = new String[a2];
        int jre =a2-1;
        for (int ire = bre.length-1; ire >= bre.length-a2;ire--){
            cre[jre]=bre[ire];
            jre--;
            }
        String preoder ="";
          for(int ire = 0; ire < a2 ;ire++){
                preoder = preoder + cre[ire]+" ";
            }
         Pre.setText(preoder);
         String pIn ="";
        pIn = d.InOder(d.mRoot, pIn);
//        System.out.print(p);
        String[] bIn = null;
        bIn = pIn.split(" ");
        String[] cIn = new String[a2];
        int jIn =a2-1;
        for (int iIn = bIn.length-1; iIn >= bIn.length-a2;iIn--){
            cIn[jIn]=bIn[iIn];
            jIn--;
            }
        String Inoder="";
          for(int iIn = 0; iIn < a2 ;iIn++){
                Inoder=Inoder+ cIn[iIn]+" ";
            }
          In.setText(Inoder);
          String tim1 = timtext.getText();
          int tim2 = Integer.parseInt(tim1);
          if(d.searchBST(d.mRoot,tim2)!= null){
              timtext.setText("tim thay");
          }
          else{
              timtext.setText("khong thay");
          }
          
          
    }//GEN-LAST:event_timActionPerformed

    private void them1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_them1ActionPerformed
        // TODO add your handling code here:
        MyBST d = new MyBST();
        String a = nhapphantu.getText();
        String a1 = soluong.getText();
        int a2 = Integer.parseInt(a1);
        String[] b = null;
        b = a.split(" ");
        int[] c = new int[b.length];           
        for (int i =0; i < b.length;i++){
            c[i] = Integer.parseInt(b[i]);
        }
        for (int i = 0; i < c.length ; i++){
            d.mRoot = d.insert(d.mRoot, c[i]);
        }
        
       
//        if(xoa == "no"){
//           
//        }
//        else{
//             a2 = a2-1;
//            int xoa1 = Integer.parseInt(xoa);
//            d.deleteNode(d.mRoot,xoa1 );
//        }
//        
         String p ="";
        p = d.PostOder(d.mRoot, p);
//        System.out.print(p);
        String[] b1 = null;
        b1 = p.split(" ");
        String[] c1 = new String[a2];
        int j = a2-1;
        for (int i = b1.length-1; i >= b1.length-a2;i--){
            c1[j]=b1[i];
            j--;
            }
           String postoder="";
          for(int i = 0; i < a2 ;i++){
                postoder = postoder+ c1[i]+" ";
            }
        Post.setText(postoder);
        String pre = "";
        pre = d.PreOder(d.mRoot, pre);
        String[] bre = null;
        bre = pre.split(" ");
        String[] cre = new String[a2];
        int jre =a2-1;
        for (int ire = bre.length-1; ire >= bre.length-a2;ire--){
            cre[jre]=bre[ire];
            jre--;
            }
        String preoder ="";
          for(int ire = 0; ire < a2 ;ire++){
                preoder = preoder + cre[ire]+" ";
            }
         Pre.setText(preoder);
         String pIn ="";
        pIn = d.InOder(d.mRoot, pIn);
//        System.out.print(p);
        String[] bIn = null;
        bIn = pIn.split(" ");
        String[] cIn = new String[a2];
        int jIn =a2-1;
        for (int iIn = bIn.length-1; iIn >= bIn.length-a2;iIn--){
            cIn[jIn]=bIn[iIn];
            jIn--;
            }
        String Inoder="";
          for(int iIn = 0; iIn < a2 ;iIn++){
                Inoder=Inoder+ cIn[iIn]+" ";
            }
          In.setText(Inoder);
          String t1 = themtext.getText();
          String len = soluong.getText();
          int len1 = Integer.parseInt(len);
          soluong.setText(Integer.toString(len1+1));
          String n3 = nhapphantu.getText();
          n3 = n3+" "+t1;
          
          
            nhapphantu.setText(n3);
          
   
    
    
          
          
    }//GEN-LAST:event_them1ActionPerformed

    private void themtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_themtextActionPerformed
int Inoder =1;
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new NewJFrame().setVisible(true);
                JTextField tf = new JTextField();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField In;
    private javax.swing.JTextField Post;
    private javax.swing.JTextField Pre;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nhapphantu;
    private javax.swing.JTextField soluong;
    private javax.swing.JButton them;
    private javax.swing.JButton them1;
    private javax.swing.JTextField themtext;
    private javax.swing.JButton tim;
    private javax.swing.JTextField timtext;
    private javax.swing.JTextField xoatext;
    // End of variables declaration//GEN-END:variables
}
