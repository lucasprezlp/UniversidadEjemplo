
package universidadejemploAccesoADAtos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;


public class AlumnoData {

    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
   PreparedStatement ps;
    public void guardarAlumno(Alumno alumno) {
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES (?,?,?,?,?)"; 
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();

                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()) {
                    alumno.setIdAlumno(rs.getInt(1));
                    JOptionPane.showMessageDialog(null, "alumno agregado con exito");
                }           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla de alumno");
        }
    }

    public void modificarAlumno(Alumno alumno) {
        String sql = "UPDATE alumno SET dni=?, apellido=?, nombre=?, fechaNacimiento=?"
                + "WHERE idAlumno = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
            ps.setInt(5, alumno.getIdAlumno());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "alumno modificado");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public void eliminarAlumno(int id) {
        String sql = "UPDATE alumno SET estado = 0 WHERE idAlumno = ?";

        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "se elimino el alumno");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ocurrio un error: " + ex);
        }
    }

    public Alumno buscarAlumno(int id) {
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
        Alumno alumno = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);

                JOptionPane.showMessageDialog(null, alumno.toString());
            } else {
                JOptionPane.showMessageDialog(null, "no existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex);
        }
        return alumno;

    }

    public Alumno buscarAlumnoPorDni(int dni) {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
        Alumno alumno=null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);

                //JOptionPane.showMessageDialog(null, alumno.toString());
            } else {
                JOptionPane.showMessageDialog(null, "no existe el alumno");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return alumno;
        
    }

    public List<Alumno> listarAlumno() {
        String sql = "SELECT idAlumno, dni, apellido, nombre, fechaNacimiento FROM alumno WHERE estado = 1";
        ArrayList<Alumno> alumnos = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    Alumno alumno = new Alumno();
                    alumno.setIdAlumno(rs.getInt("idAlumno"));
                    alumno.setDni(rs.getInt("dni"));
                    alumno.setApellido(rs.getString("apellido"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                    alumno.setActivo(true);
                    alumnos.add(alumno);
                    //JOptionPane.showMessageDialog(null, alumnos.toString());
                    ps.close();
                }
            }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return alumnos;
    }
    }

