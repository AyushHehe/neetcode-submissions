class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());
        
        int[] arr = new int[k];
        int j = 0;
        for(Map.Entry<Integer, Integer> entry : list){
            if(j<k){
                arr[j] = entry.getKey();
                j++;
            }
        }
        return arr; 
    }
}
