public class LargeInArray 
{
       public void large()
        {
            int arr[] = {7, 2, 5, 1, 4};
            int max= arr[0];

            for(int i=0; i<arr.length; i++)
            {
                if (arr[i] > max) 
                {
                    max = arr[i];    
                }
            }
            System.out.println("Max is: "+ max);
        }
        public static void main(String[] args) 
        {
            LargeInArray l = new LargeInArray();
            l.large();    
        }
}
