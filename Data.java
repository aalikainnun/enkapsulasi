/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latConsole.mthodClass;

/**
 *
 * @author toya
 */
public class Data {

    private String kbarang, nbarang,adata;
    private double hbarang,jbeli,bayr;
    private int jdiskon,ppn,jadibyr;
    private int diskon,total,card,tkartu; 
     
     public int getJdiskon() {
         if(getTotal()>500000){
            System.out.println("Diskon       :Rp.\t"+getDiskon());
        }
        else{System.out.println("Diskon      :RP.\tanda tidak mendpatkan diskon");}
        return jdiskon;
    }
    public void setJdiskon(int jdiskon) {
        this.jdiskon = jdiskon;
    }
    
    public int getTotal() {
      return total;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }
    
    public String getKbarang() {
        return kbarang;
    }

    public void setKbarang(String kbarang) {
        this.kbarang = kbarang;
    }

    public String getNbarang() {
        return nbarang;
    }

    public void setNbarang(String nbarang) {
        this.nbarang = nbarang;
    }

    public double getHbarang() {
        return hbarang;
    }

    public void setHbarang(double hbarang) {
        this.hbarang = hbarang;
    }

    public double getJbeli() {
        return jbeli;
    }

    public void setJbeli(double jbeli) {
        this.jbeli = jbeli;
    }

    public int getbayr(){
        bayr = jbeli*hbarang;
    return (int) bayr;
   
    }
         
    public int getDiskon() {
        diskon = (total*5)/100;
               return(int) diskon;
    }
   

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    
    public int getPpn(){
    ppn=(total*10)/100;
        return(int) ppn;
    }

    public int getJadibyr() {
        jadibyr=total+ppn-diskon;
        return jadibyr;
    }

    public void setJadibyr(int jadibyr) {
        this.jadibyr = jadibyr;
    }
    
   
     public int getTkartu(){
      
     tkartu=(total+ppn-diskon)+card;
         return (int) tkartu;
     }
     public void setTkartu(int tkartu){
     this.tkartu = tkartu;
     }

    public int getCard() {
       card=(total*3)/100;
        return(int) card;
    }
     public void setCard(int card) {
        this.card = card;
    }

}

    

