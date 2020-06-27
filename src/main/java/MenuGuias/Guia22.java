/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuGuias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Jose De Avila
 */
public class Guia22 extends javax.swing.JFrame {

    private JTextField txtNum1, txtNum2;

    public Guia22() {
        initComponents();
        creacionVentana();
    }
    
    public void creacionVentana(){
        this.setTitle("Programa Operaciones");
        this.setSize(400,300);
        this.setLocation(100,100);
        
        JLabel etiNum1 = new JLabel();
        etiNum1.setText("Numero 1:");
        etiNum1.setBounds(10, 10, 100, 20);
        this.getContentPane().add(etiNum1);
        
        JLabel etiNum2 = new JLabel();
        etiNum2.setText("Numero 2:");
        etiNum2.setBounds(10, 60, 100, 20);
        this.getContentPane().add(etiNum2);
        
        txtNum1 = new JTextField();
        txtNum1.setText("0");
        txtNum1.setBounds(110,10,100,30);
        this.getContentPane().add(txtNum1);
        
        txtNum2 = new JTextField();
        txtNum2.setText("0");
        txtNum2.setBounds(110,60,100,30);
        this.getContentPane().add(txtNum2);
        
        JButton btnSumar = new JButton();
        btnSumar.setText("Sumar");
        btnSumar.setBounds(10,120,100,20);
        this.getContentPane().add(btnSumar);
        
        JButton btnRestar = new JButton();
        btnRestar.setText("Restar");
        btnRestar.setBounds(130,120,100,20);
        this.getContentPane().add(btnRestar);
        
        JButton btnMultiplicar = new JButton();
        btnMultiplicar.setText("Multiplicar");
        btnMultiplicar.setBounds(250, 120, 100, 20);
        this.getContentPane().add(btnMultiplicar);
        
        JButton btnDividir = new JButton();
        btnDividir.setText("Dividir");
        btnDividir.setBounds(250, 160, 100, 20);
        this.getContentPane().add(btnDividir);
        
        JButton btnMod = new JButton();
        btnMod.setText("%");
        btnMod.setBounds(10, 160, 100, 20);
        this.getContentPane().add(btnMod);
        
        JButton btnLimpiar = new JButton();
        btnLimpiar.setText("C");
        btnLimpiar.setBounds(130, 160, 100, 20);
        this.getContentPane().add(btnLimpiar);
        
        JButton btnVolver = new JButton();
        btnVolver.setText("Volver");
        btnVolver.setBounds(10, 230, 100, 20);
        this.getContentPane().add(btnVolver);
        
        btnVolver.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               btnVolverActionPerformed(evt);
           } 
        });
        
        btnLimpiar.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent evt){
               btnLimpiarActionPerformed(evt);
           } 
        });
        
        btnMod.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnModActionPerformed(evt);
            }
        });
        
        btnDividir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnDividirActionPerformed(evt);
            }
        });
        
        btnMultiplicar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnMultiplicarActionPerformed(evt);
            }
        });
        
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
        
        btnRestar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent evt){
                btnRestarActionPerformed(evt);
            }
        });
    }
    
    private void btnSumarActionPerformed(ActionEvent evt){
        double a,b,c;
        
        a=Double.parseDouble(txtNum1.getText());
        b=Double.parseDouble(txtNum2.getText());
        c=a+b;
        JOptionPane.showMessageDialog(null, "La suma es: "+c);
    }
    
    private void btnRestarActionPerformed(ActionEvent evt){
        double a,b,c;
        
        a=Double.parseDouble(txtNum1.getText());
        b=Double.parseDouble(txtNum2.getText());
        c=a-b;
        JOptionPane.showMessageDialog(null, "La resta es: " + c);
    }
    
    private void btnMultiplicarActionPerformed(ActionEvent evt){
        double a,b,c;
        
        a=Double.parseDouble(txtNum1.getText());
        b=Double.parseDouble(txtNum2.getText());
        c=a*b;
        JOptionPane.showMessageDialog(null, "La multiplicación es:" + c);
    }
    
    private void btnDividirActionPerformed(ActionEvent evt){
        double a,b,c;
        a=Double.parseDouble(txtNum1.getText());
        b=Double.parseDouble(txtNum2.getText());
        c=a/b;
        JOptionPane.showMessageDialog(null, "La división es: "+ c);
    }
    
    private void btnModActionPerformed(ActionEvent evt){
        double a,b,c;
        a=Double.parseDouble(txtNum1.getText());
        b=Double.parseDouble(txtNum2.getText());
        c=a%b;
        JOptionPane.showMessageDialog(null, "El mod es: "+c);
    }
    
    private void btnLimpiarActionPerformed(ActionEvent evt){
        txtNum1.setText("");
        txtNum2.setText("");
    }
    
    private void btnVolverActionPerformed(ActionEvent evt){
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Guia22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia22.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
