/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculosmatematicos;

/**
 *
 * @author FATEC ZONA LESTE
 */
public class CalculosMatematicos {

    public static void main(String[] args) {
        //Eu sou Luís Guilherme e estou fazendo minhas primeiras fórmulas para calcular áreas
 
   //Valor das variáveis
   double N1 = 10;
   double N2 = 5;
   double N3 = 9;
   double L = 15;
   double B = 14;
   double H = 8;
   double D = 6;
   double d = 4;
   double Pi = 3.14;
   double r = 7;
   double SV = 3;
   //Operações Matemáticas
   double quadrado = L * L; //Área do quadrado
   double retangulo = B * H;//Área do retângulo
   double losango = (D * d)/ 2;//Área do losango
   double triangulo = (B * H)/ 2;//Área do triângulo
   double circunferencia = Pi * (r * r);//Comprimento da circunferência
   double media = (N1 + N2 + N3)/ SV;//Calculo da média
   double soma = N1 + N2;
   double subtracao = N1 - N2;
   double multiplicacao = N1 * N2;
   double divisao = N2 != 0 ? N1/ N2 : Double.NaN;
   double resto = N1 % N2;
   
   //Exibindo resultados
   System.out.println("Resultado das operações:");
   System.out.println("Área do quadrado: " + quadrado);
   System.out.println("Área do retângulo: " + retangulo);
   System.out.println("Área do losango: " + losango); 
   System.out.println("Área do triângulo: " + triangulo);
   System.out.println("Cálculo da área da cincunferência: " + circunferencia);
   System.out.println("Média: " + media);
   System.out.println("Soma" + soma);
   System.out.println("Subtração: "+ subtracao);
   System.out.println("Multiplicação: " + multiplicacao);
   System.out.println("Divisão: " + (N2 != 0 ? divisao : "Indefinida (divisão por zero)"));
   System.out.println("Resto da divisão: " + resto);
   
    
    }
}
