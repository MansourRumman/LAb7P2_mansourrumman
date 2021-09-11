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
public class naves implements Serializable {
    private String nombre,ID;
    private int cmp,tdes,tat,vel,dm,gtp,gtr,gasto;

    public naves(String nombre, String ID, int cmp, int tdes, int tat, int vel, int dm, int gtp, int gtr, int gasto) {
        this.nombre = nombre;
        this.ID = ID;
        this.cmp = cmp;
        this.tdes = tdes;
        this.tat = tat;
        this.vel = vel;
        this.dm = dm;
        this.gtp = gtp;
        this.gtr = gtr;
        this.gasto = gasto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getCmp() {
        return cmp;
    }

    public void setCmp(int cmp) {
        this.cmp = cmp;
    }

    public int getTdes() {
        return tdes;
    }

    public void setTdes(int tdes) {
        this.tdes = tdes;
    }

    public int getTat() {
        return tat;
    }

    public void setTat(int tat) {
        this.tat = tat;
    }

    public int getVel() {
        return vel;
    }

    public void setVel(int vel) {
        this.vel = vel;
    }

    public int getDm() {
        return dm;
    }

    public void setDm(int dm) {
        this.dm = dm;
    }

    public int getGtp() {
        return gtp;
    }

    public void setGtp(int gtp) {
        this.gtp = gtp;
    }

    public int getGtr() {
        return gtr;
    }

    public void setGtr(int gtr) {
        this.gtr = gtr;
    }

    public int getGasto() {
        return gasto;
    }

    public void setGasto(int gasto) {
        this.gasto = gasto;
    }

    @Override
    public String toString() {
        return "naves{" + "nombre=" + nombre + ", ID=" + ID + ", cmp=" + cmp + ", tdes=" + tdes + ", tat=" + tat + ", vel=" + vel + ", dm=" + dm + ", gtp=" + gtp + ", gtr=" + gtr + ", gasto=" + gasto + '}';
    }
    
}
