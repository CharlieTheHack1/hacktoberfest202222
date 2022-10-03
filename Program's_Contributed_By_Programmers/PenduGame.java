class Pendu {
    final String[] listPays = {"Allemagne", "Belgique", "Bulgarie", "Chypre", "Danemark", "Espagne", "Estonie", "Finlande", "France", "Grèce", "Hongrie", "Irlande", "Italie", "Lettonie", "Lituanie", "Luxembourg", "Malte", "Pays-Bas", "Pologne", "Portugal", "Roumanie", "Royaume-Uni", "Slovaquie", "Slovénie", "Suède", "Tchéquie"};

    void principal() {
        testCreerDico();
        testChoisirMot();
        testAffichierReponse();

        System.out.println("Début du jeu :");
        partie(creerDico());
    }

    /**
     * Crée un dictionnaire de mots
     * @return le dictionnaire
     **/
    String[] creerDico() {
        String[] dico = listPays;
        return dico;
    }
    
    /**
     * teste la méthode creerDico
     **/
    void testCreerDico() {
        System.out.println();
        System.out.println("*** testCreerDico()");
        testCasCreerDico(listPays);
    }

    /**
     * teste un appel de creerDico
     * @param dico dictionnaire attendu
     */
    void testCasCreerDico(String[] dico) {
        System.out.print("creerDico() \t= ");

        if (egaliteTabString(creerDico(), dico)) {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }

    /**
     * teste l'égalité de deux tableaux de String
     * @param t1 tableau de String
     * @param t2 tableau de String
     * @return true si les deux tableaux sont égaux, false sinon
     */
    boolean egaliteTabString(String[] t1, String[] t2) {
        boolean result = true;
        int i = 0;
        while (i < t1.length && result) {
            if (!t1[i].equals(t2[i])) {
                result = false;
            }
            i = i + 1;
        }
        return result;
    }


    /**
     * Choisit un mot au hasard dans le dictionnaire
     * @param dico le dictionnaire de mots
     **/
    String choisirMot(String[] dico) {
        int random = (int) (Math.random() * creerDico().length);
        return dico[random];
    }

    /**
     * teste la méthode choisirMot
     **/
    void testChoisirMot() {
        System.out.println();
        System.out.println("*** testChoisirMot()");
        testCasChoisirMot(creerDico());
    }

    /**
     * teste un appel de choisirMot
     * @param dico dictionnaire attendu
     */
    void testCasChoisirMot(String[] dico) {
        System.out.print("choisirMot() \t= ");

        if (choisirMot(dico) == "Allemagne" || choisirMot(dico) == "Belgique" || choisirMot(dico) == "Danemark" || choisirMot(dico) == "Espagne" || choisirMot(dico) == "France" || choisirMot(dico) == "Italie" || choisirMot(dico) == "Luxembourg" || choisirMot(dico) == "Pays-Bas" || choisirMot(dico) == "Portugal" || choisirMot(dico) == "Royaume-Uni") {
            System.out.println("OK");
        } else {
            System.err.println("ERREUR");
        }
    }


    /**
     * Affiche le mot avec les lettres trouvées et les lettres non trouvées remplacées par des tirets
     * @param reponse le mot à afficher
     */
    void afficherReponse(char[] reponse) {
        for (int i = 0; i < reponse.length; i++) {
            System.out.print(reponse[i]);
        }
        System.out.println();
    }

    /**
     * teste la méthode afficherReponse
     **/
    void testAffichierReponse() {
        System.out.println();
        System.out.println("*** testAffichierReponse()");
        testCasAfficherReponse(new char[] {'A', 'l', 'l', 'e', 'm', 'a', 'g', 'n', 'e'}, "Allemagne");
        testCasAfficherReponse(new char[] {'B', 'e', 'l', 'g', 'i', 'q', 'u', 'e'}, "Belgique");
        testCasAfficherReponse(new char[] {'D', 'a', 'n', 'e', 'm', 'a', 'r', 'k'}, "Danemark");
    }

    /** teste un appel à afficherReponse()
     * @param reponse tableau des réponse à afficher
     */
    void testCasAfficherReponse(char[] reponse, String result) {
        // Arrange
        System.out.print("afficherReponse (");
        afficherTabChar(reponse);
        System.out.print(") \t= " + result + " : ");
        // Act
        afficherReponse(reponse);
    }


    /**
     *  Affiche le mot a evec des '_'
     * @param lg la longueur du mot
     * @return le mot avec des '_'
     */
    char[] creerReponse(int lg) {
        char[] reponse = new char[lg];
        for (int i = 0; i < reponse.length; i++) {
            reponse[i] = '_';
        }
        return reponse;
    }

    /**
     * Teste si la lettre est dans le mot
     * @param mot le mot
     * @param reponse le mot avec les lettres trouvées
     * @param car le caractère à tester
     * @return vrai ssi la lettre est dans le mot
     */
    boolean tester (String mot, char[] reponse, char car) {
        boolean result = false;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) == car) {
                reponse[i] = car;
                result = true;
            }
        }
        return result;
    }


    /**
     * estComplet
     * @param mot le mot
     * @param reponse le mot avec les lettres trouvées
     * @return vrai ssi le mot est complet
     */
    boolean estComplet (String mot, char[] reponse) {
        boolean result = true;
        for (int i = 0; i < mot.length(); i++) {
            if (mot.charAt(i) != reponse[i]) {
                result = false;
            }
        }
        return result;
    }

    void partie(String[] dico) {
        String mot = choisirMot(dico);
        char[] reponse = creerReponse(mot.length());
        afficherReponse(reponse);
        int nbEssais = 9;
        while (nbEssais > 0 && !estComplet(mot, reponse)) {
            char car = SimpleInput.getChar("Proposez une lettre : ");
            if (tester(mot, reponse, car)) {
                System.out.println("Bravo !");
            } else {
                nbEssais = nbEssais - 1;
                System.out.println("Dommage ! Il reste " + nbEssais + " essais restants");
            }
            afficherReponse(reponse);
        }
        if (estComplet(mot, reponse)) {
            System.out.println("Bravo, vous avez gagné !");
        } else {
            System.out.println("Dommage, vous avez perdu !");
        }
    }

     /**
     * affiche un tableau d’entiers
     * @param t tableau d’entiers
     */
    void afficherTabChar(char[] t) {
        System.out.print("[");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
    
    void afficherTabString(String[] t) {
        System.out.print("[");
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i]);
            if (i < t.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }
}


