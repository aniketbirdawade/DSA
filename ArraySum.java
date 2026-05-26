public class ArraySum 
{
        public void sum()
        {
            int sum=0;
            int arr[] = {100,200,300};

            for(int i=0; i<arr.length; i++)
            {
                sum = sum + arr[i];
            }
            System.out.println(sum);
        }
        public static void main(String[] args) {
            ArraySum a = new ArraySum();
            a.sum();
        }
}
