import java.util.Scanner;
public class Solution {

   int numJewelsInStones(String J, String S)
   {
       int count=0;
       for(int i=0;i<J.length();i++)
       {
           for(int j=0;j<S.length();j++)
           {
               if(S.charAt(j)==J.charAt(i))
               {
                   count++;
               }
           }

       }

       System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String J=in.nextLine();
       String S=in.nextLine();
       Solution s= new Solution();
       s.numJewelsInStones(J,S);
    }
}
