class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < k; i++){
            leftSum = leftSum + cardPoints[i];
        }
        max = leftSum;

        int index = cardPoints.length-1;
        for (int i = k-1; i >= 0; i--){
            leftSum = leftSum - cardPoints[i];
            rightSum = rightSum + cardPoints[index];
            index--;

            max = Math.max(max, leftSum + rightSum);
        }
        return max;
    }
}