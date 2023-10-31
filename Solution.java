class Solution {
    public static char mostFrequentChar(String s) {
        char mostFrequent = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int currentCount = 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    currentCount++;
                }
            }

            if (currentCount > maxCount || (currentCount == maxCount && str.indexOf(currentChar) < str.indexOf(mostFrequent))) {
                mostFrequent = currentChar;
                maxCount = currentCount;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        // Try out your test cases:
        System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e
        System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
        System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
        System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

}


