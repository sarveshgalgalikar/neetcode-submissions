class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        if (s == null || t == null || t.length() != s.length()){
            return false;
        }

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        for(int i = 0; i < ch1.length; i++){

            map1.put(ch1[i], map1.getOrDefault(ch1[i], 0) +1);  
           
        }

        for(int i = 0; i < ch2.length; i++){

            map2.put(ch2[i], map2.getOrDefault(ch2[i], 0) +1);  
           
        }       

        for(int i = 0; i < ch1.length; i++){
            char ch3 = ch1[i];
            if(map2.containsKey(ch1[i])){ //r
                 
                if(map1.get(ch3).equals(map2.get(ch3))){
                    continue;
                } 
                else {
                    return false;
                }            
            } 
            else {
                return false;
            }
        }
        return true;
    }
}