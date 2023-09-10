
package universidadClaseMain;

import java.sql.Connection;
import java.time.LocalDate;
import universidadejemplo.Entidades.Alumno;
import universidadejemploAccesoADAtos.AlumnoData;
import universidadejemploAccesoADAtos.Conexion;

public class NewMain {

    public static void main(String[] args) {
      Connection con= Conexion.getConexion();
      
      //probar
      Alumno a1 = new Alumno(1234567, "suarez", "juana", LocalDate.of(2001,05,25), true );
      AlumnoData alu = new AlumnoData();
      alu.guardarAlumno(a1);
      
    }
    
}
