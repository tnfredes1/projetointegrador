/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;


import java.util.Scanner;

/**
 *
 * @author tnfre
 */
public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double base, expoente;
        System.out.println("Insira base: ");
        base = leitor.nextInt();
        System.out.println("Insira expoente: ");
        expoente = leitor.nextInt();
        System.out.println("Resultado: "+Math.pow(base, expoente));
                
    }
}
