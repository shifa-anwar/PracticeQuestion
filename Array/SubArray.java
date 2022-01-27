
import java.io.*;
public class SubArray {
    public static void main(String args[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
       for(int i=0;i<arr.length;i++)
       {
        for(int j=i;j<arr.length;j++)
        {
         for(int k=i;k<=j;k++)
         {
          System.out.print(arr[k]+"\t");
         }
         System.out.println();
        }
       }
    }
}
