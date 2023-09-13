package universidadClaseMain;

import java.sql.Connection;
import java.time.LocalDate;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;
import universidadejemploAccesoADAtos.AlumnoData;
import universidadejemploAccesoADAtos.Conexion;
import universidadejemploAccesoADAtos.InscripcionData;
import universidadejemploAccesoADAtos.MateriaData;

public class NewMain {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
//        Materia mat=new Materia("Matematica", 2, true);
//        Materia mat1=new Materia("Ingles", 2, true);
//        Materia mat2=new Materia("Historia", 2, true);
//        MateriaData mate=new MateriaData();
//        mate.guardarMateria(mat);
//        mate.guardarMateria(mat1);
//        mate.guardarMateria(mat2);
        //mate.eliminarMateria(3);
        //Materia mat2=new Materia(3, "Ciudadania", 3, true);
        // mate.modificarMateria(mat2);

        /*for (Materia materias : mate.listarMateria()) {
            System.out.println(materias.getIdMateria());
            System.out.println(materias.getNombre());

            System.out.println(materias.getAnio());
            System.out.println("********************");*/
 /* AlumnoData alu = new AlumnoData();
       
        Alumno a2 = new Alumno(222, "Pérez", "Pablo", LocalDate.of(2001, 05, 25), true);
        Alumno a3 = new Alumno(333, "Pérez", "carlos", LocalDate.of(2001, 05, 25), true);
        Alumno a6 = new Alumno(444, "Pérez", "josue", LocalDate.of(2001, 05, 25), true);
        Alumno a4 = new Alumno(555, "Pérez", "Joséf", LocalDate.of(2001, 05, 25), true);
        Alumno a5 = new Alumno(666, "Pérez", "Lucas", LocalDate.of(2001, 05, 25), true);*/
        //Alumno a1 = new Alumno(111, "Pérez", "José", LocalDate.of(2001, 05, 25), true);
        // Usar este constructor de alumno para hacer el Update!
        // Alumno a6 = new Alumno(6, 666, "Pérez", "Lucas", LocalDate.of(2001, 05, 25), false);

        /* alu.guardarAlumno(a2);
          alu.guardarAlumno(a3);
          alu.guardarAlumno(a4);
          alu.guardarAlumno(a5);
          alu.guardarAlumno(a6);*/
        //Metodo para modificar datos de un alumno
        // alu.modificarAlumno(a5);
        //Metodo para eliminar alumno
        // alu.eliminarAlumno(0);
        // alu.buscarAlumno(2);
        // mate.buscarMateria(1);
        //alu.buscarAlumnoPorDni(133333);
        /*for (Alumno alumno:alu.listarAlumno()){
           System.out.println(alumno.getDni());
           System.out.println(alumno.getNombre());
           System.out.println(alumno.getFechaNac());
           System.out.println("********************");*/
        Alumno a6 = new Alumno(1);
        Materia m1 = new Materia(1);
        MateriaData mm1 = new MateriaData();
        // mm1.guardarMateria(m1);

        Inscripcion insc = new Inscripcion(a6, m1, 8);
        InscripcionData in = new InscripcionData();
        //in.guardarInscripcion(insc);

//        in.actualizarNota(1, 6, 1, 4);
       // in.obtenerMateriasCursadas(1);
        for (Materia materias : in.obtenerMateriasCursadas(1)) {
            System.out.println(materias.getNombre());
            System.out.println(materias.getAnio());
            System.out.println(materias.getIdMateria());
            System.out.println(insc.getNota());
            System.out.println("********************");

        }
    }
}
