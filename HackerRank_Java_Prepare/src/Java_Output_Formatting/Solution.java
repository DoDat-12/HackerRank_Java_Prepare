package Java_Output_Formatting;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            for(int j=s1.length()+1; j<=15; j++) {
                s1 = s1 + " ";
            }
            if(x < 10) System.out.println(s1 + "00" + x);
            else if(x < 100) System.out.println(s1 + "0" + x);
            else System.out.println(s1 + x);
        }
        System.out.println("================================");

    }
}