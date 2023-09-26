package universidadejemplo.Vista;

import java.util.ArrayList;
import java.util.List;
import universidadejemplo.Entidades.*;
import javax.swing.table.DefaultTableModel;
import universidadejemploAccesoADAtos.*;

public class ManipulacionInscripcion extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    private DefaultTableModel modelo;

    public ManipulacionInscripcion() {
        initComponents();
        aData = new AlumnoData();
        listaA = aData.listarAlumno();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        cargarAlumnos();
        armarCabeceraTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jrbMateInscrip = new javax.swing.JRadioButton();
        jrbMateNOInscrip = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        jBInscribir = new javax.swing.JButton();
        jBAInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Formulario de Inscripción");
        setToolTipText("");

        jLabel1.setText("Formulario de inscripcion:");

        jLabel2.setText("Seleccione un alumno:");

        jrbMateInscrip.setText("Materias Inscriptas");
        jrbMateInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateInscripActionPerformed(evt);
            }
        });

        jrbMateNOInscrip.setText("Materias NO inscriptas");
        jrbMateNOInscrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbMateNOInscripActionPerformed(evt);
            }
        });

        jLabel3.setText("Listado de materias");

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Año"
            }
        ));
        jScrollPane1.setViewportView(jTableMaterias);

        jBInscribir.setText("Inscribir");
        jBInscribir.setEnabled(false);
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAInscripcion.setText("Anular Inscripcion");
        jBAInscripcion.setEnabled(false);
        jBAInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAInscripcionActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbMateInscrip)
                                .addGap(3, 3, 3)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbMateNOInscrip)
                            .addComponent(jcbAlumno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jBInscribir)
                        .addGap(35, 35, 35)
                        .addComponent(jBAInscripcion)
                        .addGap(41, 41, 41)
                        .addComponent(jBSalir)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbMateInscrip)
                    .addComponent(jrbMateNOInscrip))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jBAInscripcion)
                    .addComponent(jBSalir))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbMateInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateInscripActionPerformed
        borrarFilaTabla();
        jrbMateNOInscrip.setSelected(false);
        cargaDatosInscriptas();
        jBAInscripcion.setEnabled(true);
        jBInscribir.setEnabled(false);


    }//GEN-LAST:event_jrbMateInscripActionPerformed

    private void jrbMateNOInscripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbMateNOInscripActionPerformed
        borrarFilaTabla();
        jrbMateInscrip.setSelected(false);
        cargaDatosNoInscriptas();
        jBAInscripcion.setEnabled(false);
        jBInscribir.setEnabled(true);
    }//GEN-LAST:event_jrbMateNOInscripActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno a = (Alumno) jcbAlumno.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada, 2);
            Materia m = new Materia(idMateria, nombreMateria, anio, true);
            Inscripcion i = new Inscripcion(a, m, 0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jBAInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAInscripcionActionPerformed
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno a = (Alumno) jcbAlumno.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jBAInscripcionActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
                dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAInscripcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    private javax.swing.JRadioButton jrbMateInscrip;
    private javax.swing.JRadioButton jrbMateNOInscrip;
    // End of variables declaration//GEN-END:variables
private void cargarAlumnos() {
        for (Alumno item : listaA) {
            jcbAlumno.addItem(item);
        }
    }

    private void armarCabeceraTable() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTableMaterias.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargaDatosNoInscriptas() {
        //borrarFilaTabla();
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        listaM = inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for (Materia m : listaM) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});

        }
    }

    private void cargaDatosInscriptas() {
        //borrarFilaTabla();
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        List<Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Materia m : lista) {
            modelo.addRow(new Object[]{m.getIdMateria(), m.getNombre(), m.getAnio()});
    }
}
}
