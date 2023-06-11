package Java_End_of_file;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String input;
        int i = 1;
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNext()) {
                input = scan.nextLine();
                System.out.println(i + " " + input);
                i = i + 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}