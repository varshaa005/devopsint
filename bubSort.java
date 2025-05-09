import java.util.Scanner;

public class bubSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter n: ");
        int n =  sc.nextInt();
        int[]a = new int[n];

        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j<= i-1; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After bubble sorting: ");
        for (int i=0; i<n; i++){
            System.out.print(a[i]);
        }
    }
}
