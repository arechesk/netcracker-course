package base.ru.netcracker;
import java.math.BigInteger;

public class Factorial {

    static BigInteger recFactorial(int n) {
        if (n==0)
            return BigInteger.valueOf(1);
        return recFactorial(n-1).multiply(BigInteger.valueOf(n));
    }

    static BigInteger loopFactorial(int n){
        BigInteger result=BigInteger.valueOf(1);
        for(int i=1;i<=n;i++)
            result=result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) {
        int N=1000;
        long startTime = System.nanoTime();
        recFactorial(N);
        System.out.println("Find factorial using recursion: "+(System.nanoTime()-startTime));
         startTime = System.nanoTime();
        loopFactorial(N);
        System.out.println("Find factorial using loop: "+(System.nanoTime()-startTime));
    }
}
