class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int []lastseen = {-1,-1,-1};

        for (int right = 0; right < s.length(); right++){
            char ch = s.charAt(right);

            lastseen[ch - 'a'] = right;
            int min = Math.min(lastseen[0], Math.min(lastseen[1],lastseen[2]));

            count = count + min + 1;
        }     
        return count;
    }
}