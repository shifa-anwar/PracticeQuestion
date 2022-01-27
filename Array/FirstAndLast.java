import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstAndLast {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[]=new int [n];
        for(int i=0;i<arr.length;i++) {
        arr[i] = Integer.parseInt(br.readLine());
        }
        int d = Integer.parseInt(br.readLine());
        int start =-1,end=-1;//if element is not present then print -1
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == d) {
                start = i;
                break;
            }
        }
        for(int j=arr.length-1;j>=0;j--) {
            if (arr[j] == d) {
                end = j;
                break;
            }
        }
        System.out.println("start is "+ start);
        System.out.println("End is "+end);
}
}
