public class ArrayRotate 
{

    int arr[] = {1, 2, 3, 4, 5, 6};
    int n=2;

    public void rotate()
    {
        for(int i=0; i<n; i++)
        {
            int first = arr[0]; //1 ,2 

            for(int j=0; j<arr.length-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        ArrayRotate a = new ArrayRotate();
        a.rotate();
    }    
}
