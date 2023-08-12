package PracticeDay_05;

public class P04_PalindromicSayi {
    //chatgpt nin çözümü

        public static boolean isPalindrome(int number) {
        String strNumber = Integer.toString(number);
        int i = 0;
        int j = strNumber.length() - 1;
        while (i < j) {
            if (strNumber.charAt(i) != strNumber.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int largestPalindrome = 0;

        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                }
            }
        }

        System.out.println("En büyük palindromik sayı: " + largestPalindrome);




    }
}