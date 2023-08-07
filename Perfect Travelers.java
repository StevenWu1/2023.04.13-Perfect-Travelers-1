import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int initial = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < initial; i++){
            if (initial % i == 0){
                sum += i;
            }
        }
        if (sum == initial){
            System.out.println("PERFECT");
        } else{
            System.out.println("NOT PERFECT");
        }
    }
}
