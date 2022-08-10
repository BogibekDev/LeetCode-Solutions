package Leetcode;

import java.util.HashMap;

public class _509FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(12));
    }

     public static int fib(int n) {
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 0);
        map.put(1, 1);

        for (int i = 2; i <= n; i++) {
            map.put(i, map.get(i - 2) + map.get(i - 1));
        }

        return map.get(n);
    }
}

