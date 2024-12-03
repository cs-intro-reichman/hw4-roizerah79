public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));
        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("Effective presentations must be clear, concise, and humble", "leverage")); // true "synergy", "disrupt", "leverage", "Paradigm", "transform"
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowstr = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<=90&&str.charAt(i)>=65){
                lowstr += (char)(str.charAt(i)+32);
            }
            else{
                lowstr += str.charAt(i);
            }
        }
        return lowstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str1!=null&&str2=="") return true;
        if(str1.length()<str2.length()) return false;
        boolean contains = false;
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==str2.charAt(0)&&(str1.length()-i+1>=str2.length())){
                int tempi = i+1;
                int j = 1;
                while(j<str2.length()){
                    if(str1.charAt(tempi)==str2.charAt(j)){
                        contains = true;
                        j++;
                        tempi++;
                    }
                    else{
                        contains = false;
                        break;
                    }
                }
                if(j==str2.length()&&contains) return contains;
            }
        }
        return contains;
    }
}
