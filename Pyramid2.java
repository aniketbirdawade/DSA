public class Pyramid2 
{
    public void squre(int n)
    {
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<n; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        } 
    }  
    public static void main(String[] args) 
    {
        Pyramid2 p = new Pyramid2();
    p.squre(4);
    }
}
