
import java.awt.Color;
import java.util.Set;
import javax.swing.JOptionPane;

public class RedForm extends javax.swing.JFrame {
    int xMouse, yMouse;
    private Grafo grafo;
    private Usuario usuario;
    public RedForm() {
        grafo = new Grafo();
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        salirPANEL = new javax.swing.JPanel();
        salirLBL = new javax.swing.JLabel();
        crearLBL = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        agregarTXT = new javax.swing.JTextField();
        nombreprincipalLBL = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        nombreprincipalTXT = new javax.swing.JTextField();
        mostrarrelacionesLBL = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        mostrarrelacionesTXT = new javax.swing.JTextField();
        anadirusuarioLBL = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        anadirusuarioTXT = new javax.swing.JTextField();
        anadirBTN = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        buscarbfsBTN = new javax.swing.JButton();
        crearBTN1 = new javax.swing.JButton();
        buscardfsBTN = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        icono = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diseño sin título (4).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setLocation(new java.awt.Point(450, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(700, 550));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        header.setBackground(new java.awt.Color(153, 153, 153));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Oswald", 3, 24)); // NOI18N
        jLabel2.setText("RED SOCIAL BASICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 60));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 50));

        salirPANEL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirPANELMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirPANELMouseExited(evt);
            }
        });

