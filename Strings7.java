class Strings7 {
    public String ReplaceConsecutiveTwoSamewithOne(String s) {
        // code here
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                continue;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Strings obj = new Strings();
        String s = "aabb";
        String s1 = "aabaa";
        String s2 = "aaaa";
        System.out.println(obj.ReplaceConsecutiveTwoSamewithOne(s));
        System.out.println(obj.ReplaceConsecutiveTwoSamewithOne(s1));
        System.out.println(obj.ReplaceConsecutiveTwoSamewithOne(s2));
    }
}
