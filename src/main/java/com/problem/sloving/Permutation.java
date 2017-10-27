package com.swisslog.wm6.medportal.web;
public class Permutation {
    static void printPatternUtil(String str, char buf[], int i, int j, int n) {
        if (i == n) {
            buf[j] = '\0';
            System.out.println(buf);
            return;
        }

        buf[j] = str.charAt(i);
        printPatternUtil(str, buf, i + 1, j + 1, n);

        // put comma
        buf[j] = ',';
        buf[j + 1] = str.charAt(i);

        printPatternUtil(str, buf, i + 1, j + 2, n);
    }

    static void printPattern(String str) {
        int len = str.length();
        char[] buf = new char[2 * len];
        buf[0] = str.charAt(0);
        printPatternUtil(str, buf, 1, 1, len);
    }

    public static void main(String[] args) {
        String str = "ABCD";
        printPattern(str);
    }
}
