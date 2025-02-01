class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack();
        for(char i:s.toCharArray()){
            if(stack.isEmpty()){
                stack.add(i);
            }else if(i==')' && stack.peek()=='('){
                stack.pop();
            }else if(i=='}'&& stack.peek()=='{'){
                stack.pop();
            }else if(i==']'&& stack.peek()=='['){
                stack.pop();
            }else{
                stack.add(i);
            }
        }
        return stack.size()==0;
    }
}
