public class Addict extends Pokemon {
    int nbrPattes;
    int niveauJeux;
    double nbrHeureReseaux;

    public void Addict (int nbrPattes, int niveauJeux, double nbrHeureReseaux) {
        this.nbrPattes = nbrPattes;
        this.niveauJeux = niveauJeux;
        this.nbrHeureReseaux = nbrHeureReseaux;
    }

    public void vitesseSol(double taille, int nbrPattes){
        double vitesse = nbrPattes * taille * 2 ;
    }

    public void ToString (){
        System.out.println("Je suis le Pokémon " + nom + " addict mon poids est de " + poidKG + " KG, ma vitesse au sol est de " + vitesseSol + " j'ai " + nbrPattes + " pattes, ma taille est de " + taille + " mon activité est de ZILONER, ma fréquence cardiaque est de 120 pulsations par minutes");
    }
}
