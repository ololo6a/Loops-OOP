package loops;


/**
 * Created by ������������� on 19.07.2016.
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
    int [] AB(int a, int b, int[]A,int[]B ){

        int[]res = new int[a+b];
        int  aa=0,bb=0;

        for (int i = 0; i <a+b ; i++) {

            if (aa==a){
                res[i]=B[bb++];
                continue;
            }
            if (bb==b){
                res[i]=A[aa++];
                continue;
            }

            if (A[aa] < B[bb] ) {
                res[i]=A[aa++];
            } else {
                res[i]=B[bb++];
            }

        }

        return res;
    }

    int lost (int [] M){

        long s=0;
        int n = M.length;
        long ans = (n)*(n+1)/2;
        for (int i = 0; i < n; i++) {
            s+=M[i];
        }
        return (int) (ans-s);
    }
    public static void main(String[] args) {
        Loops l = new Loops();

        l.array(2);

        int [] q = {1,4,6,8,9};
        int [] z = {2,4,5,7,19};
        int [] r;
        r=l.AB(5,5,q,z);

        System.out.println("A+B");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(r[i] + " ");
        }

        System.out.println();
        System.out.println("Factorial");
        System.out.println(l.factorial(5));


        System.out.println();
        System.out.println("LOST");
        int [] mas = {0,1,2,3,4,5,6,8,9,10,15,14,13,12,11};   // 7

        System.out.println(l.lost(mas));



    }
}
