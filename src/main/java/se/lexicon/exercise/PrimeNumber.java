package se.lexicon.exercise;

public class PrimeNumber {
    static boolean isPrime(int n){
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    void main(){
        for(int i = 2; i <= 50 ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
