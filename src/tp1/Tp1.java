/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choix;

        do {

            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. Addition");
            System.out.println("2. Multiplication");
            System.out.println("3. Moyenne");
            System.out.println("4. Trouver le plus grand");
            System.out.println("0. Quitter");

            System.out.print("Choisissez une option : ");
            choix = sc.nextInt();

            switch (choix) {

                case 1:
                    System.out.print("Entrez deux entiers : ");

                    int a = sc.nextInt();
                    int b = sc.nextInt();

                    System.out.println(
                        "Résultat : " + Calculatrice.addition(a, b)
                    );

                    break;

                case 2:
                    System.out.print("Entrez deux entiers : ");

                    int x = sc.nextInt();
                    int y = sc.nextInt();

                    System.out.println(
                        "Résultat : " + Calculatrice.multiplication(x, y)
                    );

                    break;

                case 3:
                    System.out.print("Combien de valeurs ? ");
                    int n = sc.nextInt();

                    int[] valeurs = new int[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print("Valeur " + (i + 1) + " : ");
                        valeurs[i] = sc.nextInt();
                    }

                    System.out.println(
                        "Moyenne : " + Calculatrice.moyenne(valeurs)
                    );

                    break;

                case 4:
                    System.out.print("Combien de nombres ? ");
                    int m = sc.nextInt();

                    int[] entiers = new int[m];

                    for (int i = 0; i < m; i++) {
                        System.out.print("Nombre " + (i + 1) + " : ");
                        entiers[i] = sc.nextInt();
                    }

                    System.out.println(
                        "Maximum : " + Calculatrice.maximum(entiers)
                    );

                    break;

                case 0:
                    System.out.println("Fin du programme.");
                    break;

                default:
                    System.out.println("Option invalide !");
            }

        } while (choix != 0);

        sc.close();
    }
    
}
