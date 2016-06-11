/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiestce;

/**
 *
 * @author YassineTaouil@gmail.com
 */
class Questions {

    private String gender;
    private String hat;

    private String blond_hair;
    private String brown_hair;
    private String black_hair;
    private String red_hair;
    private String white_hair;

    private String Brown_eyes;
    private String glasses;

    private String mustache;
    private String beard;

    private String big_nose;
    private String big_mouth;
    private String earring;

    private String Question;

    public Questions(String texte) {
        this.Question = texte;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String texte) {
        this.Question = texte;
    }

    @Override
    public String toString() {
        return "Questions{" + "texte=" + this.Question + '}' + "\n";
    }

    public void select_gender(String gender) {
        this.gender = gender;
    }

    public void select_hat(String hat) {
        this.hat = hat;
    }

    public void select_brown_hair(String hair) {
        this.brown_hair = hair;
    }

    public void select_black_hair(String hair) {
        this.black_hair = hair;
    }

    public void select_white_hair(String hair) {
        this.white_hair = hair;
    }

    public void select_red_hair(String hair) {
        this.red_hair = hair;
    }

    public void select_blond_hair(String hair) {
        this.blond_hair = hair;
    }

    public void select_eyes(String Brown_eyes) {
        this.Brown_eyes = Brown_eyes;
    }

    public void select_glasses(String glasses) {
        this.glasses = glasses;
    }

    public void select_mustache(String mustache) {
        this.mustache = mustache;
    }

    public void select_beard(String beard) {
        this.beard = beard;
    }

    public void select_nose(String big_nose) {
        this.big_nose = big_nose;
    }

    public void select_mouth(String big_mouth) {
        this.big_mouth = big_mouth;
    }

    public void select_earring(String earring) {
        this.earring = earring;
    }

    String search_in_database() {
        BaseDeConaissance database = new BaseDeConaissance();
        database.lireFichier("quiestce_binaire_questions.csv");
        System.out.println("Database charged");
        EnsembleDesQuestions q = new EnsembleDesQuestions();
        q.lireFichier("quiestce_binaire_questions.csv");
        boolean Truth_Table[] = new boolean[14];
        for (int i = 0; i < database.listPer.size(); i++) {
            Personnage character = database.listPer.get(i);
            for (int k = 0; k < 14; k++) {
                Truth_Table[k] = false;
            }
            for (int j = 0; j < database.listPer.get(i).listCar.size(); j++) {

                Caracteristique characteristic = database.listPer.get(i).listCar.get(j);

                if (j == 0) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(gender)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 1) {

                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(hat)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 2) {

                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(blond_hair)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 3) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(brown_hair)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 4) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(black_hair)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 5) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(red_hair)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 6) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(white_hair)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 7) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(Brown_eyes)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 8) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(glasses)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 9) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(beard)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 10) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(mustache)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 11) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(big_nose)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 12) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(big_mouth)) {
                            Truth_Table[j] = true;
                        }
                    }
                } else if (j == 13) {
                    if (characteristic.getLibelle().equals(q.get_question(j))) {
                        if (characteristic.getReponse().equals(earring)) {
                            Truth_Table[j] = true;
                        }
                    }
                }

            }
            boolean tmp = true;

            for (int f = 0;
                    f < 14; f++) {
                if (!Truth_Table[f]) {
                    tmp = false;
                }
            }
            if (tmp) {
                return database.listPer.get(i).getPrenom();
            }

        }

        return "error not found";
    }

}
