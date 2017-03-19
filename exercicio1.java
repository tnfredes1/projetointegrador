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
public class exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, mult;
        
        System.out.println("Numero 1: ");
        n1 = leitor.nextInt();
        System.out.println("Numero 2: ");
        n2 = leitor.nextInt();
        mult = n1*n2;
        System.out.println("Resultado = "+ mult);
    }
}
