// You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them.

// We repeatedly make duplicate removals on s until we no longer can.

// Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

// Solution 1

public String removeDuplicates(String s) {
        if(s.length()==1) return s;
        for(int i = 0; i < s.length()-1;i++){
            String c = s.charAt(i)+"";
            if(s.charAt(i) == s.charAt(i+1)){
                s = s.replace(c+c,"");
                return removeDuplicates(s);
            }
        }
        return s;
}

// Solution 2 (using stack)

public String removeDuplicates(String S) {
        Stack<Character> stk= new Stack<>(); 
        for(int i=0;i<S.length();i++){
            if(stk.empty()) stk.push(S.charAt(i));
            else{
                if(stk.peek()!=S.charAt(i)) stk.push(S.charAt(i));
                else stk.pop();
            }
        }
        String st="";
        while(!stk.empty())
            st=stk.pop()+st;
        return st;
    }
