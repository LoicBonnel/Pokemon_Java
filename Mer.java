public class Mer extends Pokemon {
    int nbrNageoire;

    public void Addict (int nbrbouleFeuMinute) {
        this.nbrbouleFeuMinute = nbrbouleFeuMinute;
    }

    public void vitesseEau(int nbrNageoire, int poidKG){
    double vitesse = poidKG / 25 * nbrNageoire;
    }


    public void ToString (){
        System.out.println("Je suis le Pokémon " + this.nom + " mon poids est de " + this.poidKG + " KG, ma vitesse au sol est de " + vitesse + " Km/h j'ai " + nbrNageoire + " nageoires, ma taille est de " + taille + "m mon activité est de flotter, ma fréquence cardiaque est de 120 pulsations par minutes");
    }
}
