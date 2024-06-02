class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int result[] = new int[m + n];
        int arr1Index = 0, arr2Index = 0;
        for (int i = 0; i < result.length; i++) {
            if (arr1Index >= m) {
                result[i] = nums2[arr2Index++];
                continue;
            }
            if (arr2Index >= n) {
                result[i] = nums1[arr1Index++];
                continue;
            }
            if (nums1[arr1Index] >= nums2[arr2Index]) {
                result[i] = nums2[arr2Index++];
                continue;
            }
            result[i] = nums1[arr1Index++];
        }
        for (int i = 0; i < result.length; i++) {
            nums1[i] = result[i];
        }
    }
}
