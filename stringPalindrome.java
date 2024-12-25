public class stringPalindrome {
        public static void main(String[] args) {
            String s = "A man, a plan, a canal: Panama";
            s = s.replaceAll("[^a-zA-Z0-9]","");
            s = s.toLowerCase();
            String rev = reverse(s, s.length()-1, "");
            System.out.println(s);
            System.out.println(rev);
            if(rev.equals(s)) System.out.println("Palindrome");
            else System.out.println("not a palindrome");
        }
        public static String reverse(String s, int index, String reverse){
            if(index <0){
                return reverse;
            }
            reverse +=s.charAt(index);
            return reverse(s,index-1,reverse);
        }
    }