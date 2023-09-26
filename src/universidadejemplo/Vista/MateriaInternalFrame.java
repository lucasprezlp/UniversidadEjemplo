/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;
import universidadejemploAccesoADAtos.AlumnoData;
import universidadejemploAccesoADAtos.InscripcionData;
import universidadejemploAccesoADAtos.MateriaData;
import universidadejemplo.Vista.Principal;
/**
 *
 * @author francisco
 */
public class MateriaInternalFrame extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;
    private InscripcionData inscData;
    private MateriaData mData = new MateriaData();
    private AlumnoData aData;
    private DefaultTableModel modelo;
    private Materia materiaActual = null;

    /**
     * Creates new form MateriaInternalFrame
     */
    public MateriaInternalFrame() {
        initComponents();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        jPBG1.setPreferredSize(new Dimension(300, 200));
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(jPBG1, BorderLayout.CENTER);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPBG1 = new javax.swing.JPanel();
        jPTituloMateria = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jLCodigo = new javax.swing.JLabel();
        jTCódigo = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLAño = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        jRBEstado = new javax.swing.JRadioButton();
        jBBuscar = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 255, 102));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setResizable(true);
        setTitle("MATERIA");
        getContentPane().setLayout(null);

        jPBG1.setBackground(new java.awt.Color(0, 204, 102));

        jPTituloMateria.setBackground(new java.awt.Color(0, 153, 102));
        jPTituloMateria.setForeground(new java.awt.Color(0, 153, 102));

        jLTitulo.setBackground(new java.awt.Color(0, 0, 0));
        jLTitulo.setText("MATERIA");

        javax.swing.GroupLayout jPTituloMateriaLayout = new javax.swing.GroupLayout(jPTituloMateria);
        jPTituloMateria.setLayout(jPTituloMateriaLayout);
        jPTituloMateriaLayout.setHorizontalGroup(
            jPTituloMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloMateriaLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLTitulo)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPTituloMateriaLayout.setVerticalGroup(
            jPTituloMateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPTituloMateriaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLTitulo)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLCodigo.setText("Código:");

        jTCódigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTCódigoActionPerformed(evt);
            }
        });

        jLNombre.setText("Nombre: ");

        jLAño.setText("Año:");

        jLEstado.setText("Estado:");

        jRBEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBEstadoActionPerformed(evt);
            }
        });

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");
        jBNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBG1Layout = new javax.swing.GroupLayout(jPBG1);
        jPBG1.setLayout(jPBG1Layout);
        jPBG1Layout.setHorizontalGroup(
            jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBG1Layout.createSequentialGroup()
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPBG1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPTituloMateria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPBG1Layout.createSequentialGroup()
                                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCodigo)
                                    .addComponent(jLNombre)
                                    .addComponent(jLAño)
                                    .addComponent(jLEstado)
                                    .addComponent(jBNuevo))
                                .addGap(31, 31, 31)
                                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPBG1Layout.createSequentialGroup()
                                        .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRBEstado)
                                            .addComponent(jTCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jBBuscar)
                                        .addGap(23, 23, 23))
                                    .addGroup(jPBG1Layout.createSequentialGroup()
                                        .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jBEliminar)
                                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addGroup(jPBG1Layout.createSequentialGroup()
                        .addContainerGap(231, Short.MAX_VALUE)
                        .addComponent(jBGuardar)
                        .addGap(30, 30, 30)
                        .addComponent(jBSalir)))
                .addGap(15, 15, 15))
        );
        jPBG1Layout.setVerticalGroup(
            jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBG1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPTituloMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTCódigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscar))
                .addGap(25, 25, 25)
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLAño)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLEstado)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPBG1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBNuevo)
                    .addComponent(jBEliminar)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(24, 24, 24))
        );

        getContentPane().add(jPBG1);
        jPBG1.setBounds(0, -10, 400, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTCódigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTCódigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTCódigoActionPerformed

    private void jRBEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRBEstadoActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
        // TODO add your handling code here:
        try {
            materiaActual = mData.buscarMateria(Integer.parseInt(jTCódigo.getText()));
            if (materiaActual != null) {
                jTNombre.setText(materiaActual.getNombre());
                jTAño.setText(Integer.toString(materiaActual.getAnio()));
                jRBEstado.setSelected(materiaActual.isActivo());
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese una materia valida");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
        universidadejemplo.Vista.Principal
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoActionPerformed
        // TODO add your handling code here:
        jTCódigo.setText("");
        jTNombre.setText("");
        jTAño.setText("");
        jRBEstado.setSelected(isClosed);
    }//GEN-LAST:event_jBNuevoActionPerformed

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
         try {
        Integer codigo = Integer.parseInt(jTCódigo.getText());
        String nombre = jTNombre.getText();
        int anio = Integer.parseInt(jTAño.getText());
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No puede haber campos vacíos");
            return;
        }
        Boolean estado = jRBEstado.isSelected();
        
        // Buscar la materia por código en la base de datos
        Materia materiaExistente = mData.buscarMateria(codigo);
        
        if (materiaExistente == null) {
            // Si la materia no existe, crear una nueva
            materiaActual = new Materia(codigo, nombre, anio, estado);
            mData.guardarMateria(materiaActual); // Reemplaza mData con tu lógica de guardado en la base de datos
            JOptionPane.showMessageDialog(this, "Materia agregada con éxito.");
        } else {
            // Si la materia ya existe, actualizar sus datos
            materiaActual.setIdMateria(codigo);
            materiaActual.setNombre(nombre);
            materiaActual.setAnio(anio);
            materiaActual.setActivo(estado);
            mData.modificarMateria(materiaActual); // Reemplaza mData con tu lógica de actualización en la base de datos
            JOptionPane.showMessageDialog(this, "Datos de la materia actualizados con éxito.");
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El código y el año deben ser números válidos.");
    }
//        try {
//            Integer codigo = Integer.parseInt(jTCódigo.getText());
//            int id = codigo;
//            String nombre = jTNombre.getText();
//            int anio = (Integer.parseInt(jTAño.getText()));
//            if (nombre.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
//                return;
//            }
//            Boolean estado = jRBEstado.isSelected();
//            if (materiaActual == null) {
//                materiaActual = new Materia(nombre, anio, estado);
//                mData.guardarMateria(materiaActual);
//            } else {
//                 materiaActual.setIdMateria(Integer.parseInt(jLCodigo.getText()));
//               
//                   // materiaActual.getIdMateria();
//                    materiaActual.setNombre(nombre);
//                    materiaActual.setAnio(anio);
//                    materiaActual.setActivo(estado);
//                    mData.modificarMateria(materiaActual);
//                
//            }
//        } catch (NumberFormatException ex) {
//            JOptionPane.showMessageDialog(this, "Ingrese un codigo valido");
//        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        if (materiaActual != null){
            mData.eliminarMateria(materiaActual.getIdMateria());
            materiaActual = null;
            jTCódigo.setText("");
        jTNombre.setText("");
        jTAño.setText("");
        jRBEstado.setSelected(isClosed);
        }
    }//GEN-LAST:event_jBEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLAño;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JPanel jPBG1;
    private javax.swing.JPanel jPTituloMateria;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTCódigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
