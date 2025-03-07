package Arrays.Elementlarnitahlilqilish;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Array(10);
//        String arrayed = Array18(10);
//        System.out.println(arrayed);
//        System.out.println(KandLSumma(10,3,3));
//        System.out.println(ArifProgress(10));
        System.out.println(GeometrikProgress(10));
    }
    //Massivni hosil qilish
    public static int[] Array(int n){
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =(int) (Math.random()*100);
        }
        return a;
    }
    //massivni saralash (insertion sort algoritmini ishlatamiz)
    public static int[]  SelecSort(int[] a){
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }
    //Array18
    public static String Array18(int n){
        int[] array = Array(n);
        int temp = array[array.length-1];
        for (int i = 0; i < n; i++) {
            if (array[i] < temp) {
                return "kichik birinchi elent= "+array[i]+" va oxirgi elementi = "+ temp;
            }
        }
        return 0+"";
    }
    //Array20
    public static int KandLSumma(int n,int k, int l){
        int[] array = Array(n);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if(k<=i && i<=l){
               sum += array[i];
            }
        }
        return sum;
    }
    //array24
    public static int ArifProgress(int n){
        int [] b=Arrays.stream(Array(n)).sorted().toArray();
        if (b.length<2){
            return 0;
        }
        int d=b[1]-b[0];
        for (int i = 2; i < b.length/2; i++) {
            if (b[i]-b[i-1]!=d) {
                return 0;
            }
        }
        return d;
    }
    //array25
    public static double GeometrikProgress(int n){
        int [] array = Array(n);
        int[] sortArray = SelecSort(array);
        if (sortArray.length<2){
            return 0;
        }
        double q=(double) sortArray[1]/sortArray[0];
        for (int i = 1; i < sortArray.length; i++) {
            if (sortArray[i]/sortArray[i-1]!=q) {
                return 0;
            }
        }
        return q;
    }
}
