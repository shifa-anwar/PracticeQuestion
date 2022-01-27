import java.io.*;
import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
    arr[i]=Integer.parseInt(br.readLine());    
    }
    int max = arr[0];
    for(int i=1;i<arr.length;i++)
    {
    if(arr[i]>max)
    max=arr[i];
    }
    for(int floor = max;floor>=1;floor--)
    {
    for(int i=0;i<arr.length;i++)
    {
    if(arr[i]>=floor)
    System.out.print("*\t");
    else
    System.out.print("\t");
    }
    System.out.println();
    }
    
}

}