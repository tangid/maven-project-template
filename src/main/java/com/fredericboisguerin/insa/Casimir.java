package com.fredericboisguerin.insa;

import java.util.ArrayList;
import java.util.Scanner;

public class Casimir {

    private Scanner sc = new Scanner(System.in);

    private Utilisateur utilisateur;
    private ArrayList<String> utilisateurs = new ArrayList<>();

    public Casimir (){}

    public void run()
    {
        boolean run = true;

        System.out.println("Bienvenue dans CASIMIR !\n");

        while (run) {

            switch (menuPrincipal()) {

                case 1:
                    utilisateur = connexion();

                    while (utilisateur != null){

                        switch (selectOption()) {

                            case 1:
                                System.out.println("\nVoici la liste des utilisateurs connectés :");
                                getListeUtilisateursConnectes();
                                System.out.println("\nCependant vous ne pouvez toujours pas leur parler !");
                                break;

                            case 2:
                                System.out.println("\nCette fonctionnalité arrive bientôt !");
                                break;

                            case 3:
                                System.out.println("\nCette fonctionnalité arrive bientôt !");
                                break;
                            case 4:
                                utilisateur = null;
                                System.out.println("\nVous avez été déconnecté !");
                                break;
                            default:
                                System.out.println("\nChoix incorrect !");

                        }

                    }


                    break;
                case 2:
                    run = false;
                    break;
                default:
                    System.out.println("\nChoix incorrect !");


            }

        }

        System.out.println("A bientôt dans CASIMIR !");

    }

    public int menuPrincipal(){

        System.out.println("\n (1) Se connecter");
        System.out.println(" (2) Quitter");
        System.out.print("\nVotre choix : ");

        return sc.nextInt();
    }

    public int selectOption(){

        System.out.println("\n (1) Clavarder");
        System.out.println(" (2) Changer de pseudo");
        System.out.println(" (3) Réduire l'agent");
        System.out.println(" (4) Se déconnecter");
        System.out.print("\nVotre choix : ");

        return sc.nextInt();
    }

    public void getListeUtilisateursConnectes(){

        // Requete UDP à tout le monde pour savoir qui est connecté

    }

    public Utilisateur connexion(){
        String pseudo = "";

        System.out.print("\nEntrez votre pseudo : ");

        while (pseudo == "") {

            sc.nextLine();
            pseudo = sc.nextLine();

            if(pseudoExiste(pseudo)){

                pseudo = "";
                System.out.print("Ce pseudo est déjà pris !\nChoisissez en un autre : ");

            }

        }

        System.out.println("Bonjour "+pseudo+" !");

        return new Utilisateur(pseudo);

    }

    public boolean pseudoExiste(String nvPseudo)
    {

        if(utilisateurs.contains(nvPseudo))
            return true;

        else
            return false;

    }

    public static void main(String[] args){

        Casimir C = new Casimir();
        C.run();

    }

}
