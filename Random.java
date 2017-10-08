import java.util.Scanner;

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
        System.out.println("\nIn order:");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        if(a == 0){
            System.out.println("\nArray was created already in order!");
        }else{
            System.out.println("\nThe number of attempts were: " + a);
        }
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

    public static int[] randomArray(int size){
        System.out.println("The array is:");
        int[] rArray = new int[size];
        for(int i = 0; i<size; i++){
            rArray[i] = (int) (Math.random()*100);
            System.out.print(rArray[i] + " ");
        }
        return rArray;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What array size do you want?\nWARNING: SIZES ABOVE 12 MIGHT TAKE A WHILE");
        int size = scanner.nextInt();

        long startTime = System.nanoTime();

        randomSort(randomArray(size));

        long elapsedTime = System.nanoTime() - startTime;
        double tempo = (double) elapsedTime/1000000000;
        System.out.println("\nElapsed time: " + tempo + " seconds.");
    }
}
