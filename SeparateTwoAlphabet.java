package ClassWork;

public class SeparateTwoAlphabet {
    public static void main(String[] args) {
        String name = "VENTURES";
        for (int i = 0; i < name.length(); i += 2) {
            System.out.println(name.charAt(i) + " " + name.charAt(i + 1));
        }
    }
}

