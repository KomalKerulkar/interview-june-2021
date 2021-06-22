package exam;

public class CountCombinations {

  public int getNumberOfWays(final int total, final int k) {
    //TODO write your code here to achieve the desired result as explained in Readme file for this problem.
   
        int ans = 1;
        if (k > total- k)
            k = total - k;
        for (int i = 0; i < k; i++) {
            ans *= (total - i);
            ans /= (i + 1);
        }
        return ans;
    }
     
    
    static int countDerangements(int n)
    {
        int der[] = new int[ n + 3];
     
        der[0] = 1;
        der[1] = 0;
        der[2] = 1;
     
        for (int i = 3; i <= n; i++)
            der[i] = (i - 1) * (der[i - 1]
                            + der[i - 2]);
        return der[n];
    }
     
   
    static int countPermutations(int n, int k)
    {
        int ans = 0;
        for (int i = n - k; i <= n; i++) {
          int ways = nCr(n, i);
         ans += (ways * countDerangements(n- i));
        }
        return ans;
    }
     
   
    public static void main(String []args)
    {
       Scanner sc=new  Scanner(System.in);
      int n=sc.nextInt();
      int k=s.nextInt();
        System.out.println(countPermutations(n, k)) ;
    }
  


}
