public class HW3 {
    public static void main(String[] args) {
        String string = "aaa bbbbb ccccccc";
        String w = "";
        String lw = "";

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);

            if (currentChar != ' ') {
                w += currentChar;
            } else {
                if (w.length() > lw.length()) {
                    lw = w;
                }
                w = "";
            }
        }

        if (w.length() > lw.length()) {
            lw = w;
        }

        System.out.println("Longest word = " + lw);
    }


}
