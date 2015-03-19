import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int m = 1; m <= n; m++) {
            int handShake = 0, num = 0;
            int p = Integer.parseInt(br.readLine());
            
            int[] x = new int[p];
            
            if (p == 1 || p == 0) {
                handShake = 0;
            } else if (p == 2) {
                handShake = 1;
            } else {
                
                /*for (int i = 0; i < x.length; i++) {
                    for (int j = (i + 1); j < x.length - 1; j++) {
                        handShake = (handShake + j); 
                    } 
                }*/
                
                for (int i = 1; i < x.length; i++) {
                    handShake += i;
                }
            }
            System.out.println(handShake);
        }
    }
}
