import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SubsetArray {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < Math.pow(2, n); i++) {
            int temp = i;
            String set ="";
            for (int j = arr.length-1; j>=0; j--) {
                int rem = temp % 2;
                temp /= 2;
                if (rem == 0)
                set ="-\t"+set;
                else
                set = arr[j]+"\t"+set;
            }
            System.out.println(set);
        }

    }
}
