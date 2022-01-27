import java.io.*;
import java.util.*;

public class RotateArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
   
    k=k%a.length;
    if(k<0)
    k=k+a.length;
    for(int i=1;i<=k;i++)
    rotateByOne(a);
  }
  public static void rotateByOne(int[]a)
  {
      int temp= a[a.length-1];
    for(int i=a.length-1;i>0;i--)
    {
    a[i]=a[i-1];
    }
    a[0]=temp;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}