/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

/**
 *
 * @author hp
 */
public class Calculatrice {

    
    public static int addition(int a, int b) {
        return a + b;
    }

    
    public static int multiplication(int a, int b) {
        return a * b;
    }

    
    public static double moyenne(int... valeurs) {
        int total = 0;

        for (int v : valeurs) {
            total += v;
        }

        return (double) total / valeurs.length;
    }

    
    public static int maximum(int... valeurs) {
        int max = valeurs[0];

        for (int v : valeurs) {
            if (v > max) {
                max = v;
            }
        }

        return max;
    }

    
}
