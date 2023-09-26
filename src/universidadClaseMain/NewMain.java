package universidadClaseMain;

import java.sql.Connection;
import java.time.LocalDate;
import universidadejemplo.Entidades.*;
import universidadejemplo.Vista.Principal;
import universidadejemploAccesoADAtos.*;

public class NewMain {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        Principal imagen = new Principal();
        imagen.show();
//        Materia mat=new Materia("Matematica", 2, true);
//        Materia mat1=new Materia("Ingles", 2, true);
//        Materia mat2=new Materia("Historia", 2, true);
        //Materia mat3 = new Materia("Lengua", 4, true);
        //MateriaData mate = new MateriaData();
//        mate.guardarMateria(mat);
//        mate.guardarMateria(mat1);
//        mate.guardarMateria(mat2);
        // mate.guardarMateria(mat3);
//////////////////////////////////////////////////
//mate.eliminarMateria(3);

        /////////////SE MODIFICA LA MATERIA A PARTIR DEL ID Y DANDOLE NUEVO NOMBRE
//Materia mat2=new Materia(3, "Ciudadania", 3, true);
        // mate.modificarMateria(mat2);
/////////
//////////PARA RECORRER LA LISTA DE MATERIAS Y DEVOLVERLA EN UN SYSTEM OUT PRINT
        /*for (Materia materias : mate.listarMateria()) {
            System.out.println("Nombre de la materia: " + materias.getNombre());
            System.out.println("Id de la Materia: " + materias.getIdMateria());
            System.out.println("Año en que se cursa: " + materias.getAnio());
            System.out.println("********************");*/
        // AlumnoData alu = new AlumnoData();
        /* Alumno a2 = new Alumno(222, "Pérez", "Pablo", LocalDate.of(2001, 05, 25), true);
        Alumno a3 = new Alumno(333, "Pérez", "carlos", LocalDate.of(2001, 05, 25), true);
        Alumno a6 = new Alumno(444, "Pérez", "josue", LocalDate.of(2001, 05, 25), true);
        Alumno a4 = new Alumno(555, "Pérez", "Joséf", LocalDate.of(2001, 05, 25), true);*/
        //Alumno a5 = new Alumno(666, "Pérez", "Lucas", LocalDate.of(2001, 05, 25), true);*/
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
        //MateriaData mm1 = new MateriaData();
        //   mm1.guardarMateria(m1);
        ////////////////////////////
        ////LLAMAR AL ALUMNO SEGUN SU ID Y A LA MATERIA SEGUN SU ID PARA HACER LA
        ////INSCRIPCION DE LA NOTA POR ALUMNO Y POR MATERIA
//        Alumno a6 = new Alumno(1);
//        Materia m1;
//        m1 = new Materia(4);
//        Inscripcion insc = new Inscripcion(a6, m1, 5);
//        InscripcionData in = new InscripcionData();
//        in.guardarInscripcion(insc);
        ////////////////////////////////////////////
//        in.actualizarNota(1, 6, 1, 4);
        // in.obtenerMateriasCursadas(1);
        /* Inscripcion insc = new Inscripcion();
        InscripcionData in = new InscripcionData();
         for (Materia materias : in.obtenerMateriasCursadas(1)) {
            System.out.println("Materia cursada: " + materias.getNombre());
            System.out.println("Año de cursada: " + materias.getAnio());
            System.out.println("Id de la materia: " + materias.getIdMateria());
       
            System.out.println("********************");*/
//        Inscripcion insc = new Inscripcion();
//        InscripcionData in = new InscripcionData();
//         for (Materia materias : in.obtenerMateriasNOCursadas(1)) {
//            System.out.println("Materia cursada: " + materias.getNombre());
//            //System.out.println("Año de cursada: " + materias.getAnio());
//            System.out.println("Id de la materia: " + materias.getIdMateria());
//       
//            System.out.println("********************");
        //Inscripcion insc = new Inscripcion();
       // InscripcionData in = new InscripcionData();
//         for (Alumno alu : in.obtenerAlumnosXMateria(3)) {
//           // System.out.println("Materia cursada: " + alumno.getNombre());
//            //System.out.println("Año de cursada: " + materias.getAnio());
//            System.out.println("Id del Alumno: " + alu.getIdAlumno());
//       
//            System.out.println("********************");
//
//        }
        //in.borrarInscripcionMateriaAlumno(1, 3);
       /*for (Inscripcion inscripciones : in.obtenerInscripcionesPorAlumno(1)) {
            System.out.println("ID inscripción: " + inscripciones.getIdInscripcion() + "\n");
            System.out.println("nota: " + inscripciones.getNota() + "\n");
            System.out.println("alumno: " +inscripciones.getAlumno());
           // System.out.println("ID alumno: " + inscripciones.getAlumno().idAlumno + "\n");
            System.out.println("********************");

        }*/
        /*for(Inscripcion inscripcion: in.obtenerInscripciones()){
            System.out.println("id"+inscripcion.getIdInscripcion());
            System.out.println("Nota"+inscripcion.getNota());
        }*/
    }
        
    }

