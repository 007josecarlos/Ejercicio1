package clases;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Concurso {
    private String nombre;
    private final Integer numPro;
    private HashSet<String> equipos;
    private LinkedList<Envio> resp;
    
    //Constructor #1
    public Concurso(String nombre, Integer numPro) {
        this.nombre = nombre;
        this.numPro = numPro;
        this.equipos = new HashSet<>();
        this.resp = new LinkedList<>();
    }
  
    public Concurso(String nombre) {
        this(nombre, 5); 
    }
    
    public String getNombre() { return nombre; }
    public Integer getNumProblemas() { return numPro; }
    public HashSet<String> getEquipos() { return equipos; }
 
    //El tamaño del hashset es el numero de quipos
    public int getNumEquipos() { return this.equipos.size(); }
    
   
    public void añadirEquipos(String... str) {
   
        Collections.addAll(equipos, str);
    }
    
    boolean eliminarEquipo(String equipo) {
        
        LinkedList<Envio> envios = new LinkedList<>();
        for(Envio ev : this.resp) {
            if(ev.getNombreEquipo().equals(equipo)) {
                envios.add(ev);
            }
        }
        
        this.resp.removeAll(envios);
        
        return this.equipos.remove(equipo);
    }
    
    public Envio registrarEnvio(String nombreEquipo, Integer numPro, String resp) {
        if(this.equipos.contains(nombreEquipo)) { //Si el equipo esta registrado...
            //Si el numero no es negativo y es menor o igual que el total de problemas
            if(!(numPro < 0) && (numPro <= numPro)) {
                //Si el objeto resp no es nulo y la cadena no esta vacia
                if((resp != null) && !(resp.isEmpty())) {
                    //Si cumple con todo, se almacena y se retorna
                    Envio ev = new Envio(nombreEquipo, numPro, resp);
                    this.resp.add(ev);
                    return ev;
                }
            }
        }
        
        
        return null;
    }
}
