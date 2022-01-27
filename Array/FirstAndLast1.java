//First And Last Index Using Binary Search
import java.io.*;
import java.util.*;

public class FirstAndLast1{

public static void main(String[] args) throws Exception {
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++) {
        arr[i] = Integer.parseInt(br.readLine());
        }
        int d = Integer.parseInt(br.readLine());
        int start = -1,end=-1;
        int low =0,high = arr.length-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if(arr[mid]<d)
            {
                low = mid+1;
            }
            else if(arr[mid]>d)
            {
                high= mid-1;
            }
            else
            {
                end=mid;
                low=mid+1;
            }
        }
        int l =0,h=arr.length-1;
        while(l<=h)
        {
        int mid =l+(h-l)/2;
        if(arr[mid]<d)
        {
        l = mid+1;    
        }
        else if(arr[mid]>d)
        {
        h = mid-1;    
        }
        else
        {
         start = mid;
         h =mid-1;
        }
        }

        System.out.println(start);
        System.out.println(end);
 }

}