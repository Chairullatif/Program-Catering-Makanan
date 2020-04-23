
package catering_makanan;

import java.util.Scanner;

public class Catering_makanan {

    public static void main(String[] args) {
        Scanner input = new Scanner( System.in ); 
        int pil1,jml, n = 0;
        do{
        System.out.println("Chairullatif Aji S (21120119120015)");
        System.out.println("Nurhaidah (21120119120003)");
        System.out.println("Kelompok 24");
        System.out.println("Shift 1\n"); 
        System.out.println("======CATERING ENAK MURAH======");
        System.out.println("Silahkan pilih menu yang anda inginkan: ");
        System.out.println("<1> Menu 1\t\t Rp. 18.000,00");
        System.out.println("<2> Menu 2\t\t Rp. 25.000,00");
        System.out.println("<3> Nasi Tumpeng\t Rp. 50.000,00 ");
        System.out.println("<0> Keluar ");
        System.out.print("Pilih: ");
        pil1 = input.nextInt();
        menu menu = new menu();
        total porsi = new total();
        if (pil1==1){            
            menu.menu1();
            pil1 = input.nextInt();
            if (pil1==1){
                System.out.print("Masukkan jumlah porsi yang akan dibeli: ");
                jml = input.nextInt();
                porsi.porsi1(jml); 
                System.out.print("Masukkan\n <9> Untuk kembali \n <0> Untuk keluar \nPilih: ");
                pil1 = input.nextInt();
            }
        }else if (pil1==2){
            menu.menu2();   
            pil1 = input.nextInt();
            if (pil1==1){
                System.out.print("Masukkan jumlah porsi yang akan dibeli: ");
                jml = input.nextInt();
                porsi.porsi1(jml); 
                pil1=0;
                System.out.print("Masukkan\n <9> Untuk kembali \n <0> Untuk keluar \nPilih: ");
                pil1 = input.nextInt();
            }
        }else{
            menu.menu3();   
            pil1 = input.nextInt();
            if (pil1==1){
                System.out.print("Masukkan jumlah porsi yang akan dibeli: ");
                jml = input.nextInt();
                porsi.porsi1(jml); 
                pil1=0;
                System.out.print("Masukkan\n <9> Untuk kembali \n <0> Untuk keluar \nPilih: ");
                pil1 = input.nextInt();
               }
            }
        }while (pil1!=0);
            System.out.println("--------Terimakasih sudah membeli--------");
   }
}
