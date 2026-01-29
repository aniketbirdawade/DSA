public class Facto 
{
    static int factorial(int n)
    {
        int result =1;

        for(int i=2; i<=n; i++)
        {
            result *= i;
        }
        return result;
    }    

    public static void main(String[] args) 
    {
        int n = 5;
        System.out.print("Factorial is : ");
        System.out.print(factorial(n));
    }
}
