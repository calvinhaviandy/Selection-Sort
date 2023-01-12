
package selectionsort;
import java.util.Scanner;

public class SelectionSort {

    
    public static void selectionSort(int[] bilangan){
       for (int i = 0; i < bilangan.length - 1 ; i++){
           int index =i;
           for (int j = i + 1; j < bilangan.length; j++){
               if (bilangan [j] > bilangan[index]){
                   index = j;
               }
           }
   
           
     int smallerNumber = bilangan[index];     
     bilangan [index] = bilangan [i];
      bilangan [i] = smallerNumber;       
       }   
    }
   
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println(" == Program Sorting ==" + "\n" + "====================");
        System.out.print(" Masukkan berapa banyak angka yang ingin anda Sorting : ");
        int jumlah = input.nextInt();
        int[] bilangan = new int [jumlah];
        
        for ( int i = 0 ; i < jumlah ; i++){
            System.out.print(" Masukkan angka ke- " + (i + 1) + ": ");
            bilangan[i] = input.nextInt();
        } 
        System.out.println(" =========================== ");
        System.out.println(" List angka yang akan di Sorting:  ");
        for (int i = 0; i < jumlah; i++){
            System.out.print(" " + bilangan[i] + ", ");
        }
        
        System.out.println();
        selectionSort(bilangan);
        System.out.println(" Hasil Sorting: ");
        for(int i =0; i < bilangan.length; i++){
            System.out.print(" " +bilangan[i] + " ");
        }
        
    }
    
}
