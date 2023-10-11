
package perulangan3;

import java.util.Scanner;

public class Perulangan3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x;
        System.out.println("Deret program Ganjil");
        System.out.print("Masukan Nilai Maksimal : ");
        x = s .nextInt();
        System.out.println("Deret Bilangan Ganjil");
            int i=1;
            while (i<x){
                System.out.print(i + " ");
                i += 2;
            }
            
                    
    }
    
}
