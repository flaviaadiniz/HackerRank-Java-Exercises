package datastructures;

import java.util.Scanner;
import java.math.BigDecimal;


public class BigDecimalArray {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        sc.close();

        for (int i = 0; i < n; i++) {

            BigDecimal num = new BigDecimal(0);

            if (BigDecimal.valueOf(Integer.parseInt(s[i])).compareTo(num) > 0) {

            }



        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
