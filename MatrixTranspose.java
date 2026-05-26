public class MatrixTranspose 
{
    static void transpose(int A[][], int B[][], int m, int n)
        {   
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; j++)
                {
                    B[i][j] = A[j][i];
                }
            }
        }
    public static void main(String[] args) 
    {
        
        int A[][] ={{1,1,1,1},
                    {2,2,2,2},
                    {3,3,3,3},
                    {4,4,4,4}};

        int m=4;
        int n=4;

        int B[][] = new int[m][n];

        transpose(A, B, m, n);

        
        System.out.println("Result: ");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(B[i][j]+" ");
            }
            System.out.println("");
        }
    }    
}