        salirLBL.setFont(new java.awt.Font("Oswald", 0, 18)); // NOI18N
        salirLBL.setText(" SALIR");
        salirLBL.setToolTipText("");
        salirLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirLBL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirLBLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirLBLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirLBLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout salirPANELLayout = new javax.swing.GroupLayout(salirPANEL);
        salirPANEL.setLayout(salirPANELLayout);
        salirPANELLayout.setHorizontalGroup(
            salirPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, salirPANELLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salirLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        salirPANELLayout.setVerticalGroup(
            salirPANELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salirLBL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(615, Short.MAX_VALUE)
                .addComponent(salirPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salirPANEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 700, 60));

        crearLBL.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        crearLBL.setText("CREAR USUARIO");
        background.add(crearLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 30));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 90, 10));

        agregarTXT.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        agregarTXT.setForeground(new java.awt.Color(153, 153, 153));
        agregarTXT.setText("Nombre de usuario que desea crear");
        agregarTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                agregarTXTMousePressed(evt);
            }
        });
        agregarTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTXTActionPerformed(evt);
            }
        });
        background.add(agregarTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 320, -1));

        nombreprincipalLBL.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        nombreprincipalLBL.setText("NOMBRE DE USUARIO");
        background.add(nombreprincipalLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 110, 10));

        nombreprincipalTXT.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        nombreprincipalTXT.setForeground(new java.awt.Color(153, 153, 153));
        nombreprincipalTXT.setText("Nombre de usuario al cual le quiere agregar un amigo");
        nombreprincipalTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombreprincipalTXTMousePressed(evt);
            }
        });
        nombreprincipalTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreprincipalTXTActionPerformed(evt);
            }
        });
        background.add(nombreprincipalTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 320, -1));

        mostrarrelacionesLBL.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        mostrarrelacionesLBL.setText("RELACIONES DE USUARIO");
        background.add(mostrarrelacionesLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, 30));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 130, 10));

        mostrarrelacionesTXT.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        mostrarrelacionesTXT.setForeground(new java.awt.Color(153, 153, 153));
        mostrarrelacionesTXT.setText("Nombre del usuario del cual desea ver sus releaciones");
        mostrarrelacionesTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mostrarrelacionesTXTMousePressed(evt);
            }
        });
        mostrarrelacionesTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarrelacionesTXTActionPerformed(evt);
            }
        });
        background.add(mostrarrelacionesTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 320, -1));

        anadirusuarioLBL.setFont(new java.awt.Font("Oswald", 0, 14)); // NOI18N
        anadirusuarioLBL.setText("AÑADIR USUARIO");
        background.add(anadirusuarioLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 10));

        anadirusuarioTXT.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        anadirusuarioTXT.setForeground(new java.awt.Color(153, 153, 153));
        anadirusuarioTXT.setText("Nombre de usuario el cual desea agregar");
        anadirusuarioTXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                anadirusuarioTXTMousePressed(evt);
            }
        });
        anadirusuarioTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirusuarioTXTActionPerformed(evt);
            }
        });
        background.add(anadirusuarioTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 320, -1));

        anadirBTN.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        anadirBTN.setText("AÑADIR AMIGO");
        anadirBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        anadirBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirBTNActionPerformed(evt);
            }
        });
        background.add(anadirBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 100, 30));

        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 650, 10));

        buscarbfsBTN.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        buscarbfsBTN.setText("BUSCAR MEDIANTE BFS ");
        buscarbfsBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarbfsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbfsBTNActionPerformed(evt);
            }
        });
        background.add(buscarbfsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 360, 140, 20));

        crearBTN1.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        crearBTN1.setText("CREAR");
        crearBTN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBTN1ActionPerformed(evt);
            }
        });
        background.add(crearBTN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 90, 20));

        buscardfsBTN.setFont(new java.awt.Font("Oswald", 0, 12)); // NOI18N
        buscardfsBTN.setText("BUSCAR MEDIANTE DFS");
        buscardfsBTN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscardfsBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscardfsBTNActionPerformed(evt);
            }
        });
        background.add(buscardfsBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 400, 140, 20));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        background.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 650, 10));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Diseño sin título (4).png"))); // NOI18N
        background.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 340, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregarTXTActionPerformed

    private void nombreprincipalTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreprincipalTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreprincipalTXTActionPerformed

    private void mostrarrelacionesTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarrelacionesTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarrelacionesTXTActionPerformed

    private void anadirusuarioTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirusuarioTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anadirusuarioTXTActionPerformed

    private void buscarbfsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbfsBTNActionPerformed
         String nombreUsuario = mostrarrelacionesTXT.getText();
         if (!nombreUsuario.isEmpty()) {
             Usuario usuario = grafo.obtenerUsuario(nombreUsuario);
             if (usuario != null) {
                 Set<Usuario> resultadoBFS = grafo.buscarBFS(usuario);
                 resultadoBFS.remove(usuario); // Eliminar al usuario principal de los resultados

                 if (resultadoBFS.isEmpty()) {
                     JOptionPane.showMessageDialog(this, "El usuario " + nombreUsuario + " no tiene amigos.");
                 } else {
                     mostrarResultadoBusqueda(resultadoBFS, "BFS");
                 }
                 mostrarrelacionesTXT.setText("");
             } else {
                 JOptionPane.showMessageDialog(this, "El usuario no existe.");
             }
         } else {
             JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario.");
         }
    }//GEN-LAST:event_buscarbfsBTNActionPerformed

    private void crearBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBTN1ActionPerformed
        String nombreUsuario = agregarTXT.getText();
        if (!nombreUsuario.isEmpty()) {
           if (grafo.obtenerUsuario(nombreUsuario) != null) {
               JOptionPane.showMessageDialog(this, "El usuario " + nombreUsuario + " ya está registrado.");
           } else {
               Usuario nuevoUsuario = new Usuario(nombreUsuario);
               grafo.agregarUsuario(nuevoUsuario);
               JOptionPane.showMessageDialog(this, "Usuario creado: " + nombreUsuario);
               agregarTXT.setText("");
           }
       } else {
           JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario.");
       }
    }//GEN-LAST:event_crearBTN1ActionPerformed

    private void buscardfsBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscardfsBTNActionPerformed
         String nombreUsuario = mostrarrelacionesTXT.getText();
         if (!nombreUsuario.isEmpty()) {
         Usuario usuario = grafo.obtenerUsuario(nombreUsuario);
         if (usuario != null) {
             Set<Usuario> resultadoDFS = grafo.buscarDFS(usuario);
             resultadoDFS.remove(usuario); // Eliminar al usuario principal de los resultados

             if (resultadoDFS.isEmpty()) {
                 JOptionPane.showMessageDialog(this, "El usuario " + nombreUsuario + " no tiene amigos.");
             } else {
                 mostrarResultadoBusqueda(resultadoDFS, "DFS");
             }
             mostrarrelacionesTXT.setText("");
         } else {
             JOptionPane.showMessageDialog(this, "El usuario no existe.");
         }
     } else {
         JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre de usuario.");
     }
    }//GEN-LAST:event_buscardfsBTNActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        
    }//GEN-LAST:event_jPanel2MousePressed
    
    /*como decidimos eliminar la barra superior donde se cierra, achica y agranda el programa
      creamos un header invisible y estos eventos para que pueda mover la aplicacion de lugar*/
    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x- xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void salirLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLBLMouseClicked
        System.exit(0);
    }//GEN-LAST:event_salirLBLMouseClicked

    private void salirPANELMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPANELMouseEntered
        salirPANEL.setBackground(Color.red);
    }//GEN-LAST:event_salirPANELMouseEntered

    private void salirLBLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLBLMouseEntered
        salirPANEL.setBackground(Color.red);
    }//GEN-LAST:event_salirLBLMouseEntered

    private void salirPANELMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirPANELMouseExited
       Color colororiginal = new Color(240,240,240);
        salirPANEL.setBackground(colororiginal);
    }//GEN-LAST:event_salirPANELMouseExited

    private void salirLBLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirLBLMouseExited
        Color colororiginal = new Color(240,240,240);
        salirPANEL.setBackground(colororiginal);
    }//GEN-LAST:event_salirLBLMouseExited

    private void anadirBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirBTNActionPerformed
                                         
    String nombrePrincipal = nombreprincipalTXT.getText();
    String nombreAmigo = anadirusuarioTXT.getText();

    if (nombrePrincipal.isEmpty() || nombreAmigo.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese ambos nombres de usuario.");
        return;
    }

    if (nombrePrincipal.equals(nombreAmigo)) {
        JOptionPane.showMessageDialog(this, "No puedes agregarte a ti mismo como amigo.");
        return;
    }

    Usuario usuarioPrincipal = grafo.obtenerUsuario(nombrePrincipal);
    Usuario usuarioAmigo = grafo.obtenerUsuario(nombreAmigo);

    if (usuarioPrincipal == null || usuarioAmigo == null) {
        JOptionPane.showMessageDialog(this, "Uno o ambos de los usuarios no existe.");
        return;
    }

    if (grafo.sonAmigos(usuarioPrincipal, usuarioAmigo)) {
        JOptionPane.showMessageDialog(this, nombrePrincipal + " y " + nombreAmigo + " ya son amigos.");
    } else {
        grafo.agregarAmistad(usuarioPrincipal, usuarioAmigo);
        JOptionPane.showMessageDialog(this, "Amistad añadida entre " + nombrePrincipal + " y " + nombreAmigo);
    }

    nombreprincipalTXT.setText("");
    anadirusuarioTXT.setText("");


    }//GEN-LAST:event_anadirBTNActionPerformed
    
    //realizamos unas especies de "placeholder" para que quede mejor la estetica de la aplicacion
    private void agregarTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarTXTMousePressed
        if (agregarTXT.getText().equals("Nombre de usuario que desea crear")) {
            agregarTXT.setText("");
            agregarTXT.setForeground(Color.black);
        }
    }//GEN-LAST:event_agregarTXTMousePressed

    private void nombreprincipalTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreprincipalTXTMousePressed
        if (nombreprincipalTXT.getText().equals("Nombre de usuario al cual le quiere agregar un amigo")) {
            nombreprincipalTXT.setText("");
            nombreprincipalTXT.setForeground(Color.black);
        }
    }//GEN-LAST:event_nombreprincipalTXTMousePressed

    private void anadirusuarioTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_anadirusuarioTXTMousePressed
        if (anadirusuarioTXT.getText().equals("Nombre de usuario el cual desea agregar")) {
            anadirusuarioTXT.setText("");
            anadirusuarioTXT.setForeground(Color.black);
        }
    }//GEN-LAST:event_anadirusuarioTXTMousePressed

    private void mostrarrelacionesTXTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarrelacionesTXTMousePressed
        if (mostrarrelacionesTXT.getText().equals("Nombre del usuario del cual desea ver sus releaciones")) {
            mostrarrelacionesTXT.setText("");
            mostrarrelacionesTXT.setForeground(Color.black);
        }
    }//GEN-LAST:event_mostrarrelacionesTXTMousePressed

    private void mostrarResultadoBusqueda(Set<Usuario> resultados, String tipoBusqueda) {
        StringBuilder sb = new StringBuilder("Resultados de la búsqueda " + tipoBusqueda + ":\n");
        for (Usuario usuario : resultados) {
            sb.append(usuario.getNombre()).append("\n");
        }
        JOptionPane.showMessageDialog(this, sb.toString());
    }
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
            java.util.logging.Logger.getLogger(RedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agregarTXT;
    private javax.swing.JButton anadirBTN;
    private javax.swing.JLabel anadirusuarioLBL;
    private javax.swing.JTextField anadirusuarioTXT;
    private javax.swing.JPanel background;
    private javax.swing.JButton buscarbfsBTN;
    private javax.swing.JButton buscardfsBTN;
    private javax.swing.JButton crearBTN1;
    private javax.swing.JLabel crearLBL;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel mostrarrelacionesLBL;
    private javax.swing.JTextField mostrarrelacionesTXT;
    private javax.swing.JLabel nombreprincipalLBL;
    private javax.swing.JTextField nombreprincipalTXT;
    private javax.swing.JLabel salirLBL;
    private javax.swing.JPanel salirPANEL;
    // End of variables declaration//GEN-END:variables
}
