package Methods;

public class Main {
    public static void main(String[] args) {
//        PowerA3(1,2,3,4,5);
//        PowerA234(2,3,4);
//        MEAN(2,3,4,5);
//        DigitCountSum(1234);
//        InvertDigit(1234);
//        AddRightDigit(12);
//        TriangleP(3,4);
//        Calc(5,2,'+');
//        Even(2);
//        Even(3);
//        IsSquare(9);
//        IsSquare(7);
//        IsPower5(5);
//        IsPower5(625);
//        IsPower5(20);
//        IsPower5(35);
//        IsPowerN(36,6);
//        IsPowerN(88,44);
//        IsPrime(18);
//       int c=DigitN(123,4);
//        System.out.println(c);
//        System.out.println(IsPalindrom(121));
//        System.out.println(IsPalindrom(1221));
//        System.out.println(Fact(5));
//        System.out.println(Fact(0));
//        System.out.println(Fact2(6));
//        System.out.println(Fact2(8));
        System.out.println(Fib(2));
        System.out.println(Fib(6));
    }

    //fun-1
    public static void PowerA3(float a, float b,float c,int d,int e) {
        System.out.println(Math.pow(a,3));
        System.out.println(Math.pow(b,3));
        System.out.println(Math.pow(c,3));
        System.out.println(Math.pow(d,3));
        System.out.println(Math.pow(e,3));
    }

    //fun-2
    public static void PowerA234(float a, float b, float c){
        System.out.println(Math.pow(a,2)+" "+Math.pow(a,3)+" "+Math.pow(a,4));
        System.out.println(Math.pow(b,2)+" "+Math.pow(b,3)+" "+Math.pow(b,4));
        System.out.println(Math.pow(c,2)+" "+Math.pow(c,3)+" "+Math.pow(c,4));
    }

    //fun-3
    public static void MEAN(int a,int b,int c,int d){
        System.out.println("a va b ni o'rta arif= "+((float)(a+b)/2)+" a va b ni orta geometrig = "+(Math.sqrt(a*b)));
        System.out.println("a va c ni o'rta arif= "+((float)(a+c)/2)+" a va c ni orta geometrig = "+(Math.sqrt(a*c)));
        System.out.println("a va d ni o'rta arif= "+((float)(a+d)/2)+" a va d ni orta geometrig = "+(Math.sqrt(a*d)));
    }

    //fun-6
    public static void DigitCountSum(int a){
        int i=0;
        int sum=0;
        while (a>0){
            sum+=a%10;
            i++;
            a=a/10;
        }
        System.out.println("yigindisi= "+sum+ "  " + "soni= "+i);
    }

    //fun-7
    public static void InvertDigit(int a){
        while (a>0){
            int b=a%10;
            a=a/10;
            System.out.print(b);
        }
    }

    //fun-8
    public static void AddRightDigit(int k){
        String r = String.valueOf((int)(Math.random()*10));
        System.out.println(k+r);
    }

    //fun-20
    public static void TriangleP(int a,int b){
        System.out.println("p= "+(int)Math.sqrt(a*a+b*b) +a + b);
    }

    //fun-22
    public static void Calc(float a, float b, char op){
        switch (op){
            case '+':
                System.out.println(a+b);
            break;
            case '-':
                System.out.println(a-b);;
            break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }

    //fun-24
    public static void Even(int k){
        boolean ev=k%2==0;
        System.out.println(ev);
    }

    //fun-25
    public static void IsSquare(int k){
        int a=(int) Math.sqrt(k);
        boolean ev=k==a*a;
        System.out.println(ev);
    }

    //fun-26
    public static void IsPower5(int k){
        if(k==5){
            System.out.println(true);
        }else {
            boolean ev=k%5==0 && k/5%10==5;
            System.out.println(ev);
        }

    }

    //fun-27
    public static void IsPowerN(int k,int n){
        while (k>n){
            k=k/n;
            if(k<n){
                System.out.println(false);
            }
            if (k==n){
                System.out.println(true);
            }
        }
    }

    //fun-28
    public static void IsPrime(int n){
        int q=0;
        for (int i=1;i<=n;i++){
            if (n%i==0){
                q++;
            }
        }
        if (q==2){
            System.out.println(true);
        }else  {
            System.out.println(false);
        }
    }

    // fun-30
    public static int DigitN(int n,int k){
        while (n>0){
            int m=n%10;
            n=n/10;
            if (m==k){
                return k;
            }
        }
        return -1;
    }

    //fun-31
    public static boolean IsPalindrom(int n){
        if (n < 0) return false;

        int reverse=0;
        int temp=n;
        while (n!=0){
            int digit=n%10;
            reverse=reverse*10+digit;
            n=n/10;
        }
        return temp==reverse;
    }

    //fun-34
    public static int Fact(int n){
        return n==0?1:n*Fact(n-1);
    }

    //fan-35
    public static int Fact2(int n){
        return n==0?1:n*Fact(n-2);
    }

    //fun-36
    public static int Fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return Fib(n-1)+Fib(n-2);
    }

}
