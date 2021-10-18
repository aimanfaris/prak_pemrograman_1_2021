import java.util.Scanner;

    public class TugasPitu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = scan.nextInt();

            if (n % 2 == 0){
                for (int i = (n/2)+1; i>1; i--){
                    for (int j = n; j >i-1; j--){
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= (i*2)-2; k++){
                        if ( k== i-1){
                            System.out.print("-");
                        } else {
                            System.out.print("*");
                        }
                    }
                System.out.println();
                }
                for (int i=1;i <=(n/2)+1; i++){
                    for (int j=i;j<=n; j++){
                        System.out.print(" ");
                    }
                    for (int k=0; k<= (i*2)-2; k++){
                        if (k==i-1){
                            System.out.print("-");
                        } else {
                            System.out.print("*");
                        }
                    }
                System.out.println();
                }

            } else {
                for (int i = (n/2)+1; i >1; i--){
                    for (int j = n; j>i-1;j--){
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= (i*2)-2; k++){
                        System.out.print("*");
                    }
                System.out.println();
            }

                for (int i = 1; i<= (n/2) + 1; i++){
                    for(int j = i; j<= n; j++){
                        System.out.print(" ");
                    }
                    for (int k =0; k <= (i*2)-2; k++){
                            System.out.print("*");
                    }
                System.out.println();
            }
        }
    }
}