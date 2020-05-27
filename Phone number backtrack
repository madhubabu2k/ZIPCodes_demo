class Solution {
    Map<String, String> map = new HashMap<>(){{
         put("2",  "abc");
         put("3",  "def");
         put("4",  "ghi");
         put("5",  "jkl");
         put("6",  "mno");
         put("7",  "pqrs");
         put("8",  "tuv");
         put("9",  "wxyz");
    }};
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.isEmpty()) return res;
        backtrack(res, "",digits);
        return res;
    }
    private void backtrack( List<String> res, String current,String nextDigits) {
        if(nextDigits.length() == 0) {
            res.add(current);
        }
        else{
            String digit = nextDigits.substring(0, 1);
            String letters = map.get(digit);
            for(int i = 0; i < letters.length(); i++) {
                String singleLetter = letters.substring(i, i + 1);
                backtrack(res, current + singleLetter, nextDigits.substring(1));
            }
        }
    }
}
