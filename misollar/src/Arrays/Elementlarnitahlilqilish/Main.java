package Arrays.Elementlarnitahlilqilish;

public class Main {
    public static void main(String[] args) {
//        Array(10);
        String arrayed = Array18(10);
        System.out.println(arrayed);

    }
    //Massivni hosil qilish
    public static int[] Array(int n){
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] =(int) (Math.random()*100);
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
    public static int KandLSumma(int n){
        int[] array = Array(10);

        return 0;
    }

}
