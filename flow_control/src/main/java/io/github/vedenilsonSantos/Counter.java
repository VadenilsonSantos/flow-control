package io.github.vedenilsonSantos;

import io.github.vedenilsonSantos.exceptions.InvalidParamsException;

import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = sc.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }catch (InvalidParamsException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws InvalidParamsException {
        if (parametroUm > parametroDois){
            throw new InvalidParamsException();
        }else {

            int contagem = parametroDois - parametroUm;
         for (int i = 0; i < contagem; i++){
             System.out.println("Imprimindo numero: " + (i+1));
         }
        }
    }
}