public String addBinary(String a, String b) {
        int carry = 0;
        int sum = 0;
        int ptr1 = a.length() - 1;
        int ptr2 = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        while(ptr1 >= 0 || ptr2 >= 0){
            int m = 0, n = 0;
            if(ptr1 >= 0) {
               m = a.charAt(ptr1) -'0';
            }
            if(ptr2 >= 0) {
               n = b.charAt(ptr2)-'0'; 
            }
            sum = m + n + carry;
            carry = (sum / 2); 
            sb.append(sum % 2);
            ptr1--;
            ptr2--;
 
        }
        if(carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
