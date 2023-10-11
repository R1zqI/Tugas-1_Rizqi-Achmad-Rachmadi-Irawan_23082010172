
package perulangan2;

import java.util.Scanner;

public class Perulangan2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Perulangan bersarang");
        System.out.print("Masukan N = ");
        int N = s.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j = 1 ; j <= i; j++) {
                System.out.print(j+"");
            }
            System.out.println();
        } 
            
    }
    
}
