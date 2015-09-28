package voitures;

public class Garage {

    private Auto The_garage[];
    private int tailleMaxGarage;
    private int nombreAutos;

    Garage(int taille_max_garage) {
        this.The_garage = new Auto[taille_max_garage];
        this.nombreAutos = 0;
        this.tailleMaxGarage = taille_max_garage;
    }

    void ajouter(Auto a) {
        if (this.nombreAutos < this.tailleMaxGarage) {
            this.The_garage[this.nombreAutos] = a;
            this.nombreAutos++;
        } else {
            System.out.println("Garage d�j� satur�");
        }
    }

    void afficher() {
        System.out.println("Affichage du garage");
        System.out.println();
        for (int i = 0; i < this.nombreAutos; i++) {
            System.out.println("   Voiture num�ro " + i + " :");
            this.The_garage[i].afficher();
            System.out.println();
        }
    }

    //-----------------------------------------------------------------
    public int f1(String m) {
        int compteur = 0;
        for (Auto auto : this.The_garage) {
            if (auto != null && auto.getMarque() == m) {
                compteur++;
            }
        }
        return compteur;
    }

    public int f2(String m) {
        int compteur = 0;
        for (Auto auto : this.The_garage) {
            if (auto != null && auto.getModele() == m) {
                compteur++;
            }
        }
        return compteur;
    }

    public int f3() {
        int compteur = 0;
        for (Auto auto : this.The_garage) {
            if (auto != null) {
                compteur++;
            }
        }
        return compteur;
    }

    public boolean f4() {
        return this.nombreAutos == 0;
    }

    public int f5() {
        int indice = 0;
        float conso = 100;
        int compteur = 0;
        for (Auto auto : this.The_garage) {
            compteur++;
            if (auto != null && auto.getConso() < conso) {
                conso = auto.getConso();
                indice = compteur;
            }
        }
        return indice;
    }

    public int f6() {
        int indice = 0;
        for (int i = 1; i < nombreAutos; i++) {
            if (The_garage[i].getPrix() > The_garage[indice].getPrix()) {
                indice = i;
            }
        }
        return indice;
    }

    public float f7() {
        float prixFaible = 1000000000000.00f;
        float prixFort = 0;
        for (Auto auto : this.The_garage) {
            if (auto != null && auto.getPrix() < prixFaible) {
                prixFaible = auto.getPrix();
            }
            if (auto != null && auto.getPrix() > prixFort) {
                prixFort = auto.getPrix();
            }
        }
        return (prixFort - prixFaible);
    }

    public int f8() {
        if (this.nombreAutos == 0) {
            return 0;
        }
        int total = 0;
        for (int i = 0; i < nombreAutos; i++) {
            total += this.The_garage[i].getKilometrage();
        }

        return total/nombreAutos;
    }

    public int f9() {
        int indice = 0;
        float prix = 100000000000000.00f;
        int compteur = 0;
        for (Auto auto : this.The_garage) {
            compteur++;
            if (auto != null && auto.getPrix() < prix && auto.getNbPortes() == 5 && auto.getNbPlaces() >= 5) {
                prix = auto.getPrix();
                indice = compteur;
            }
        }
        indice = (indice == 0) ? -1 : indice;
        return indice;
    }

    public int f10(int n, int k) {
        int indice = -1;
        for (int i = 0; i < nombreAutos; i++) {
            if (The_garage[i].getNbPortes() >= n && The_garage[i].getKilometrage() <= k) {
                if (indice == -1 || (The_garage[i].getPrix() < The_garage[indice].getPrix())) {
                    indice = i;
                }
            }
        }
        return indice;
    }

}
