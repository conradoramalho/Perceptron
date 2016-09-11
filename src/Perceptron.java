import java.util.Random;

public class Perceptron {
	
	double[] pesos;
    double txaprendizagem = 0.5;
    double wbias = 0;
    public void TreinarPerceptron(int[][] entradas, int[] saidasEsp,   int treinarvezes)
    {
	        int tamEntradas = entradas[0].length;
	        int tamSaidasEsp = saidasEsp.length;
	        pesos = new double[tamEntradas];
	        
	    	for(int i=0;i<tamEntradas;i++)
	        {
	            pesos[i] = 1;
	        }
	    	
	    	for(int i=0;i< treinarvezes;i++)
	        {
	            int totalErro = 0;
	            for(int j=0;j < tamSaidasEsp;j++)
	            {
	                int saida = SaidaY(entradas[j]);
	                int erro = saidasEsp[j] - saida;
	                
	                totalErro +=erro;
	               
	                for(int k = 0;k < tamEntradas;k++)
	                {
	                    double delta = txaprendizagem * entradas[j][k] * erro;
	                    pesos[k] += delta;
	                    wbias += delta;
	                }
	                

	         }
	            if(totalErro == 0)
	                break;
	        }

	    }
    public int SaidaY(int[] entradas)
    {
        double net = 0;
        for(int i=0; i<entradas.length; i++)
        {
            net += pesos[i] * entradas[i] + wbias;
        }

        if(net > 0)
            return 1;
        else
            return 0;
    }
}