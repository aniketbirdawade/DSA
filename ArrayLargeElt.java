public class ArrayLargeElt 
{
    public void largest()
    {
        int arr[] = {2,3,1,4,5,1,8,6};
        int max = arr[0];

        for(int i=0; i<arr.length; i++)
        {
            if (arr[i]>max) 
            {
                max=arr[i];
            }
        }
            System.out.println(max);
    }   
    public static void main(String[] args) 
    {
        ArrayLargeElt a = new ArrayLargeElt();
        a.largest();   
    } 
}
