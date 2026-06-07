class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        int num[] = new int[k];
        int i = 0;
        for(Map.Entry<Integer, Integer> l : list){
            if(i < k){
                num[i] = l.getKey();
                i++;
            }
        }
        return num;
    }
}
