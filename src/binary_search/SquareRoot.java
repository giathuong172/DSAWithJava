package binary_search;

public class SquareRoot {
    public int mySqrt(int x) {
        int l = 0, r = 46340;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans ;
    }
}
