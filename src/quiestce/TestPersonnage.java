/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.util.ArrayList;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class TestPersonnage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Personnage p1=new Personnage ("Adam");
        Personnage p2=new Personnage ("Adam");
        System.out.println(p1.equals(p2));
        Caracteristique car=new Caracteristique ("sexe", "est un homme");
        Caracteristique car2=new Caracteristique ("barbe", "a une barbe");
        p1.ajouterCaract(car);
        p1.ajouterCaract(car2);
        System.out.println (p1);
        System.out.println(p1.equals(p2));
        
    }
    
}
