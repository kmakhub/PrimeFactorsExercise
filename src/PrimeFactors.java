import com.sun.tools.javac.util.List;

import java.util.ArrayList;

public class PrimeFactors {

    public static  void main(String[] args) {

                generate(16);
    }

    public static int factor(int n) {
        int f = n;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                f = i;
                break;
            }
        }
        return f;
    }

    public static void generate(int n){

        if (n > 1) {
            factor(n);
            System.out.println(factor(n));
            generate(n / factor(n));
        }
    }
}




