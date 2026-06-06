class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            int freq[] = new int[26];
            for(int j=0; j<strs[i].length(); j++){
                char ch = strs[i].charAt(j);
                freq[ch - 'a']++;
            }

            StringBuilder sb = new StringBuilder();

            for(int k=0; k<26; k++){
               if(freq[k] > 0){
                sb.append((char)('a' + k));
                sb.append(freq[k]);
               }
            }

            String key = sb.toString();
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
         return new ArrayList<>(map.values());
    }
}
