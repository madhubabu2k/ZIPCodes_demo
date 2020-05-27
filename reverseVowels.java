public String reverseVowels(String s) {
       // 　vowels: a e i o u
       char[] chars = s.toCharArray();
       int left = 0, right = chars.length - 1;
       while(left < right) {
           if(isVowel(chars[left]) && isVowel(chars[right])) {
               char temp = chars[left];
               chars[left] = chars[right];
               chars[right] = temp;
               left++;
               right--;
           }
           else if(!isVowel(chars[left]) && isVowel(chars[right])) {
               left++;
           }
           else if(isVowel(chars[left]) && !isVowel(chars[right])) {
               right--;
           }
           else {
               left++;
               right--;
           }
       }
       StringBuilder sb = new StringBuilder();
       for( char c: chars) {
           sb.append(c);
       }
       return sb.toString();
    
   }
   private boolean isVowel(char c) {
       return c == 'a' ||
           c =='e' ||
           c =='i' ||
           c =='o' ||
           c =='u' || 
           c == 'A' ||
           c =='E' ||
           c =='I' ||
           c =='O' ||
           c =='U';
   }
