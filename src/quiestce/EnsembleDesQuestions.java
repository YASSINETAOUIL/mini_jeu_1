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
 * @author kbouyahi
 */
public class EnsembleDesQuestions {

    private ArrayList<Questions> listQst;
    private boolean reponse;

    public EnsembleDesQuestions() {
        this.listQst = new ArrayList<Questions>();
        // this.reponse = reponse;
    }

    public String get_question(int index) {
        return this.listQst.get(index).getQuestion();
    }


    public void lireFichier(String nomDeFichier) {
        try {
            BufferedReader fichier = new BufferedReader(new FileReader(nomDeFichier));
            String ligne;
            ligne = fichier.readLine();
            String libelle[] = ligne.split(";");

            for (int i = 1; i < libelle.length; i++) {
                Questions q = new Questions(libelle[i]);
                this.listQst.add(q);
            }

            fichier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BaseDeQuestions{" + "\n" + "listQst=" + listQst + '}';
    }

}
