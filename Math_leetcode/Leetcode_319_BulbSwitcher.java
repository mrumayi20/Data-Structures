//Problem URL: https://leetcode.com/problems/bulb-switcher/description/
// Video Explanation: https://www.youtube.com/watch?v=9XQxIvdqIt0

class Solution {
    public int bulbSwitch(int n) {
        double res = Math.sqrt(n);
        res = Math.floor(res);
        return (int)res;
    }
}