class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> groups = new HashMap<>();

        for (String s : strs){
            int[] count = new int[26];
            char[] strarr = s.toCharArray();
            for (char c: strarr){
                count[c - 'a']++;
            }
            List<Integer> key = new ArrayList<>();
            for(int c : count){
                key.add(c);
            }

            groups.computeIfAbsent(key, k -> new ArrayList<>()).add(s);

        }
        return new ArrayList<>(groups.values());    }
}
