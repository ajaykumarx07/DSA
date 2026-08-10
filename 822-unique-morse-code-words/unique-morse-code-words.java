class Solution {
    public int uniqueMorseRepresentations(String[] words) {
     HashSet<String> set = new HashSet<>();
    String[] m={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    for(String word:words){
        String code="";
        for(char c:word.toCharArray()){
            code+=m[c-'a'];
        }
        set.add(code);
    }
    return set.size();
    }
}