/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteulerproblem10;

/**
 *
 * @author Adam
 */
public class ProjectEulerProblem10 {
    public static void main(String[] args) {
        long nthPrime = primeSum(2000000L);
        
        System.out.println(nthPrime);
    }
    
    public static long primeSum(long limit) {
        long sum = 2;
        
        for(long x = 3L; x <= limit; x+=2) {
            if(isPrime(x)) {
                sum += x;
            }
        }
        
        return sum;
    }
    
    /**
     * @param number
     * @return long
     */
    public static long getFactorUpperLimit(long number) {
        long limit = (long) Math.sqrt(number);

        if (limit % 2L == 0L) {
            --limit;
        }

        return limit;
    }

    /**
     * @param number
     * @return boolean
     */
    public static boolean isPrime(long number) {
        if (number == 1L || number == 2L || number == 3L) {
            return true;
        } else if (number % 2 == 0L || number % 3 == 0L) {
            return false;
        }

        long initialCounter = getFactorUpperLimit(number);

        for (long x = 5L; x <= initialCounter; x += 2) {
            if (number % x == 0L) {
                return false;
            }
        }

        return true;
    }
}
