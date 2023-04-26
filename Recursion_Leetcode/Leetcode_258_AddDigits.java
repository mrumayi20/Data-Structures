//Problem Statement: https://leetcode.com/problems/add-digits/description/

class Solution {
    public int addDigits(int num) {
        //java recursive solution
        int sum = 0;

        //converting num into string because it's easy to traverse string than 
        //converting int into int array and then traversing it
        String str = String.valueOf(num);

        for(int i = 0 ; i < str.length() ; i++)
        {
            sum = sum + (str.charAt(i) - '0');
        }
         

        if(sum < 10)
        {
            return sum;
        }
        else
        {
            return addDigits(sum);
        }
    }
}