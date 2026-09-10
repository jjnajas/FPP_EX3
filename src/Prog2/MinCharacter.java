package Prog2;

public class MinCharacter {

    public char findMin(String str) {

        if (str.length() == 1) {
            return str.charAt(0);
        }

        char minRest = findMin(str.substring(1));

        if (str.charAt(0) < minRest) {
            return str.charAt(0);
        } else {
            return minRest;
        }
    }

    public static void main(String[] args) {

        MinCharacter obj = new MinCharacter();

        String input = "Manito";

        char result = obj.findMin(input);

        System.out.println("Minimum character: " + result);
    }
}
