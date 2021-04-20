package sortingdansearching;
import java.util.Scanner;
public class nomor1_selection_sort {
    public static void selection_sort(int[] A){
        int smallindex;
        int pass;
        int j;
        int temp;
        for ( pass = 0; pass < A.length -1; pass++) {
            smallindex = pass;
            for (j = pass + 1; j < A.length; j++) {
                if(A[j]<A[smallindex]){
                    smallindex = j;
                }   
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;
        }
        }
    public static void hasil(int[]data){
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int A[] = {3,10,4,2,8,13};
        System.out.println("Selection Short");
        System.out.println("ANNILA NURUL HUZNA");
        hasil(A);
        selection_sort(A); 
        hasil(A);
        System.out.println("Pencarian Binary");
        pencarianBinary(A);
    }
        public static void pencarianBinary(int A []) {
        System.out.println();
        int search;
        Scanner pencarian = new Scanner(System.in);
        System.out.println("Indeks pointer : ");
        search = pencarian.nextInt();
        int batasbawah = A.length - 1;
        int batasatas = 0;
        boolean ketemu = false;
        int poin = 0;
        while ((batasatas <= batasbawah ) && (ketemu == false)){
        poin = (batasatas + batasbawah)/2;
        System.out.println("indeks pointer : "+poin);  
            if (A [poin]== search){
                ketemu = true;
                System.out.println("Data "+search+" telah ditemukan pada indeks ke "+poin);
            }
            else {
                if (search < A[poin]){
                    System.out.println("cari di kiri");
                    batasbawah = poin-1;   
                }
                else{
                    System.out.println("cari di kanan");
                    batasatas = poin+1;    
                }
            }
        }
        if (ketemu==true){
            System.out.println("data "+search+" ditemukan di indeks "+(poin+" di baris "+(poin+1)));
        }
        else{
            System.out.println("data "+search+" tidak ada ");
        }
        }
}