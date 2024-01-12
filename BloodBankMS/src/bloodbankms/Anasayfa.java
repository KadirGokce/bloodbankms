package bloodbankms;

public class Anasayfa extends javax.swing.JFrame {

    public Anasayfa() {
    initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kangirisButon = new javax.swing.JButton();
        hastaneButon = new javax.swing.JButton();
        kancikisiButon = new javax.swing.JButton();
        kanmiktariButon = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİN");

        kangirisButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kangirisButon.setText("KAN GİRİŞİ");
        kangirisButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kangirisButonActionPerformed(evt);
            }
        });

        hastaneButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        hastaneButon.setText("HASTANELER");
        hastaneButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaneButonActionPerformed(evt);
            }
        });

        kancikisiButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kancikisiButon.setText("KAN ÇIKIŞI");
        kancikisiButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kancikisiButonActionPerformed(evt);
            }
        });

        kanmiktariButon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kanmiktariButon.setText("KAN MİKTARI");
        kanmiktariButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kanmiktariButonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kangirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hastaneButon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kancikisiButon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kanmiktariButon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kangirisButon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kancikisiButon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hastaneButon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kanmiktariButon, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hastaneButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaneButonActionPerformed
    Hastaneler frame = new Hastaneler();
        frame.setVisible(true);
        this.hide();        
    }//GEN-LAST:event_hastaneButonActionPerformed

    private void kangirisButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kangirisButonActionPerformed
        KanGirisi frame = new KanGirisi();
        frame.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kangirisButonActionPerformed

    private void kancikisiButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kancikisiButonActionPerformed
        KanCikisi frame = new KanCikisi();
        frame.setVisible(true);
        this.hide();        
    }//GEN-LAST:event_kancikisiButonActionPerformed

    private void kanmiktariButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kanmiktariButonActionPerformed
        KanMiktari frame = new KanMiktari();
        frame.setVisible(true);
        this.hide();
    }//GEN-LAST:event_kanmiktariButonActionPerformed

   
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Anasayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Anasayfa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hastaneButon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton kancikisiButon;
    private javax.swing.JButton kangirisButon;
    private javax.swing.JButton kanmiktariButon;
    // End of variables declaration//GEN-END:variables
}
