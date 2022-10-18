class Solution {
    public boolean isPalindrome(String s) {
        String x = s.toLowerCase();
        StringBuilder n = new StringBuilder();

        for(int i=0;i<x.length();i++){
           if(x.charAt(i) >=97 && x.charAt(i) <= 122 || x.charAt(i) >=48 && x.charAt(i) <=57){
               n.append(x.charAt(i));
           }
        }
        System.out.println(n.toString() + " " + n.length());
        if(n.length()  < 1) return true;
        if(n.length() == 1) return true;
        for(int i =0;i<n.length()/2;i++){
            
        System.out.println(n.charAt(i) +" " + n.charAt(n.length()-i-1));
            if(n.charAt(i) != n.charAt(n.length()-i-1)) return false;
        }
        return true;
    }
}
