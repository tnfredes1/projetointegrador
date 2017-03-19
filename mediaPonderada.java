/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritimos1;

import java.util.Scanner;

/**
 *
 * @author tnfre
 */
public class mediaPonderada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float n1, n2, media;
        float P1, P2;
        P1 = 0.4f;
        P2 = 0.6f;
        System.out.println("Nota 1: ");
        n1 = leitor.nextFloat();
        System.out.println("Nota 2: ");
        n2 = leitor.nextFloat();
        media = (n1*P1)+(n2*P2);
        System.out.println("Media: "+ media);
        //System.out.printf permite formatar como as informações serão
        //apresentadas. "\n" pula linha, %.2 define a quantidade de 
        //casas decimais
        System.out.printf("Nota 1: %.2f \n Nota2: %.2f \n Media: %.3f", n1, n2, media);
        
    }
}
