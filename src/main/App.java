package main;

import clases.Concurso;
import java.util.HashSet;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        //Declara y construye un concurso con nombre “Sesión 1” y 2 problemas. 
        Concurso concurso1 = new Concurso("Sesion 1", 2);
   
        //Declara y construye un concurso con nombre “Sesión 2” y 3 problemas. 
        Concurso concurso2 = new Concurso("Sesion 2", 3);
        
        //Declara y construye un concurso con nombre “Sesión 3” y 3 problemas. 
        Concurso concurso3 = new Concurso("Sesion 3", 3);
        
        //Crea una lista de concursos y añade los tres concursos creados en los pasos
        //anteriores
        LinkedList<Concurso> lista = new LinkedList<>();
        lista.add(concurso1);
        lista.add(concurso2);
        lista.add(concurso3);
        
        
        for (Concurso cs : lista) {
            
            System.out.println("Nombre del Concurso: " + cs.getNombre());
            
            cs.añadirEquipos("Equipo 1", "Equipo 2", "Equipo 3");
           
            HashSet<String> equipos = cs.getEquipos();
            for (String str : equipos) {
                for (int i = 1; i <= cs.getNumProblemas(); i++) {
                    cs.registrarEnvio(str, i, "(1, 2)");
                }
            }
        }
    }
}
