public class intToBin
{
     static void dectobinary(int n){

        int[] binarray = new int [1000];

        int i=0;
        while (n>0) 
        {
            binarray[i] = n%2;
            n = n/2;
            i++;
        }

        for(int j=i-1; j>=0; j--)
        {
            System.out.print(binarray[j]);
        }
    }


    public static void main(String[] args) 
    {
       int n = 5;
       System.out.println("Decimal : "+n);
       System.out.print("Binary: ");
       dectobinary(n);

    }    
}
