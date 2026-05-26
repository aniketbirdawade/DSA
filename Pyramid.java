public class Pyramid 
{
    public void pattern(int n) 
    {
        for (int i = 1; i < n; i++) 
        {
            for(int j=1; j<n-i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    public static void main(String[] args) 
    {
        Pyramid p = new Pyramid();
        p.pattern(5);    
    }
}