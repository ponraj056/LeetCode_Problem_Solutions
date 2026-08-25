class Solution {
    public int missingMultiple(int[] nums, int k) {
    Set<Integer> seen = new HashSet<>();
    for(int i:nums) seen.add(i);
    int ans = k;
    while (seen.contains(ans)) {
        ans += k;
    }
    return ans;
    }
}