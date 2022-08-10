package Leetcode;


public class _204CountPrimes {
    public static void main(String[] args) {
        System.out.println(countPrimesWithSieveOfEratosthenes(0));
    }

    public static int countPrimesWithSieveOfEratosthenes(int n) {
        int count = 0;
        boolean[] primes = new boolean[n+1];
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * i; j <= n; j += i)
                    primes[j] = true;
            }
        }
        for (int i = 2; i < n; i++) {
            if (!primes[i]) count++;
        }
        return count;
    }



    //Time Limit Exceeded
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) count++;
        }
        return count;
    }

    boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
