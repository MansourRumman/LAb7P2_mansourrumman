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
public class astro implements Serializable {
   private int id,peso,mis;
   private String nom, apel,nac,tit,fis;

    public astro(int id, String nom, String apel, String nac, String tit, String fis, int peso, int mis) {
        this.id = id;
        this.peso = peso;
        this.mis = mis;
        this.nom = nom;
        this.apel = apel;
        this.nac = nac;
        this.tit = tit;
        this.fis = fis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getMis() {
        return mis;
    }

    public void setMis(int mis) {
        this.mis = mis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getNac() {
        return nac;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public String getFis() {
        return fis;
    }

    public void setFis(String fis) {
        this.fis = fis;
    }

    @Override
    public String toString() {
        return "astro{" + "id=" + id + ", peso=" + peso + ", mis=" + mis + ", nom=" + nom + ", apel=" + apel + ", nac=" + nac + ", tit=" + tit + ", fis=" + fis + '}';
    }
   
}
