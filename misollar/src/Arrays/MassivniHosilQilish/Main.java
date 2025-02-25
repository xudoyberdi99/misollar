package Arrays.MassivniHosilQilish;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Array1(5);
//        ArifProgress(5);
//        FibonacciArray(5);
//        FibonacciArray(2);
//        Array6(5,1,2);
//        ReversevArray(6);
//        Array13(7);
        Array15(10);
    }


    // Array-1
    public static void Array1(int n){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
    }

    //Array-3
    public static void ArifProgress(int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Arifmetik progressiyaning dastlabki hadini kiriting");
        int a=sc.nextInt();
        System.out.println("Arifmetik progressiyaning ayirmasi d ni  kiriting");
        int d=sc.nextInt();

        int [] massiv=new int[n];

        for (int i = 0; i < n; i++) {
            massiv[i]=a;
            a=a+d;
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    //Array-5
    public static void FibonacciArray(int n){
        int[] a = new int[n];
        if (n<=2){
            a[0]=1;
            a[1]=1;
        }
        for (int i = 2; i < n; i++) {
            a[0]=1;
            a[1]=1;
            a[i]=a[i-1]+a[i-2];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    //Array-6
    public static void Array6(int n,int a, int b){
        int[] massiv = new int[n];
        massiv[0]=a;
        massiv[1]=b;
        int sum=massiv[0]+massiv[1];
        for (int i = 2; i < n; i++) {
            massiv[i]=sum;
            sum=sum+massiv[i];
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.println(massiv[i]);
        }
    }

    //Array-7
    public static void ReversevArray(int n){
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i]=i;
        }
        for (int i = massiv.length-1; i>=0 ; i--) {
            System.out.println(massiv[i]);
        }
    }

    //Array-13
    public static void Array13(int n){
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i]=i;
        }
        for (int i = massiv.length-1; i >=0 ; i=i-2) {
            System.out.println(massiv[i]);
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]);
        }
    }

    //Array-15
    public static void Array15(int n){
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i]=i;
        }

       for (int i = 1; i < massiv.length; i+=2) {
           System.out.println(i+ " " + massiv[i]);
       }
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");
       System.out.println(" ");

       for (int i = massiv.length-2; i >=0 ; i-=2) {
           System.out.println(i+" " +massiv[i]);
       }
   }

   //Array-16
    public static void Array16(int n){
        int[] massiv = new int[n];
        for (int i = 0; i < n; i++) {
            massiv[i]=i;
        }

        for (int i = 0; i < massiv.length/2; i++) {
            System.out.println(massiv[i]);
            System.out.println(massiv[massiv.length-i]);
        }
    }
}
