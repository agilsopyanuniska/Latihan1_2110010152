
package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika agil = new Matematika(5,2);
        
        System.out.println("Hasil Penjumlahan : " + agil.setPenjumlahan());
        System.out.println("Hasil Pengurangan : " + agil.setPengurangan());
        System.out.println("Hasil Perkalian : " + agil.setPerkalian());
        System.out.println("Hasil Pembagian : " + agil.setPembagian());
    }
}
