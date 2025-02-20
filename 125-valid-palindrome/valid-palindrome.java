class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^a-zA-Z0-9]" , "");
        s2 = s2.toLowerCase();
        int j = 0;
        String reverse = "";
        for(int i = s2.length()-1; i>=0; i--){
            reverse = reverse + s2.charAt(i);
            }
        
        if (s2.equals(reverse)){
            return true;
        }
    return false;
    }
}