class Solution {
    public boolean isPalindrome(String s) {
        //remove spaces
        //remove alphanumeric 
        //convert to lowercase
        //for loop where i starts with 0 and j from last 
        //we increment i and decremenet j in the same loop while i < j 
        if(s == null || s.isEmpty()){
            return false;
        }

        s = s.toLowerCase()
             .replace(" ","")
             .replaceAll("[^a-zA-Z0-9]", "");
        
        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++){
            while(i < j){
                if(s.charAt(i)== s.charAt(j)){
                    i++;
                    j--;
                }
                else {
                    return false;
                }
            }
           
        }return true;

    }
}
