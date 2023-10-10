
public class Solution {

    public static boolean isPrime (int number) 
    {
        if (number < 2)
        return false;

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0)
            return false;
        }
        return true;
    }
    public static void main(String[] args) 
    {
        System.out.println(Solution.isPrime(2));
        System.out.println(Solution.isPrime(0));
        System.out.println(Solution.isPrime(1));
        System.out.println(Solution.isPrime(31));


    }
}