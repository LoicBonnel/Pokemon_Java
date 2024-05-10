public class Insecte extends Pokemon{
    int nbrPattes;
    int nombreAiles;

    public void Insecte (int nbrPattes, int nombreAiles) {
        this.nbrPattes = nbrPattes;
        this.nombreAiles = nombreAiles;
    }

    public void vitesseSol(double taille, int nbrPattes){
        double vitesse = nbrPattes * taille * 3 ;
    }

    public void vitesseAir(double taille, int nombreAiles){
        double vitesse = nombreAiles * taille * 10 ;
    }

    public void ToString (){
        System.out.println("Je suis le Pokémon " + nom + " mon poids est de " + poidKG + " KG, ma vitesse au sol est de " + vitesse + " km/h, en vol est de " + vitesseAir + " Km/h, j'ai " + nbrPattes + " pattes, ma taille est de " + taille + " mon activité est de buttiner, ma fréquence cardiaque est de 120 pulsations par minutes");
    }
}
