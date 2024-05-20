package com.mycompany.calculadoraapp.Vistas;
import com.mycompany.calculadoraapp.Vistas.Conexion.Conexion;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class FramePrueba extends javax.swing.JFrame {

    public FramePrueba() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        placeLast = new javax.swing.JTextField();
        placeEcuacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        uno = new javax.swing.JButton();
        dos = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        cuatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        siete = new javax.swing.JButton();
        ocho = new javax.swing.JButton();
        nueve = new javax.swing.JButton();
        cero = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        abrirPare = new javax.swing.JButton();
        cerrarPare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Leelawadee", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora con SOAP");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        placeLast.setEditable(false);
        placeLast.setBackground(new java.awt.Color(204, 204, 204));
        placeLast.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        placeLast.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                placeLastFocusGained(evt);
            }
        });
        placeLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeLastActionPerformed(evt);
            }
        });

        placeEcuacion.setEditable(false);
        placeEcuacion.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        placeEcuacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                placeEcuacionKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(placeLast)
            .addComponent(placeEcuacion)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(placeLast, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(placeEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jPanel2KeyPressed(evt);
            }
        });

        uno.setText("1");
        uno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unoActionPerformed(evt);
            }
        });
        uno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                unoKeyPressed(evt);
            }
        });

        dos.setText("2");
        dos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dosActionPerformed(evt);
            }
        });

        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        cuatro.setText("4");
        cuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuatroActionPerformed(evt);
            }
        });

        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        siete.setText("7");
        siete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sieteActionPerformed(evt);
            }
        });

        ocho.setText("8");
        ocho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ochoActionPerformed(evt);
            }
        });

        nueve.setText("9");
        nueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nueveActionPerformed(evt);
            }
        });

        cero.setText("0");
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        cero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ceroKeyPressed(evt);
            }
        });

        sumar.setText("+");
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        restar.setText("-");
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        limpiar.setText("CE");
        limpiar.setToolTipText("");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        jButton1.setText("DEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        abrirPare.setText("(");
        abrirPare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirPareActionPerformed(evt);
            }
        });

        cerrarPare.setText(")");
        cerrarPare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarPareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(siete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(cuatro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(uno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dos, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ocho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nueve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(sumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abrirPare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarPare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(restar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dividir)
                    .addComponent(sumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicar)
                    .addComponent(restar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siete)
                    .addComponent(ocho)
                    .addComponent(nueve)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuatro)
                    .addComponent(cinco)
                    .addComponent(seis)
                    .addComponent(limpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dos)
                    .addComponent(uno)
                    .addComponent(tres)
                    .addComponent(abrirPare))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cero, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrarPare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
        if(!this.ecuacion.isEmpty()){
            char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
            if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                this.ecuacion += "+";
                placeEcuacion.setText(this.ecuacion);
            }
        }
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_sumarActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
        if(!this.ecuacion.isEmpty()){
            char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
            if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                this.ecuacion += "-";
                placeEcuacion.setText(this.ecuacion);
            }
        }
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_restarActionPerformed

    private void placeLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeLastActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeLastActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        this.ecuacion += "0";
        placeEcuacion.setText(this.ecuacion);
    }//GEN-LAST:event_ceroActionPerformed

    private void ceroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ceroKeyPressed
        
    }//GEN-LAST:event_ceroKeyPressed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        this.ecuacion += "3";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_tresActionPerformed

    private void cerrarPareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarPareActionPerformed
        this.ecuacion += "";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_cerrarPareActionPerformed

    private void unoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unoKeyPressed
        
    }//GEN-LAST:event_unoKeyPressed

    private void unoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unoActionPerformed
        this.ecuacion += "1";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_unoActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_1 || evt.getKeyCode()==KeyEvent.VK_NUMPAD1) {
            this.ecuacion += "1";
            placeEcuacion.setText(this.ecuacion);
        }
    }//GEN-LAST:event_formKeyPressed

    private void jPanel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel2KeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_1 || evt.getKeyCode()==KeyEvent.VK_NUMPAD1) {
            this.ecuacion += "1";
            placeEcuacion.setText(this.ecuacion);
        }
    }//GEN-LAST:event_jPanel2KeyPressed

    private void placeEcuacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_placeEcuacionKeyPressed
        System.out.println(evt.getKeyCode());
        switch (evt.getKeyCode()) {
            case KeyEvent.VK_0:
            case KeyEvent.VK_NUMPAD0:
                this.ecuacion += "0";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_1:
            case KeyEvent.VK_NUMPAD1:
                this.ecuacion += "1";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_2:
            case KeyEvent.VK_NUMPAD2:
                this.ecuacion += "2";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_3:
            case KeyEvent.VK_NUMPAD3:
                this.ecuacion += "3";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_4:
            case KeyEvent.VK_NUMPAD4:
                this.ecuacion += "4";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_5:
            case KeyEvent.VK_NUMPAD5:
                this.ecuacion += "5";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_6:
            case KeyEvent.VK_NUMPAD6:
                this.ecuacion += "6";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_7:
            case KeyEvent.VK_NUMPAD7:
                this.ecuacion += "7";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_8:
            case KeyEvent.VK_NUMPAD8:
                this.ecuacion += "8";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_9:
            case KeyEvent.VK_NUMPAD9:
                this.ecuacion += "9";
                placeEcuacion.setText(this.ecuacion);
                break;
            case KeyEvent.VK_ENTER:
                if(!this.ecuacion.isEmpty()){
                    ArrayList<String> separado = separateString(this.ecuacion);
                    int calculado = calcular(separado);
                    placeLast.setText(ecuacion);
                    placeEcuacion.setText(String.valueOf(calculado));
                    this.ecuacion = "";
                    placeEcuacion.requestFocus();
                }
                break;
            case KeyEvent.VK_DELETE:
                if(this.ecuacion.length() > 0){
                    this.ecuacion= this.ecuacion.substring(0, this.ecuacion.length() - 1);
                    placeEcuacion.setText(this.ecuacion);
                }   break;
            case KeyEvent.VK_BACK_SPACE:
                if(this.ecuacion.length() > 0){
                    this.ecuacion= this.ecuacion.substring(0, this.ecuacion.length() - 1);
                    placeEcuacion.setText(this.ecuacion);
                }   break;
            case 106:
                if(!this.ecuacion.isEmpty()){
                    char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
                    if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                        this.ecuacion += "*";
                        placeEcuacion.setText(this.ecuacion);
                    }
                }
                break;
            case 111:
                if(!this.ecuacion.isEmpty()){
                    char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
                    if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                        this.ecuacion += "/";
                        placeEcuacion.setText(this.ecuacion);
                    }
                }
                break;
            case 109:
                if(!this.ecuacion.isEmpty()){
                    char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
                    if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                        this.ecuacion += "-";
                        placeEcuacion.setText(this.ecuacion);
                    }
                }
                break;
            case 107:
                if(!this.ecuacion.isEmpty()){
                    char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
                    if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                        this.ecuacion += "+";
                        placeEcuacion.setText(this.ecuacion);
                    }
                }
                break;
        }
    }//GEN-LAST:event_placeEcuacionKeyPressed

    private void dosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosActionPerformed
        this.ecuacion += "2";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_dosActionPerformed

    private void cuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuatroActionPerformed
        this.ecuacion += "4";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_cuatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        this.ecuacion += "5";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        this.ecuacion += "6";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_seisActionPerformed

    private void sieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sieteActionPerformed
        this.ecuacion += "7";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_sieteActionPerformed

    private void ochoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ochoActionPerformed
        this.ecuacion += "8";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_ochoActionPerformed

    private void nueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nueveActionPerformed
        this.ecuacion += "9";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_nueveActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        if(!this.ecuacion.isEmpty()){
            char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
            if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                this.ecuacion += "*";
                placeEcuacion.setText(this.ecuacion);
            }
        }
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        if(!this.ecuacion.isEmpty()){
            char lastChar = this.ecuacion.charAt(this.ecuacion.length() - 1);
            if (lastChar != '+' && lastChar != '/' && lastChar != '*' && lastChar != '-') {
                this.ecuacion += "/";
                placeEcuacion.setText(this.ecuacion);
            }
        }
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_dividirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.ecuacion.length() > 0){
            this.ecuacion= this.ecuacion.substring(0, this.ecuacion.length() - 1);
            placeEcuacion.setText(this.ecuacion);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        this.ecuacion= "";
        placeEcuacion.setText(this.ecuacion);
    }//GEN-LAST:event_limpiarActionPerformed

    private void abrirPareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirPareActionPerformed
        this.ecuacion += "";
        placeEcuacion.setText(this.ecuacion);
        placeEcuacion.requestFocus();
    }//GEN-LAST:event_abrirPareActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        if(!this.ecuacion.isEmpty()){
            ArrayList<String> separado = separateString(this.ecuacion);
            int calculado = calcular(separado);
            placeLast.setText(ecuacion);
            placeEcuacion.setText(String.valueOf(calculado));
            this.ecuacion = "";
            placeEcuacion.requestFocus();
        }
    }//GEN-LAST:event_igualActionPerformed

    private void placeLastFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_placeLastFocusGained
        this.placeEcuacion.requestFocus();
    }//GEN-LAST:event_placeLastFocusGained

    
    public static ArrayList<String> separateString(String input) {
        ArrayList<String> result = new ArrayList<>();
        
        String placeholder = "";
        
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                placeholder += c;
            } else {
                result.add(placeholder);
                result.add(String.valueOf(c));
                placeholder = "";
            }
        }
        
        if (placeholder.length() > 0) {
            result.add(placeholder);
        }
        
        return result;
    }
    
    public int calcular(ArrayList<String> partes){
        int resultado = 0, intB = Integer.MAX_VALUE, index = 0;
        char operator = '\0';

        for (String parte : partes){
            if(isEntero(parte)){
                if(index == 0){
                    resultado = Integer.parseInt(parte);
                    index++;
                } else if(operator != '\0'){
                    intB = Integer.parseInt(parte);
                }
               
                if(intB < Integer.MAX_VALUE){
                    switch(operator){
                        case '+':
                            resultado = this.calcu.Suma(resultado, intB);
                            operator = '\0';
                            break;
                        case '-':
                            resultado = this.calcu.Resta(resultado, intB);
                            operator = '\0';
                            break;
                        case '/':
                            resultado = this.calcu.Dividir(resultado, intB);
                            operator = '\0';
                            break;
                        case '*':
                            resultado = this.calcu.Multiplicar(resultado, intB);
                            operator = '\0';
                            break;
                   }
               }
               
            }else{
               operator = parte.toCharArray()[0];
            }
        }
        
        
        return resultado;
    }
    
    public static boolean isEntero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
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
            java.util.logging.Logger.getLogger(FramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirPare;
    private javax.swing.JButton cero;
    private javax.swing.JButton cerrarPare;
    private javax.swing.JButton cinco;
    private javax.swing.JButton cuatro;
    private javax.swing.JButton dividir;
    private javax.swing.JButton dos;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton nueve;
    private javax.swing.JButton ocho;
    private javax.swing.JTextField placeEcuacion;
    private javax.swing.JTextField placeLast;
    private javax.swing.JButton restar;
    private javax.swing.JButton seis;
    private javax.swing.JButton siete;
    private javax.swing.JButton sumar;
    private javax.swing.JButton tres;
    private javax.swing.JButton uno;
    // End of variables declaration//GEN-END:variables
    private String ecuacion = "";
    private Conexion calcu = new Conexion();
    private int resultado;
}
