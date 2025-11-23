class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<Integer>();

        for(int i=0 ; i<expression.length() ; i++){
            char ch = expression.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                List<Integer> left = diffWaysToCompute(expression.substring(0 , i));
                List<Integer> right = diffWaysToCompute(expression.substring( i+1 ));

                for(int a : left){
                    for(int b : right){
                        if(ch == '+') list.add(a+b);
                        else if(ch == '-') list.add(a-b);
                        else list.add(a*b);
                    }
                }
            }
        }

        if(list.size() == 0){
            list.add(Integer.valueOf(expression));
        }

        return list;
    }
}
