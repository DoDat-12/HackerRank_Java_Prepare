package Java_Loops_II;
import java.util.*;
class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int S = a + b;
            System.out.print(S + " ");
            int temp = b*2;
            for (int j = 1; j < n; j++) {
                S = S + temp;
                System.out.print(S + " ");
                temp = temp*2;
            }
            System.out.println();
        }
        in.close();
    }
}