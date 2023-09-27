package universidadejemplo.Vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;
import javax.swing.table.DefaultTableModel;
import universidadejemploAccesoADAtos.*;

public class ManejoNotas extends javax.swing.JInternalFrame {
    private List<Materia> listaM;
    private List<Alumno> listaA;
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    private DefaultTableModel modelo;

  public ManejoNotas() {
    initComponents();
    aData = new AlumnoData();
    mData = new MateriaData();
    listaM = mData.listarMateria();
    modelo = new DefaultTableModel();
    inscData = new InscripcionData();
    listaA = aData.listarAlumno(); // Agrega esta línea para inicializar listaA
    cargarAlumnos();
    armarCabeceraTable();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInscrip = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setClosable(true);
        setTitle("Cargar de notas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccion de alumnos:");

        jcbAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnoActionPerformed(evt);
            }
        });

        jTableInscrip.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Nota"
            }
        ));
        jScrollPane1.setViewportView(jTableInscrip);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jBGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(84, 84, 84))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBGuardar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
    
        int filaSeleccionada = jTableInscrip.getSelectedRow();
        if (filaSeleccionada != -1);
        Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
        int idMateria = (int) modelo.getValueAt(filaSeleccionada, 0);
        String nombreMateria = (String) modelo.getValueAt(filaSeleccionada, 1);
        double nota = (double) modelo.getValueAt(filaSeleccionada, 2);
        
        Inscripcion in = new Inscripcion(nota);
        inscData.actualizarNota(idMateria, selec.getIdAlumno(), nota);
        
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
       dispose();
       principalMostrarFondo();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jcbAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnoActionPerformed
       Alumno selec = (Alumno) jcbAlumno.getSelectedItem();
       List<Materia> mate= inscData.obtenerMateriasCursadas(selec.getIdAlumno());
       double nota;
       List<Inscripcion> insripciones = inscData.obtenerInscripciones();
       
       for(Materia materia : mate){
           nota = obtenerNota(insripciones,materia.getIdMateria());
           modelo.addRow(new Object[]{materia.getIdMateria(),materia.getNombre(),nota});
       }
  
    }//GEN-LAST:event_jcbAlumnoActionPerformed

    private double obtenerNota(List<Inscripcion> inscripciones,int idMateria){
    
        for(Inscripcion inscripcion : inscripciones){
            if(inscripcion.getMateria().getIdMateria() == idMateria){
                return inscripcion.getNota();
            }
        }
        return -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInscrip;
    private javax.swing.JComboBox<Alumno> jcbAlumno;
    // End of variables declaration//GEN-END:variables
private void cargarAlumnos(){
    for(Alumno item: listaA){
        jcbAlumno.addItem(item);
    }
}
    private void armarCabeceraTable() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Código");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTableInscrip.setModel(modelo);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
           private void principalMostrarFondo() {
        Principal imagen = new Principal();
        imagen.show();
    }
}
