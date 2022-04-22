/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latConsole;
import java.util.Scanner;
import latConsole.mthodClass.Data;
/**
 * @author toya
 */
public class apl {
    private static int bayr;
    private static double Total;
public static void main(String [] args){
    Scanner input= new Scanner (System.in);
        Data[] data = new Data[0];
int x,n,i,ttl=0;
double jml, har;
int menu;
String jawab;
boolean running = true;
System.out.println("DATA PENJUALAN BARANG");
System.out.println("PT 'PUMLANG TAMA' ");
System.out.println("Nama Kasir: ALIF AINNUN QOYUM");
System.out.println("masukan jumlah data penjualan barang"); x=input.nextInt();
data= new Data[x];
for( n=0;n<x;n++){
    data[n] = new Data();
    System.out.println("Data :\t"+(n+1));
    System.out.print("kode barang  \t"); data[n].setKbarang(input.next());
    System.out.print("nama barang  \t"); data[n].setNbarang(input.next());
    System.out.print("harga barang \t"); har=input.nextFloat();
    System.out.print("jumlah barang\t"); jml=input.nextFloat();
    data[n].setHbarang(har);
    data[n].setJbeli(jml);
    ttl=(ttl+data[n].getbayr());
    data[n].setTotal(ttl);
    input.nextLine();
    }
data[0].setTotal(ttl);  
System.out.println("tampilkan data\t");
System.out.println("no\tKode Barang\tNama Barang\tHarga Barang\tJumlah Barang\tBayar");
for(n=0;n<data.length;n++){    
   
    System.out.println("no. "+(n+1)+"\t"+data[n].getKbarang()+"\t\t"+data[n].getNbarang()+"\t\tRp."+data[n].getHbarang()+"\t\t"+data[n].getJbeli()+"\tRp."+data[n].getbayr());
}
System.out.println("========================================================");

        System.out.println("Jumlah Bayar :\t"+data[0].getTotal());
        System.out.println(data[0].getJdiskon());
        System.out.println("ppn              :Rp.\t"+data[0].getPpn());
        System.out.println("1. Visa-Card");
        System.out.println("2. Debit atau Cash");
        System.out.println("metode pembayaran"); menu=input.nextInt();
    if(menu==1){
        System.out.println("Biyaya Visa-Master/tYa/tBiyaya kartu Rp."+data[0].getCard());
        System.out.println("Total Bayar/tRp."+data[0].getTkartu());
    }
    else{
    System.out.println("Total Bayar/tRp."+data[0].getJadibyr());
    }
    System.out.println("Ada Data Lagi[IYA/TIDAK]"); jawab=input.nextLine();
    if(jawab.equalsIgnoreCase("ya")){
    running = false;}
    else{
    System.exit(0);}
    }     
}
