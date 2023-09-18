
package universidadejemploAccesoADAtos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Materia;

public class MateriaData {
  
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    
    PreparedStatement ps;
    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anio, estado)"
                + "VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "materia agregada con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }

    public void eliminarMateria(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "se desactivo la materia");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ocurrio un error: " + ex);
        }
    }

    public void modificarMateria(Materia materia) {
        String sql = "UPDATE materia SET nombre=?, anio=?, estado=? WHERE idMateria = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, materia.getIdMateria());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "materia modificada");
                ps.close();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró una materia con ID: " + materia.getIdMateria());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error " + ex);
        }
    }

    public Materia buscarMateria(int id) {
        String sql = "SELECT nombre, anio FROM materia WHERE idMateria = ? AND estado = 1";
        Materia materia = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setActivo(true);

                JOptionPane.showMessageDialog(null, materia);
            } else {
                JOptionPane.showMessageDialog(null, "no existe la materia");
                ps.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error: " + ex);
        }
        return materia;

    }

    public List<Materia> listarMateria() {
        String sql = "SELECT idMateria, nombre, anio FROM materia WHERE estado = 1";
        ArrayList<Materia> materias = new ArrayList<>();
        try {
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materias.add(materia);
                //JOptionPane.showMessageDialog(null, materias);
                ps.close();

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la materia" + ex);
        }
        return materias;
    }

}















