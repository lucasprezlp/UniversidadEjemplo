package universidadejemploAccesoADAtos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.*;
//import universidadejemplo.Entidades.Alumno;
//import universidadejemplo.Entidades.Inscripcion;
//import universidadejemplo.Entidades.Materia;

public class InscripcionData {

    private Connection con = null;

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria)"
                + "VALUES (?,?,?)";
        try {
            try (PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
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
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la inscripción: " + "\n" + ex);
        }
    }

    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        PreparedStatement ps = null;
        try {
            String sql = "SELECT * FROM inscripcion";
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Inscripcion inscripcion;
            while (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                inscripciones.add(inscripcion);
                JOptionPane.showMessageDialog(null, "Inscripciones listadas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        List<Inscripcion> inscripciones = new ArrayList<>();
        PreparedStatement ps = null;

        try {
            String sql = "SELECT inscripcion.idInscripto, alumno.nombre AS nombre_alumno, materia.nombre AS nombre_materia, inscripcion.nota "
                    + "FROM inscripcion "
                    + "INNER JOIN alumno ON inscripcion.idAlumno = alumno.idAlumno "
                    + "INNER JOIN materia ON inscripcion.idMateria = materia.idMateria "
                    + "WHERE inscripcion.idAlumno = ?;";
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            System.out.println("hasta aca funciona? ayudame san GPT");
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(rs.getInt("idInscripto"));
                inscripcion.setIdInscripcion(rs.getInt("idAlumno"));
                inscripcion.setIdInscripcion(rs.getInt("idMateria"));
                inscripcion.setIdInscripcion(rs.getInt("nota"));
                inscripciones.add(inscripcion);
                System.out.println("hola?");
                JOptionPane.showMessageDialog(null, "Inscripciones listadas");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return inscripciones;
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, anio FROM inscripcion "
                    + "JOIN materia ON (inscripcion.idMateria=materia.idMateria) WHERE inscripcion.idAlumno=?"
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
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia" + "\n" + ex);
            System.out.println(ex);
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNOCursadas(int id) {
        List<Materia> materias = new ArrayList<Materia>();
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
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "DELETE FROM inscripcion WHERE idAlumno = ? AND idMateria = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
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

    public void actualizarNota(int idInscripto, int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET idAlumno=?, idMateria=?, nota=? WHERE idInscripto = ?";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            ps.setDouble(3, nota);
            ps.setInt(4, idInscripto);
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
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia");
        }
        return alu;
        
    }
}
