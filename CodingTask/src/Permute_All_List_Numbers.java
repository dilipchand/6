
public class Permute_All_List_Numbers {
    static void permute(int[] a, int k) 

    {

        if (k == a.length) 

        {

            for (int i = 0; i < a.length; i++) 

            {

                System.out.print(" [" + a[i] + "] ");

            }

            System.out.println();

        } 

        else 

        {

            for (int i = k; i < a.length; i++) 

            {

                int temp = a[k];

                a[k] = a[i];

                a[i] = temp;

 

                permute(a, k + 1);

 

                temp = a[k];

                a[k] = a[i];

                a[i] = temp;

            }

        }

    }

 
    public static void main(String args[]) 

    {
    	int sequence[] = {1, 2, 1, 3};
    	permute(sequence, 0);
    }
}
