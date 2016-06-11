/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author YassineTaouil@gmail.com
 */
public class BaseDeConaissance {

    public ArrayList<Personnage> listPer;

    public BaseDeConaissance() {
        this.listPer = new ArrayList <Personnage> (0);
    }

    public void lireFichier(String quiestce_binaire_questions) {
        try {
            BufferedReader fichier = new BufferedReader(new FileReader("quiestce_binaire_questions.csv"));
            String ligne;
            ligne = fichier.readLine();
            String libelle[] = ligne.split(";");
            while (fichier.ready()) {
                ligne=fichier.readLine();
                String champs[]=ligne.split(";");
                Personnage p = new Personnage (champs[0]);
                for(int i=1;i<champs.length;i++){
                    Caracteristique c=new Caracteristique(libelle[i],champs[i]);
                    p.ajouterCaract(c);
                }
                this.listPer.add(p);

                }
            fichier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BaseDeConaissance{" + "\n"+ "listPer=" + listPer + '}';
    }
    

}
