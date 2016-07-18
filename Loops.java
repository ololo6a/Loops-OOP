package loops;


/**
 * Created by Администратор on 19.07.2016.
 */
public class Loops
{
    Loops(){

    }

    public long factorial(long n ){
        long ans = 1, pred = 1;


        for (long i = 1; i <= n; i++) {
            pred*=i;
            ans*=pred;
        }
        return ans;
    }



    public void array(int n ){

        int count = 1;
        int n2=n*n;
        int step=0;
        int A [][] = new int[n][n];
        A[0][0]=1;

        while (count<=n2){

            for (int i = step; i < n - step ; i++) {
                A[step][i]=count++;
            }

            for (int i = step+1; i < n - step ; i++) {
                A[i][n-step-1]=count++;
            }


            for (int i = n-step-2 ; i > step; i--) {
                A[n-step-1][i]=count++;
            }

            for (int i =n - step-1 ; i > step; i--) {
                A[i][step]=count++;
            }

            ++step;
        }


        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n  ; j++) {
                System.out.print(A[i][j]+ " ");
            }
            System.out.println(" ");
        }

    }

    public static void main(String[] args) {
        Loops l = new Loops();

        l.array(3);


        System.out.println(l.factorial(5));
    }
}
