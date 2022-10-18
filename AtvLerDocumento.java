package com.mycompany.atividadesjava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class AtvLerDocumento {
    public static void main(String[] args) 
   
    {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Bem vindo ao leitor de documentos!");
        System.out.println("Informe o nome do documento: ");
        String nome = leia.nextLine();
        
        System.out.println("Conteudo do texto");
        
        try {
            FileReader arquivo = new FileReader(nome);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha = leitor.readLine();
        while (linha != null) {
         System.out.printf("%s\n", linha);

        linha = leitor.readLine(); 
      }

            arquivo.close();
        }
        catch(IOException error){
            System.err.printf("Erro na abertura do arquivo: %s.\n", error.getMessage());
        }
    }
}
