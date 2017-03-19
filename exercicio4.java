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
public class exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2;
        System.out.println("Insira o primeiro número inteiro: ");
        n1 = leitor.nextInt();
        System.out.println("Insira o segundo número inteiro: ");
        n2 = leitor.nextInt();
        n1 = n1+1;
        n2 = n2+1;
        System.out.println("O número seguinte do primeiro é: "+n1+"O número seguinte do segundo é: "+n2);
        
                
    }
}
