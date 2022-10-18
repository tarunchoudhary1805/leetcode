class Solution {
    public String replaceDigits(String s) {
        StringBuilder x = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i%2==0) x.append(s.charAt(i));
            else{
             char ch = shift(s.charAt(i-1),s.charAt(i));
             x.append(ch);
            }
        }
        return x.toString();
    }
    public static char shift(char s, char f){
        int num = (int)(f-'0');
        char xs = (char)(s + num);
        // System.out.println(f + " " + s +" " +num+ " " + xs);
        return xs;
    }
}
