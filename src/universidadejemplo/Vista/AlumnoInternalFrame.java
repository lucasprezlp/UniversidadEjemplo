/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemploAccesoADAtos.AlumnoData;

public class AlumnoInternalFrame extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;

    public AlumnoInternalFrame() {
        initComponents();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(690, 475);

//                jPanel2.setPreferredSize(new Dimension(800, 450));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jPanel2, BorderLayout.CENTER);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jrEstado = new javax.swing.JRadioButton();
        Buscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcfechaNac = new com.toedter.calendar.JDateChooser();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setResizable(true);
        setTitle("Alumnos");
        setPreferredSize(new java.awt.Dimension(500, 800));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Alumno");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Documentos:");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Apellido:");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Nombre:");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Estado:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Fecha de Nacimento:");

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jrEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrEstadoActionPerformed(evt);
            }
        });

        Buscar.setBackground(new java.awt.Color(255, 255, 255));
        Buscar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        Buscar.setForeground(new java.awt.Color(0, 51, 153));
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jbNuevo.setBackground(new java.awt.Color(255, 255, 255));
        jbNuevo.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jbNuevo.setForeground(new java.awt.Color(0, 51, 153));
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setBackground(new java.awt.Color(255, 255, 255));
        jbEliminar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jbEliminar.setForeground(new java.awt.Color(0, 51, 153));
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbGuardar.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(0, 51, 153));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(255, 255, 255));
        jbSalir.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(0, 51, 153));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(38, 38, 38)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5)))
                                    .addComponent(jLabel6))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jtNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                .addComponent(jtApellido, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addComponent(jrEstado))
                                        .addGap(50, 50, 50)
                                        .addComponent(Buscar))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(30, 30, 30)
                        .addComponent(jbSalir)))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Buscar)))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jrEstado))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jcfechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar)
                    .addComponent(jbSalir))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 540, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrEstadoActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        try{
        Integer dni = Integer.parseInt(jtDni.getText());
        alumnoActual = aluData.buscarAlumnoPorDni(dni);
        if(alumnoActual!=null){
            jtApellido.setText(alumnoActual.getApellido());
            jtNombre.setText(alumnoActual.getNombre());
            jrEstado.setSelected(alumnoActual.isActivo());
            LocalDate lc = alumnoActual.getFechaNac();
            java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jcfechaNac.setDate(date);
            
            
        }
        
        
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
            limpiarCampos();
            alumnoActual=null;
            

        // TODO add your handling code here:
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
            
        try{
        Integer dni = Integer.parseInt(jtDni.getText());
        String nombre = jtNombre.getText();
        String apellido = jtApellido.getText();
        if(nombre.isEmpty()|| apellido.isEmpty()){
            JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
            return;
        }
        java.util.Date sfecha = jcfechaNac.getDate();
        LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Boolean estado= jrEstado .isSelected();
        
        if(alumnoActual==null){
            alumnoActual =new Alumno (dni,apellido,nombre,fechaNac,estado);
            aluData.guardarAlumno(alumnoActual);
            
           
        } else {
             
            alumnoActual.setDni(dni);
            alumnoActual.setApellido(apellido);
            alumnoActual.setNombre(nombre);
            alumnoActual.setFechaNac(fechaNac);
            aluData.modificarAlumno(alumnoActual);
        }
        
        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un dni válido");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
       if (alumnoActual!=null){
           aluData.eliminarAlumno(alumnoActual.getIdAlumno());
           alumnoActual=null;
           limpiarCampos();
       } else {
        JOptionPane.showMessageDialog(this, "No hay alumno seleccionado");

       }
        // TODO add your handling code here:
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSalirActionPerformed

    private void limpiarCampos(){
        jtDni.setText("");
        jtApellido.setText("");
        jtNombre.setText("");
        jrEstado.setSelected(true);
        jcfechaNac.setDate(Date.valueOf(LocalDate.now()));
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private com.toedter.calendar.JDateChooser jcfechaNac;
    private javax.swing.JRadioButton jrEstado;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables



}
