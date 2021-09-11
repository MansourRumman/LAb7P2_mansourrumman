/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7p2_mansourrumman;

import java.io.Serializable;

/**
 *
 * @author manso
 */
public class plan implements Serializable {
    private String dest,nombre,tsur;
    private int distancia,sato;

    public plan(String dest, String nombre, int distancia, String tsur,  int sato) {
        this.dest = dest;
        this.nombre = nombre;
        this.tsur = tsur;
        this.distancia = distancia;
        this.sato = sato;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTsur() {
        return tsur;
    }

    public void setTsur(String tsur) {
        this.tsur = tsur;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public int getSato() {
        return sato;
    }

    public void setSato(int sato) {
        this.sato = sato;
    }

    @Override
    public String toString() {
        return "plan{" + "dest=" + dest + ", nombre=" + nombre + ", tsur=" + tsur + ", distancia=" + distancia + ", sato=" + sato + '}';
    }
    
}
