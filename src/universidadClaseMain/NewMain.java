package universidadClaseMain;

import java.sql.Connection;
import java.time.LocalDate;
import universidadejemplo.Entidades.Alumno;
import universidadejemploAccesoADAtos.AlumnoData;
import universidadejemploAccesoADAtos.Conexion;

public class NewMain {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();

        //probar
        AlumnoData alu = new AlumnoData();
        Alumno a1 = new Alumno(1234567, "suarez", "carlos", LocalDate.of(2001, 05, 25), true);
        // Usar este constructor de alumno para hacer el Update!
        Alumno a2 = new Alumno(1, 1234567, "suarez", "carlos", LocalDate.of(2001, 05, 25), true);
        // alu.guardarAlumno(a1);
        
        //Metodo para modificar datos de un alumno
        alu.modificarAlumno(a2);
    }

}
