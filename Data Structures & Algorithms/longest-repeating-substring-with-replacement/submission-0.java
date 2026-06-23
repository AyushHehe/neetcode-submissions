class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxfreq = 0;
        int i=0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);

            map.put(ch, map.getOrDefault(ch, 0) + 1);
            int window = (j - i) + 1;

            if(window - Collections.max(map.values()) <= k){
                maxfreq = Math.max(window, maxfreq);
            }
            else{
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                i++;
            }
        }
        return maxfreq;
    }
}
