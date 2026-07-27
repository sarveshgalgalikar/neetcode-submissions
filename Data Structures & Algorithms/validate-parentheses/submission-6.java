class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> pair = new HashMap<>();
        pair.put(')','(');
        pair.put('}','{');
        pair.put(']','[');

        Deque<Character> ch_stack = new ArrayDeque<>();
        char[] ch = s.toCharArray();
        if (s == null) {
            return false;
        }
        for (char c : ch){
            if(c == '(' || c == '{'|| c == '['){
                ch_stack.push(c);
            }

            else if(c == ')' || c == '}'|| c == ']') {
                if (ch_stack.isEmpty()) {
                    return false;
                }
                char top = ch_stack.pop();
                if (top != pair.get(c)){
                    return false;
                }
            }
        }
        return ch_stack.isEmpty();
    }
}
