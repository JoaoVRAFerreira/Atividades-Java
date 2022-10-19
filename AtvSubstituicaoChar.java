
package com.mycompany.atividadesdejava;

import java.util.Scanner;

public class AtvSubstituicaoChar {

    public static void main(String[] args) 
    {
     Scanner leia = new Scanner(System.in);
     
     System.out.println("Digite sua frase: ");
     String frase = leia.nextLine();
     
     System.out.println("Digite qual letra você quer substituir: ");
     String letra1 = leia.nextLine();
     
     System.out.println("Digite qual letra você quer substituir pela " + letra1 + ": ");
     String letra2 = leia.nextLine();
     
     String nova = frase.replace(letra1, letra2);
     System.out.println(nova);
    }
}
