/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bookshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class Billing extends javax.swing.JFrame {

    /**
     * Creates new form Billing
     */
    public Billing() {
        initComponents();
        DisplayBooks();
        BooknameTb.setEditable(false);
        PriceTb.setEditable(false);
    }

    public Billing(String uname){
        initComponents();
        Userlbl.setText(uname);
        DisplayBooks();
        BooknameTb.setEditable(false);
        PriceTb.setEditable(false);
    }
    Connection Con = null;
    Statement st = null;
    ResultSet Rs = null;
    
    private void DisplayBooks(){
        try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root", "Akku1805");
            st = Con.createStatement();
            Rs = st.executeQuery("select * from bookshop.book");
            BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e){
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        Userlbl = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        PriceTb = new javax.swing.JTextField();
        BooknameTb = new javax.swing.JTextField();
        UsernameTb = new javax.swing.JTextField();
        BillNum = new javax.swing.JTextField();
        AddtobillBtn = new javax.swing.JButton();
        PrintBtn = new javax.swing.JButton();
        RsestBtn = new javax.swing.JButton();
        labelField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BooksTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BillTxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Totallb = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        QuantityTb1 = new javax.swing.JTextField();
        ClosebtN = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/icon_small.PNG"))); // NOI18N
        User.setText("jLabel4");
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
        });

        Userlbl.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        Userlbl.setText("Users");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Book Name");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Quantity");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setText("Price");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        PriceTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        PriceTb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PriceTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceTbActionPerformed(evt);
            }
        });

        BooknameTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BooknameTb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BooknameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BooknameTbActionPerformed(evt);
            }
        });

        UsernameTb.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        UsernameTb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        UsernameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameTbActionPerformed(evt);
            }
        });

        BillNum.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        BillNum.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BillNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNumActionPerformed(evt);
            }
        });

        AddtobillBtn.setText("Add To Bill");
        AddtobillBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddtobillBtnMouseClicked(evt);
            }
        });
        AddtobillBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtobillBtnActionPerformed(evt);
            }
        });

        PrintBtn.setText("Print");
        PrintBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrintBtnMouseClicked(evt);
            }
        });
        PrintBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBtnActionPerformed(evt);
            }
        });

        RsestBtn.setText("Reset");
        RsestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RsestBtnMouseClicked(evt);
            }
        });
        RsestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RsestBtnActionPerformed(evt);
            }
        });

        labelField.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        labelField.setText("User Name");
        labelField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Manage Books");

        logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\Book\\logout.PNG")); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        BooksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Category", "Quantity", "Price"
            }
        ));
        BooksTable.setRowHeight(25);
        BooksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BooksTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BooksTable);

        BillTxt.setColumns(20);
        BillTxt.setRows(5);
        jScrollPane3.setViewportView(BillTxt);

        jLabel2.setText("Books List");

        jLabel4.setText("Books Bill");

        Totallb.setText("Total ");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setText("Bill ID");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        QuantityTb1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        QuantityTb1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        QuantityTb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantityTb1ActionPerformed(evt);
            }
        });

        ClosebtN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bookshop/Close_new_new.PNG"))); // NOI18N
        ClosebtN.setPreferredSize(new java.awt.Dimension(100, 70));
        ClosebtN.setRequestFocusEnabled(false);
        ClosebtN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClosebtNMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(AddtobillBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(RsestBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(labelField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UsernameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BooknameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QuantityTb1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2)))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BillNum)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(PrintBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(226, 226, 226)
                                .addComponent(Totallb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Userlbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(197, 197, 197))
                    .addComponent(ClosebtN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ClosebtN, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(Totallb)
                        .addGap(18, 18, 18)
                        .addComponent(PrintBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Userlbl)
                            .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(BooknameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(labelField)
                                                    .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(UsernameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addComponent(PriceTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BillNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(QuantityTb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddtobillBtn)
                                    .addComponent(RsestBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)
                                .addGap(5, 5, 5)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4)))
                .addGap(352, 352, 352))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int Stock = 0;
    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        new Billing().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UserMouseClicked

    private void PriceTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceTbActionPerformed

    private void BooknameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BooknameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BooknameTbActionPerformed

    private void UsernameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameTbActionPerformed

    private void BillNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNumActionPerformed

    private void SaveBill(){
       if(QuantityTb1.getText().isEmpty() || UsernameTb.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this,"missing Information");
        }
        else{
        try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root", "Akku1805");
                PreparedStatement add = Con.prepareStatement("insert into bill values(?,?,?,?)");
                add.setInt(1,Integer.valueOf(BillNum.getText()));
                add.setString(2, Userlbl.getText());
                add.setString(3, UsernameTb.getText());
                add.setDouble(4, Double.valueOf(Total));
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this,"Bill saved");
            }
            catch(Exception e){
                e.printStackTrace();
            }
       }
    }
    
    private void Reset(){
        BooknameTb.setText("");
        PriceTb.setText("");
        BillNum.setText("");
        UsernameTb.setText("");
        BillTxt.setText("");
        i=0;
        Totallb.setText("Total ");
        
    }
    int i;
    double Total = 0;
    double grandTotal = 0;
    
    private void AddtobillBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddtobillBtnMouseClicked
        if(QuantityTb1.getText().isEmpty() || BooknameTb.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Information");
        }  
        
        else if(Integer.valueOf(QuantityTb1.getText()) > Stock){
            JOptionPane.showMessageDialog(this, "No Enough Books in stock");
        }
        else{
            i++;
            Total = Double.valueOf(PriceTb.getText())*Integer.valueOf(QuantityTb1.getText());
            if(i==1){
                BillTxt.setText(BillTxt.getText() + " \t********************* BOOK BILL ************************\n\nSL.NO\tPRODUCT    \tPRICE       QUANTITY    TOTAL\n"+i+"\t"+ BooknameTb.getText()+"        "+ PriceTb.getText()+"        " + QuantityTb1.getText() +"             "+Total +"\n");
            }
            else{
                BillTxt.setText(BillTxt.getText() + i + "\t" + BooknameTb.getText()+"        "+ PriceTb.getText()+"        " + QuantityTb1.getText() + "             "+ Total +"\n");
            }
            grandTotal = grandTotal + Total;
            System.out.println(grandTotal);
            Totallb.setText("Rs "+ grandTotal); 
            UpdateBooks();
    }
    }
    int BId;
    
    private void UpdateBooks(){
      int newQuantity = Stock - Integer.valueOf(QuantityTb1.getText());
      try{
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root", "Akku1805");
                String Query = "Update bookshop.book set Quantity="+newQuantity+" where BId = "+BId ;
                Statement Delete = Con.createStatement();
                Delete.executeUpdate(Query);
                JOptionPane.showMessageDialog(this,"Books Updated");
                DisplayBooks();
                //Reset();
            }
            catch(Exception e){
                e.printStackTrace();
            }  
      
    }//GEN-LAST:event_AddtobillBtnMouseClicked

    private void AddtobillBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtobillBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddtobillBtnActionPerformed

    private void countRow(){
       try{
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookshop","root", "Akku1805");
            st = Con.createStatement();
            Rs = st.executeQuery("select * from bill where order by BNUM DESC FETCH FIRST ROW ONLY");
            BooksTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e){
        }
    }
    
    
    private void PrintBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrintBtnMouseClicked
        try{
            BillTxt.print();
        }
        catch(Exception ex){
            
        }
        SaveBill();
        Reset();
        i=0;
    }//GEN-LAST:event_PrintBtnMouseClicked

    private void PrintBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrintBtnActionPerformed

    private void RsestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RsestBtnMouseClicked
       Reset();
    }//GEN-LAST:event_RsestBtnMouseClicked

    private void RsestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RsestBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RsestBtnActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    
    private void BooksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksTableMouseClicked
        DefaultTableModel model =(DefaultTableModel)BooksTable.getModel();
        int MyIndex = BooksTable.getSelectedRow();
        BId = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        BooknameTb.setText(model.getValueAt(MyIndex, 1).toString());
        Stock = Integer.valueOf(model.getValueAt(MyIndex ,4).toString());
        PriceTb.setText(model.getValueAt(MyIndex, 5).toString());
    }//GEN-LAST:event_BooksTableMouseClicked

    private void QuantityTb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuantityTb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuantityTb1ActionPerformed

    private void ClosebtNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClosebtNMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ClosebtNMouseClicked

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddtobillBtn;
    private javax.swing.JTextField BillNum;
    private javax.swing.JTextArea BillTxt;
    private javax.swing.JTextField BooknameTb;
    private javax.swing.JTable BooksTable;
    private javax.swing.JLabel ClosebtN;
    private javax.swing.JTextField PriceTb;
    private javax.swing.JButton PrintBtn;
    private javax.swing.JTextField QuantityTb1;
    private javax.swing.JButton RsestBtn;
    private javax.swing.JLabel Totallb;
    private javax.swing.JLabel User;
    private javax.swing.JLabel Userlbl;
    private javax.swing.JTextField UsernameTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel labelField;
    private javax.swing.JLabel logout;
    // End of variables declaration//GEN-END:variables
}
