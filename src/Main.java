import java.util.Scanner;

public class Main {
//Ensinar o perceptron a diferenciar numeros pares e impares de até  8 bits
 //Ensinando perceptron com 16 numeros
    public static void main(String[] args) {
        Perceptron perceptron = new Perceptron();
        int entradasEnsinar[][] = {
        			      {1,0,0,0,0,0,0,0},//128
        			  	  {0,0,0,0,0,0,1,1},//3
        				  {0,1,0,0,0,0,1,0},//66
        				  {0,0,0,0,0,1,0,1},//5
        				  {0,0,1,0,0,1,0,0},//36
        				  {0,0,0,0,1,0,0,1},//9
        				  {0,0,0,1,1,0,0,0},//24
        				  {0,0,0,1,0,0,0,1},//17
        				  {0,0,0,1,1,0,0,1},//25
        				  {0,0,1,0,0,0,0,1},//33
        				  {0,0,1,0,0,1,0,0},//36
        				  {0,1,0,0,0,1,0,0},//68
        				  {0,1,0,0,0,0,0,1},//65
        				  {0,1,0,0,0,0,1,0},//66
        				  {1,0,0,0,0,0,0,1},//129
        				  {1,0,0,0,0,0,1,0},//130
        };
        int saidasEsperadas[] = {0,1,0,1,0,1,0,1,1,1,0,0,1,0,1,0};

        perceptron.TreinarPerceptron(entradasEnsinar, saidasEsperadas,16);
        System.out.println(perceptron.Resposta(new int[]{1,1,0,1,0,0,1,0}));//210
        System.out.println(perceptron.Resposta(new int[]{0,0,0,0,0,1,0,0}));//4
        System.out.println(perceptron.Resposta(new int[]{0,1,1,0,0,1,0,0}));//100
        System.out.println(perceptron.Resposta(new int[]{1,0,0,1,0,0,1,0}));//146
        System.out.println("------------------");
        System.out.println(perceptron.Resposta(new int[]{0,0,1,0,0,1,0,1}));//37
        System.out.println(perceptron.Resposta(new int[]{1,0,0,0,0,0,0,1}));//129
        System.out.println(perceptron.Resposta(new int[]{1,1,1,0,0,1,1,1}));//231
        System.out.println(perceptron.Resposta(new int[]{0,0,0,0,0,0,1,1}));//3
        System.out.println("------------------");
        System.out.println(perceptron.Resposta(new int[]{1,1,1,1,1,1,1,1}));//255
        System.out.println(perceptron.Resposta(new int[]{0,0,0,0,0,0,0,0}));//0

    }
	
}
