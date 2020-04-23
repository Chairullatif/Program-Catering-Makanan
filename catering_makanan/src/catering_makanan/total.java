
package catering_makanan;

public class total {
    public int porsi1(int jumlah){
        int pembayaran = 18000*jumlah;
        System.out.println("Anda memesan dengan jumlah: "+jumlah+" Dengan total pembayaran adalah: Rp. "+pembayaran);
        return pembayaran;
    }  
    public int porsi2(int jumlah){
        int pembayaran = 25000*jumlah;
        System.out.println("Anda memesan dengan jumlah: "+jumlah+" Dengan total pembayaran adalah: Rp. "+pembayaran);
        return pembayaran;
    } 
    public int porsi3(int jumlah){
        int pembayaran = 50000*jumlah;
        System.out.println("Anda memesan dengan jumlah: "+jumlah+" Dengan total pembayaran adalah: Rp. "+pembayaran);
        return pembayaran;
    } 
}
