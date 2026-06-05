import java.util.Arrays;

class P3 {

    public static String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);

        int i = 0, j = 0;

        while (i < strs[0].length()
                && j < strs[strs.length - 1].length()
                && strs[0].charAt(i) == strs[strs.length - 1].charAt(j)) {

            i++;
            j++;
        }

        return strs[0].substring(0, i);
    }

    public static void main(String[] args) {

        System.out.println(
            "output: " +
            longestCommonPrefix(
                new String[]{"flower", "flow", "flight"}
            )
        );
    }
}