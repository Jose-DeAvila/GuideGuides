/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuGuias;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jose De Avila
 */
public class Guia25 extends javax.swing.JFrame {

    JCheckBox jCheckBoxs[]= new JCheckBox[10];
    String vTextos[] = {"Rojo", "Verde", "Azul", "Gris", "Negro", "Blanco", "Turquesa", "Fucsia", "Azul Marino", "Amarillo"};
    String choosers[] = new String[vTextos.length];
    JLabel lbl2;
    
    public Guia25() {
        initComponents();
        creacionVentana();
    }
    
    public void creacionVentana(){
        this.setTitle("Ejemplo de vector de componentes");
        this.setSize(300,600);
        JLabel lbl1 = new JLabel();
        lbl1.setText("Escoge tus colores: ");
        lbl1.setBounds(10,10,300,20);
        this.getContentPane().add(lbl1);
        for(int i=0; i<jCheckBoxs.length; i++){
            jCheckBoxs[i] = new JCheckBox();
            jCheckBoxs[i].setText(vTextos[i]);
            jCheckBoxs[i].setBounds(10,35+30*i,100,20);
            this.getContentPane().add(jCheckBoxs[i]);
        }
        JButton btn = new JButton();
        btn.setText("Mostrar");
        btn.setBounds(10, 70+30*(jCheckBoxs.length-1),100,20);
        this.getContentPane().add(btn);
        JButton btn1 = new JButton();
        btn1.setText("Cantidad");
        btn1.setBounds(120, 70+30*(jCheckBoxs.length-1), 100, 20);
        this.getContentPane().add(btn1);
        JButton btnSalir = new JButton();
        btnSalir.setText("Volver");
        btnSalir.setBounds(10, 520, 100, 30);
        this.getContentPane().add(btnSalir);
        JLabel lbl3 = new JLabel();
        lbl3.setText("Colores seleccionados:");
        lbl3.setBounds(10,120+30*(jCheckBoxs.length-1), 250, 50);
        this.getContentPane().add(lbl3);
        lbl2 = new JLabel();
        lbl2.setText("");
        lbl2.setBounds(10,160+30*(jCheckBoxs.length-1), 250, 50);
        lbl2.setBorder(javax.swing.BorderFactory.createLineBorder(Color.black));
        this.getContentPane().add(lbl2);
        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnActionPerformed(evt);
            }
        });
        btn1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btn1ActionPerformed(evt);
            }
        });
        btnSalir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                btnSalirActionPerformed(evt);
            }
        });
    }
    
    public void btnSalirActionPerformed(ActionEvent evt){
        MenuPrincipal mp = new MenuPrincipal();
        mp.setVisible(true);
        this.dispose();
    }
    
    public void btn1ActionPerformed(ActionEvent evt){
        int aux=0;
        for(int i=0; i<jCheckBoxs.length; i++){
            if(jCheckBoxs[i].isSelected()){
                aux+=1;
            }
        }
        JOptionPane.showMessageDialog(null, "Hay "+aux+" elementos seleccionados.");
    }
    
    public void btnActionPerformed(ActionEvent evt){
        lbl2.setText("");
        for(int i=0; i<jCheckBoxs.length; i++){
            choosers[i]=null;
        }
        for(int i=0; i<jCheckBoxs.length;i++){
            if(jCheckBoxs[i].isSelected()){
                choosers[i]=jCheckBoxs[i].getText();
            }
        }
        for (int i=0; i<choosers.length;i++){
            if(choosers[i]!=null){
                lbl2.setText(lbl2.getText()+choosers[i]+" ");
            }
        }
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
            java.util.logging.Logger.getLogger(Guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guia25.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guia25().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
