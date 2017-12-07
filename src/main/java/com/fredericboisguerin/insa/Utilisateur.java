package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.HashMap;

public class Utilisateur {

    private String pseudo;

    private HashMap<Utilisateur,ArrayList<Message>> historique;

    public Utilisateur(String pseudo)
    {

        this.pseudo = pseudo;
        this.historique = new HashMap<>();

    }

    public String getPseudo()
    {
        return pseudo;
    }

    public ArrayList<Message> getHistorique(Utilisateur correspondant)
    {
        return historique.get(correspondant);
    }


    public void setPseudo(String nvPseudo)
    {
        pseudo = nvPseudo;
    }


}
