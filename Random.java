class Random{

    public static void randomSort(int[] vetor){
        double t = (double) vetor.length;
        long a = 0;
        while(!ordenado(vetor)){
            for(int i = 0; i < vetor.length-1; i++){
                int x = (int) (Math.random()*( (vetor.length-1-i) ) +1);
                int aux = vetor[i];
                vetor[i] = vetor[x];
                vetor[x] = aux;
            }
            a++;
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.print("\nO numero de tentativas foi: " + a);
        System.out.println("\nA chance de isso acontecer foi: " + (binomial(t,a))*100 + "%" );
    }

    public static boolean ordenado(int [] vetor){
        boolean sorted = true;
        for(int i = 0; i < vetor.length-1; i++){
            if(vetor[i] > vetor[i+1]){
                sorted = false;
            }
        }
        return sorted;
    }

    public static double binomial(double t, long vezes){
        double b;
        double p = fatorial(t);
        //System.out.println(p);
        //return vezes * p * Math.pow(1-p, vezes-1);
        return 1 - (Math.pow(1-p, vezes));
    }




    public static double fatorial(double num){
        if(num <= 1) return 1;
        else return (1/num)*fatorial(num-1);
    }







    public static void main(String[] args){
        //System.out.println((int) (Math.random()*50 ) );
        int[] num = new int[12];
        double t = (double) num.length;
        for(int i = 0; i<num.length; i++){
            num[i] = (int) (Math.random()*50);
            System.out.println(num[i]);
        }
        long startTime = System.nanoTime();
        randomSort(num);
        long elapsedTime = System.nanoTime() - startTime;
        double tempo = (double) elapsedTime/1000000000;
        System.out.println("\nTempo decorrido: " + tempo + " segundos.");
        //System.out.println( (binomial(t, 40658))*100 + "%");




    }
}
