import java.util.Arrays;

public class Stringreturn {
    public static void main(String[] args) {
     boolean swa= isPrime(23);

        System.out.println(swa);

    }

    static boolean isArmstrong(int n)
    {
            int originalnum=n;
            int sum=0;
            while (n>0)
            {
                int rem=n%10;
                n=n/10;
                sum=sum+rem*rem*rem;

            }
            return sum == originalnum;
    }

    static boolean isPrime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        int c=2;
        while (c*c<=n)
        {
            if(n%c==0)
            {
                return false;
            }
        }
        return c*c>n;
    }

    static void changearr(int arr[])
    {
        arr[0]=99;
    }

    static String myGreet(String name)
    {
        String message="Hello "+name;
        return message;
    }

    static String greet()
    {
        String greeting="how are you";
        return greeting;
    }

    static int sum3(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    static void fun(int ...me)
    {
        System.out.println(Arrays.toString(me));
    }

}
