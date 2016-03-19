/**
 * Created by Covey on 2016/3/19.
 */
public class Solution {
    public int single(int num) {
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }

    public int addDigits(int num) {

        while ((num = single(num)) >= 10) {
        }
        return num;
    }
}