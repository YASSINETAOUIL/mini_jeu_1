/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.util.Objects;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class Caracteristique {

    private String libelle;
    private String reponse;

    public Caracteristique(String libelle, String reponse) {
        this.libelle = libelle;
        this.reponse = reponse;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    public String toString() {
        return "Caracteristique{" + "libelle=" + libelle + "reponse=" + reponse + '}';
    }

    public String getLibelle() {
        return libelle;
    }

    public String getReponse() {
        return reponse;
    }

    public boolean equals(Object obj) {

        if (obj.getClass().equals(this.getClass())) {

            Caracteristique other = (Caracteristique) obj;

            if (this.libelle.equals(other.libelle)) {
                return true;
            } else {
                return false;
            }
           } else {
                return false;
        }
    }
}
