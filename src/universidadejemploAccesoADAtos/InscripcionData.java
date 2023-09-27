package universidadejemploAccesoADAtos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;

public class InscripcionData {

    private Connection con = null;
    private AlumnoData aluData = new AlumnoData();
    private MateriaData mateData = new MateriaData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            // ps.setInt(1, insc.getIdInscripcion());
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "inscripción agregado con exito");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la inscripción: " + "\n" + ex);
        }
    }
    public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT idInscripto, m.idMateria, m.nombre, nota, m.estado, a.idAlumno, dni, apellido, a.nombre, fechaNacimiento, a.estado, anio FROM inscripcion i "
                + "JOIN alumno a ON i.idAlumno = a.idAlumno "
                + "JOIN materia m ON i.idMateria = m.idMateria ";

        List<Inscripcion> inscripciones = new ArrayList<>();

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno a = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado"));
                Materia m = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("anio"), rs.getBoolean("estado"));
                Inscripcion i = new Inscripcion(rs.getInt("idInscripto"), a, m, rs.getInt("nota"));
                inscripciones.add(i);
            }
           // ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();

        try {
            String sql = "SELECT * FROM `inscripcion` where idAlumno=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            // System.out.println("hasta aca funciona? ayudame san GPT");
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alu = aluData.buscarAlumno(rs.getInt("IdAlumno"));
                Materia mate = mateData.buscarMateria(rs.getInt("IdMateria"));
                inscripcion.setAlumno(alu);
                inscripcion.setMateria(mate);
                inscripcion.setIdInscripcion(rs.getInt("nota"));
                inscripciones.add(inscripcion);

                //JOptionPane.showMessageDialog(null, "Inscripciones listadas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion JOIN materia"
                    + " ON (inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno=?"
                    + " AND materia.estado=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia" + "\n" + ex);
            System.out.println(ex);
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "select idMateria, nombre from materia where idMateria"
                    + " not in (SELECT idmateria from inscripcion WHERE idAlumno=?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia = new Materia();
            while (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materias.add(materia);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Inscripción eliminada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo eliminar la inscripción");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Nota modificada");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo modificar la nota");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public List<Alumno> obtenerAlumnosXMateria(int idMateria) {
        List<Alumno> alu = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idAlumno FROM inscripcion JOIN alumno "
                    + "ON (inscripcion.idAlumno=alumno.idAlumno) WHERE inscripcion.idMateria=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();
            Alumno al = new Alumno();
            while (rs.next()) {
                al.setIdAlumno(rs.getInt("idAlumno"));
                alu.add(al);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }
        return alu;

    }
}
