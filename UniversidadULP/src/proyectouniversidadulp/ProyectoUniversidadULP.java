package proyectouniversidadulp;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import proyectouniversidadulp.control.AlumnoData;
import proyectouniversidadulp.control.InscripcionData;
import proyectouniversidadulp.control.MateriaData;
import proyectouniversidadulp.modelo.Alumno;
import proyectouniversidadulp.modelo.Conexion;
import proyectouniversidadulp.modelo.Inscripcion;
import proyectouniversidadulp.modelo.Materia;

public class ProyectoUniversidadULP {

    public static void main(String[] args) throws ClassNotFoundException {
        //Conexion conexion = new Conexion("jdbc:mysql://localhost/universidad","root","");
        Conexion conexion = new Conexion(); //CREANDO LA CONEXION   

        // List<Alumno> alumnos = new ArrayList<>();
        AlumnoData ad = new AlumnoData(conexion);
        MateriaData md = new MateriaData(conexion);
        InscripcionData id = new InscripcionData(conexion);

        /*List<Alumno> alumnos = new ArrayList<>();

        Alumno a = new Alumno(9898, "Marcos Suarez", LocalDate.of(2000, Month.NOVEMBER, 28), true); //CREANDO ALUMNOS
        Alumno b = new Alumno(6969, "Martin Jofre", LocalDate.of(1995, Month.MARCH, 12), true);
        ad.guardarAlumno(a); //AGREGANDO ALUMNOS
        ad.guardarAlumno(b);
        ad.actualizarAlumno(a);
        System.out.println("buscar alumno:" + ad.buscarAlumno(11)); //BUSCAR ALUMNOS
        alumnos = ad.obtenerAlumnos();
        System.out.println("lista:");
        for (Alumno al : alumnos) {
            System.out.println(al);
        }

        Materia m1 = new Materia(0123, "Laboratorio I", 2);

        md.guardarMateria(m1);
        md.darDeBajaMateria(m1.getId_materia());
        List<Materia> materias = new ArrayList<>();
        materias = md.obtenerMaterias();
        for (Materia m : materias) {
            System.out.println(m);

        }
        
        /*Inscripcion ins1 = new Inscripcion(a, m1, 9);
        Inscripcion ins2 = new Inscripcion(b, m1, 7);
        Inscripcion ins3 = new Inscripcion(id.buscarAlumno(3), id.buscarMateria(1), 3);
        Inscripcion ins4 = new Inscripcion(id.buscarAlumno(3), id.buscarMateria(2), 4);
        Inscripcion ins5 = new Inscripcion(id.buscarAlumno(3), id.buscarMateria(3), 5);
        /*
        id.guardarInscripcion(ins1);
        id.guardarInscripcion(ins2);
        *//*
         id.guardarInscripcion(ins3);
         id.guardarInscripcion(ins4);
         id.guardarInscripcion(ins5);*/         
         
         
         Inscripcion prueba = new Inscripcion(1, 26, 0);
         //id.guardarInscripcion(prueba);
         
         
    }
}
