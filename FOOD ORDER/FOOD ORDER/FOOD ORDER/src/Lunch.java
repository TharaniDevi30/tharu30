
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Lunch extends javax.swing.JFrame {

    /**
     * Creates new form frame3
     */
    public Lunch() {
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

        jRadioButton7 = new javax.swing.JRadioButton();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l111 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        chapathi = new javax.swing.JComboBox<>();
        ricen = new javax.swing.JComboBox<>();
        canndi = new javax.swing.JComboBox<>();
        Order = new javax.swing.JButton();
        brioche = new javax.swing.JComboBox<>();
        Frittata = new javax.swing.JComboBox<>();
        congee = new javax.swing.JComboBox<>();
        dryn = new javax.swing.JComboBox<>();
        dosa = new javax.swing.JComboBox<>();
        pori = new javax.swing.JComboBox<>();

        jRadioButton7.setText("jRadioButton7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(204, 0, 204));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("LUNCH");

        l2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 102, 0));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("INDIA");

        l3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 51, 0));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("CHINESE");

        l4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 51, 0));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("ITALIAN");

        l5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l5.setText("Briyani - 50");

        l6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l6.setText("Thali - 60");

        l7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l7.setText("Puleo - 70");

        l8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l8.setText("Hot Spicy soup - 50");

        l9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l9.setText("Chicken Burger - 55");

        l10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l10.setText("Sichuan pork - 70");

        l111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l111.setText("Pizza - 80");

        l12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l12.setText("Milan - 90");

        l13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        l13.setText("Gelato - 75");

        chapathi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        ricen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        canndi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        Order.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        Order.setText("ORDER");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        brioche.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        Frittata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        congee.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        dryn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        dosa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        pori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quantity", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chapathi, 0, 98, Short.MAX_VALUE)
                                    .addComponent(dosa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(l10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(l8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ricen, 0, 81, Short.MAX_VALUE)
                                    .addComponent(congee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dryn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(canndi, 0, 85, Short.MAX_VALUE)
                            .addComponent(brioche, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Frittata, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(l1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(l3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chapathi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ricen, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l111, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(canndi, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brioche, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(congee, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pori, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dosa, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(Frittata, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(l13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dryn))
                .addGap(46, 46, 46)
                .addComponent(Order, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        // TODO add your handling code here:
        String c=(String) chapathi.getSelectedItem();
        String p=(String) pori.getSelectedItem();
        String d=(String) dosa.getSelectedItem();
        String rn=(String) ricen.getSelectedItem();
        String cg=(String) congee.getSelectedItem();
        String dn=(String) dryn.getSelectedItem();
        String ca=(String) canndi.getSelectedItem();
        String br=(String) brioche.getSelectedItem();
        String fr=(String) Frittata.getSelectedItem();
        System.out.println(c);
        try{  
            Class.forName("org.apache.derby.jdbc.ClientDriver");  
            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/Order","tharani","tharani");   
           if (con != null) {
                System.out.println("Connected to the database");
            }
           if(c.length()==8 && p.length()==8 && d.length()==8 && rn.length()==8 && fr.length()==8 && cg.length()==8 && dn.length()==8 && ca.length()==8 && br.length()==8 )
           {
               JOptionPane.showMessageDialog(null, "Choose dish");
           }
           else
           {
               int sum=0;
               if(c.length()!=8)
               {
                   int temp=Integer.parseInt(c);
                   sum=sum+temp*50;
               }
               if(p.length()!=8)
               {
                   int temp=Integer.parseInt(p);
                   sum=sum+temp*60;
               }
               if(d.length()!=8)
               {
                   int temp=Integer.parseInt(d);
                   sum=sum+temp*70;
               }
               if(rn.length()!=8)
               {
                   int temp=Integer.parseInt(rn);
                   sum=sum+temp*50;
               }
               if(cg.length()!=8)
               {
                   int temp=Integer.parseInt(cg);
                   sum=sum+temp*55;
               }
               if(dn.length()!=8)
               {
                   int temp=Integer.parseInt(dn);
                   sum=sum+temp*70;
               }
               if(ca.length()!=8)
               {
                   int temp=Integer.parseInt(ca);
                   sum=sum+temp*80;
               }
               if(br.length()!=8)
               {
                   int temp=Integer.parseInt(br);
                   sum=sum+temp*90;
               }
               if(fr.length()!=8)
               {
                   int temp=Integer.parseInt(fr);
                   sum=sum+temp*75;
               }
               System.out.println(sum);
               String price=Integer.toString(sum);
               PreparedStatement st=con.prepareStatement("select * from signin");
                ResultSet rs = st.executeQuery();
                if(rs.next())
                {
                    
                    String phn1=rs.getString(1);
                    PreparedStatement preparedStmt1 = con.prepareStatement("delete from dish where phn=?");
                    preparedStmt1.setString(1, phn1);
                    preparedStmt1.execute();
                    
                    PreparedStatement preparedStmt = con.prepareStatement("insert into dish(phn,type,price)"+"values(?,?,?)");
                    preparedStmt.setString (1, phn1);
                    preparedStmt.setString (2, "lunch");
                    preparedStmt.setString (3, price);
                    preparedStmt.execute();
                    JOptionPane.showMessageDialog(null, "Ordered");
                    this.setVisible(false);
                    new Bill().setVisible(true);
                }
           }
           
           
            //System.out.println("Connection Established Successfull and the DATABASE NAME IS:" + con.getMetaData().getDatabaseProductName());
        }
        catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            //ex.printStackTrace();
        }
        catch (ClassNotFoundException ex) {
            System.out.println("Could not find database driver class");
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_OrderActionPerformed

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
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Breakfast.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lunch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Frittata;
    private javax.swing.JButton Order;
    private javax.swing.JComboBox<String> brioche;
    private javax.swing.JComboBox<String> canndi;
    private javax.swing.JComboBox<String> chapathi;
    private javax.swing.JComboBox<String> congee;
    private javax.swing.JComboBox<String> dosa;
    private javax.swing.JComboBox<String> dryn;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l111;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JComboBox<String> pori;
    private javax.swing.JComboBox<String> ricen;
    // End of variables declaration//GEN-END:variables
}
