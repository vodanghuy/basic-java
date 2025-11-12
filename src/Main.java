import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> superPrimeNumber = new LinkedList<>();
        int input = scanner.nextInt();
        for(int i = 2; i <= input && i <= 9; i++){
            if(isPrime(i)){
                superPrimeNumber.add(i);
            }
        }
        while (!superPrimeNumber.isEmpty()){
            int front = superPrimeNumber.peek();
            for(int i = 1; i <= 9; i++){
                int k = front*10 + i;
                if(k <= input && isPrime(k)){
                    superPrimeNumber.add(k);
                }
            }
            System.out.print(superPrimeNumber.peek() + " ");
            superPrimeNumber.poll();
        }
    }

    static boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}