import java.io.*;
import java.util.*;

public class BrokenEconomy{

public static void main(String[] args) throws Exception {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   int n = Integer.parseInt(br.readLine());
   int arr[]= new int[n];
   for(int i=0;i<arr.length;i++)
   {
    arr[i]=Integer.parseInt(br.readLine());   
   }
   int element = Integer.parseInt(br.readLine());
   int left =0,right =arr.length-1;
   int ceil =Integer.MAX_VALUE,floor=Integer.MIN_VALUE;
   while(left<=right)
   {
    int mid = left+(right-left)/2;
    if(arr[mid]<element)
    {
    left=mid+1;
    floor=arr[mid];
    }
    else if(arr[mid]>element)
    {
     right=mid-1;
     ceil=arr[mid];
    }
    else
    {
    ceil=floor=arr[mid];    
    }
   }
   System.out.println(ceil);
   System.out.println(floor);
 }

}