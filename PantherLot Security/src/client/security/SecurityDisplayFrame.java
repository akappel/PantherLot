/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SecurityDisplayFrame.java
 *
 * Created on Jul 30, 2011, 5:16:26 AM
 */
package client.security;

/**
 *
 * @author Abraham
 */
public class SecurityDisplayFrame extends javax.swing.JFrame {

    /** Creates new form SecurityDisplayFrame */
    public SecurityDisplayFrame() {
        initComponents();
        textArea.setEditable(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setEditable(false);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        titleLabel.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        titleLabel.setText("PantherLot Interactive Garage Monitor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SecurityDisplayFrame().setVisible(true);
            }
        });
    }
    
    /**
     * updates the frame by changing the text area content
     * @param text the new text that will be displayed in the frame
     */
    public void updateTextArea(String text)
    {
        textArea.setText(text);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
