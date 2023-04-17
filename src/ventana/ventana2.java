
package ventana;

import java.awt.Color; 
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import ejercicio19.Equilatero;

public class ventana2 extends javax.swing.JFrame  {
    int xMouse, yMouse;
    DecimalFormat Fdeci =new DecimalFormat("#.00");
    public ventana2() {
        initComponents();
        this.setLocationRelativeTo(null);   //centrar panel en la pantalla
        
    }
    
    public static boolean ValidarNumero(String datos){
        
        return datos.matches("[0-9]");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_background = new javax.swing.JPanel();
        barraUP = new javax.swing.JPanel();
        exit = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        lbl_title_ejercicio40 = new javax.swing.JLabel();
        lbl_valorLado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panel_calcular = new javax.swing.JPanel();
        lbl_calcular = new javax.swing.JLabel();
        panel_borrar = new javax.swing.JPanel();
        lbl_borrar = new javax.swing.JLabel();
        txt_lado = new javax.swing.JTextField();
        lbl_valorLado1 = new javax.swing.JLabel();
        lbl_bourder = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        panel_background.setBackground(new java.awt.Color(211, 208, 201));
        panel_background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraUP.setBackground(new java.awt.Color(142, 57, 70));
        barraUP.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraUPMouseDragged(evt);
            }
        });
        barraUP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraUPMousePressed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(142, 57, 70));

        lbl_exit.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbl_exit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setText("X");
        lbl_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraUPLayout = new javax.swing.GroupLayout(barraUP);
        barraUP.setLayout(barraUPLayout);
        barraUPLayout.setHorizontalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraUPLayout.setVerticalGroup(
            barraUPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraUPLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_background.add(barraUP, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 30));

        lbl_title_ejercicio40.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        lbl_title_ejercicio40.setForeground(new java.awt.Color(0, 0, 0));
        lbl_title_ejercicio40.setText("Ejercicio 19");
        panel_background.add(lbl_title_ejercicio40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 146, -1));

        lbl_valorLado.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado.setText("Triángulo equilátero");
        panel_background.add(lbl_valorLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 170, 40));
        panel_background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 210, 20));

        panel_calcular.setBackground(new java.awt.Color(142, 57, 70));
        panel_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_calcularMouseEntered(evt);
            }
        });

        lbl_calcular.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_calcular.setForeground(new java.awt.Color(255, 255, 255));
        lbl_calcular.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_calcular.setText("Calcular");
        lbl_calcular.setToolTipText("");
        lbl_calcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_calcular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_calcularMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_calcularLayout = new javax.swing.GroupLayout(panel_calcular);
        panel_calcular.setLayout(panel_calcularLayout);
        panel_calcularLayout.setHorizontalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_calcularLayout.setVerticalGroup(
            panel_calcularLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_calcular, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_background.add(panel_calcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        panel_borrar.setBackground(new java.awt.Color(142, 57, 70));
        panel_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_borrarMouseEntered(evt);
            }
        });

        lbl_borrar.setFont(new java.awt.Font("Bahnschrift", 1, 18)); // NOI18N
        lbl_borrar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_borrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_borrar.setText("Borrar");
        lbl_borrar.setToolTipText("");
        lbl_borrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbl_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_borrarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_borrarLayout = new javax.swing.GroupLayout(panel_borrar);
        panel_borrar.setLayout(panel_borrarLayout);
        panel_borrarLayout.setHorizontalGroup(
            panel_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        panel_borrarLayout.setVerticalGroup(
            panel_borrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbl_borrar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        panel_background.add(panel_borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        txt_lado.setBackground(new java.awt.Color(255, 255, 255));
        txt_lado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txt_lado.setForeground(new java.awt.Color(0, 0, 0));
        txt_lado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txt_lado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_ladoMousePressed(evt);
            }
        });
        txt_lado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ladoActionPerformed(evt);
            }
        });
        txt_lado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ladoKeyTyped(evt);
            }
        });
        panel_background.add(txt_lado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 130, 20));

        lbl_valorLado1.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        lbl_valorLado1.setForeground(new java.awt.Color(0, 0, 0));
        lbl_valorLado1.setText("Ingrese el valor del lado:");
        panel_background.add(lbl_valorLado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 40));

        lbl_bourder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(142, 57, 70), 4));
        lbl_bourder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_background.add(lbl_bourder, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseClicked
        this.dispose();        //esta ventana se cierra
    }//GEN-LAST:event_lbl_exitMouseClicked

    private void lbl_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseEntered
        exit.setBackground(new Color(111,45,54));        /// cambio de color cuando el cursor entra del recuadro de la x
        //lbl_exit.setForeground(Color.white);
    }//GEN-LAST:event_lbl_exitMouseEntered

    private void lbl_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMouseExited
        exit.setBackground(new Color(142, 57, 70));     // cambio de color cuando el cursor sale del recuadro de la x
        // lbl_exit.setForeground(Color.black);
    }//GEN-LAST:event_lbl_exitMouseExited

    private void barraUPMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraUPMouseDragged

    private void barraUPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraUPMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraUPMousePressed

    private void lbl_calcularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseClicked
        //ejecucion de la clase exercise19
        String titles;
        titles = "Ejercicio 19";
        
        double lado,perimetro,altura,area;
        
        lado = Double.parseDouble(txt_lado.getText());          //se calcula el perimetro, altura y area en base 
        perimetro = (Equilatero.Calcular_perimetro(lado));        // a lo capturado en la variable lado
        altura = (Equilatero.Calcular_altura(lado));
        area = (Equilatero.Calcular_area(lado));
        
        
        JOptionPane.showMessageDialog(null,         //mensaje de respuesta al boton calcular
                "Perimetro: "+Fdeci.format(perimetro)+
                "\nAltura: "+Fdeci.format(altura)+
                "\nArea: "+Fdeci.format(area)
                , titles, JOptionPane.INFORMATION_MESSAGE);
        
            
    }//GEN-LAST:event_lbl_calcularMouseClicked

    private void lbl_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseEntered
        panel_calcular.setBackground(new Color(111,45,54));     // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_calcularMouseEntered

    private void lbl_calcularMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_calcularMouseExited
        panel_calcular.setBackground(new Color(142, 57, 70));      // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_calcularMouseExited

    private void panel_calcularMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_calcularMouseEntered

    }//GEN-LAST:event_panel_calcularMouseEntered

    private void lbl_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseClicked
        txt_lado.setText("");   //borra las cajas de texto
        
    }//GEN-LAST:event_lbl_borrarMouseClicked

    private void lbl_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseEntered
        panel_borrar.setBackground(new Color(111,45,54));       // cambio de color cuando el cursor entra del recuadro
    }//GEN-LAST:event_lbl_borrarMouseEntered

    private void lbl_borrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_borrarMouseExited
        panel_borrar.setBackground(new Color(142, 57, 70));     // cambio de color cuando el cursor sale del recuadro
    }//GEN-LAST:event_lbl_borrarMouseExited

    private void panel_borrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_borrarMouseEntered

    }//GEN-LAST:event_panel_borrarMouseEntered

    private void txt_ladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ladoActionPerformed
        
        
    }//GEN-LAST:event_txt_ladoActionPerformed

    private void txt_ladoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ladoKeyTyped
        //obligar a escribir solo números y un punto
        char caracter = evt.getKeyChar();
        if(((caracter < '0' || caracter > '9'))
        && (caracter != KeyEvent.VK_BACK_SPACE)
        && (caracter != '.' || txt_lado.getText().contains("."))) {
            
            evt.consume();
        }
    }//GEN-LAST:event_txt_ladoKeyTyped

    private void txt_ladoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_ladoMousePressed
    
        
        
        
                        
       
    }//GEN-LAST:event_txt_ladoMousePressed

  
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraUP;
    private javax.swing.JPanel exit;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbl_borrar;
    private javax.swing.JLabel lbl_bourder;
    private javax.swing.JLabel lbl_calcular;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JLabel lbl_title_ejercicio40;
    private javax.swing.JLabel lbl_valorLado;
    private javax.swing.JLabel lbl_valorLado1;
    private javax.swing.JPanel panel_background;
    private javax.swing.JPanel panel_borrar;
    private javax.swing.JPanel panel_calcular;
    private javax.swing.JTextField txt_lado;
    // End of variables declaration//GEN-END:variables

}