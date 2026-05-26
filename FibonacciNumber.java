public class FibonacciNumber 
{
    public void fib(int n)
        {
            int first =0; 
            int second =1;
            int sum = 0;
            while (first<n)
            {
                System.out.println(first);
                sum +=first;

               int  next = first+second;
               first = second;
               second = next;
            }
            System.out.println("fib"+sum);
            
        }

    public static void main(String[] args) 
    {
        FibonacciNumber f = new FibonacciNumber();
        f.fib(4);
    }
}
