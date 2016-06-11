/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class Personnage {
 
    private String prenom;
    public ArrayList<Caracteristique> listCar;
    
public Personnage (String prenom){
   
    this.prenom=prenom;
    this.listCar=new ArrayList<Caracteristique>();
}

public String getPrenom(){
    return this.prenom;
}
public void ajouterCaract(Caracteristique caract){
    this.listCar.add(caract);
}

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personnage other = (Personnage) obj;

        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.listCar, other.listCar)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Personnage{" + " prenom=" + prenom + "listCar=" + listCar + '}' + "\n";
    }
}










