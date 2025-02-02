package binary_search;

public class FirstBadVersion {
    private boolean isBadVersion(int n){
        return true;
    }
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (isBadVersion(mid)) {
                ans = mid;
                right = mid -1 ;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
