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
public class exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double n1, n2, resultado;
        System.out.println("Insira primeiro número: ");
        n1 = leitor.nextInt();
        System.out.println("Insira segundo número: ");
        n2 = leitor.nextInt();
        resultado = Math.pow(n1, 2)+Math.pow(n2, 2);
        System.out.println("Resultado: "+ resultado);
    }
}
