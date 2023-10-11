
package perulangan.pkg1;

import java.util.Scanner;

public class Perulangan1 {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int awal, akhir;
        System.out.println("Deret program Ganjil");
        System.out.println("Masukan pilihan angka");
        System.out.print("Masukan Nilai Awal : ");
        awal = s.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir = s.nextInt();
        System.out.println("Deret Bilangan Ganjil");
            for(int i=awal;i<=akhir;i++){
            if (i%2!=0)
            System.out.print(i+" ");
                    } 
                    
        }
       
        }
       
    
    

