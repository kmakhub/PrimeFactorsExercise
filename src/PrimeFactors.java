import com.sun.tools.javac.util.List;

import java.util.ArrayList;

/**
 * Created by kulani makhubele on 15/04/15.
 */
public class PrimeFactors {

    public static  void main(String[] args) {

        ArrayList<Integer> listArray = generate(4);

        for (int i = 0; i < listArray.size(); i++)
        {
            System.out.print(i+",");
        }
    }

    public static ArrayList<Integer> generate(int n){

        ArrayList<Integer> listArray = new ArrayList<Integer>();
            for (int i = 2; i < n; i++) {
                if( n % i == 0) {
                    System.out.print(i+",");
                    listArray.add(i);
                }
            }

       return listArray;

    }
}
