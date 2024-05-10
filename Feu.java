public class Feu extends Pokemon{
    int nbrbouleFeuMinute;
    double puissanceFeu;
    int nbrPattes;


    public void Addict (int nbrbouleFeuMinute, double puissanceFeu) {
        this.nbrbouleFeuMinute = nbrbouleFeuMinute;
        this.puissanceFeu = puissanceFeu;
    }

    public void vitesseSol(double taille, int nbrPattes){
        double vitesse = nbrPattes / 25 * taille;
    }

    public void ToString (){
        System.out.println("Je suis le Pokémon " + nom + " mon poids est de " + poidKG + " KG, ma vitesse au sol est de " + vitesse + " Km/h j'ai " + nbrPattes + " pattes, ma taille est de " + taille + "m mon activité est de buttiner, ma fréquence cardiaque est de 120 pulsations par minutes");}
