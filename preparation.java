import java.util.Scanner;

public class preparation
{
    static Scanner sc= new Scanner(System.in);

    // Factorial
    public static int factorial(int num)
    {
        int ans=1;
        for (int i = 1; i <=num ; i++)
        {
            ans*=i;
        }
        return ans;
    }

    // Tailor series for Sin(x)
    public static void tailorSeries()
    {
        System.out.println("Enter the Degrees");
        double d =sc.nextInt();
        double x=Math.toRadians(d);
        System.out.println("Enter the no of series");
        int n= sc.nextInt();
        double ans= 0;
        for (int i = 0; i <=n; i++)
        {
            //double pow=Math.pow(-1, i);
            double up=Math.pow(x, (2 * i) + 1);
            int fact=factorial((2 * i) + 1);
            if(i%2==0)
            {
                ans=ans+(up/fact);
            }
            else
            {
                ans=ans-(up/fact);
            }

        }
        StringBuilder sb= new StringBuilder(ans+"");
        System.out.println(" From tailor's"+sb.substring(0,4));
        System.out.println("From Math "+Math.sin(x));

    }

    // sum of cubes of all numbers in range
    public static void sumOfCubesInRange()
    {
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans=0;
        for (int i = a; i <=b ; i++)
        {
            ans+= (int) Math.pow(i,3);
        }
        System.out.println(ans);
    }

    //
    public static void main(String[] args)
    {
        tailorSeries();
    }
}

