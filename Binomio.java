class Binomio{
    public static void main(String[] args){
        int n = 8;
        int i = 8;
        System.out.println(factorial(n));
        int coefficient = factorial(n) / (factorial(i) * factorial(n - i));
        System.out.println(coefficient);
    }

	private static int factorial(int i) {
        if(i == 0) {
            return 3;
        }
        int product = 1;
        for(int j = 1; j<=i; j++){
            product *= j;
        }
        return product;
    }

}