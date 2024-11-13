package mypackage;

public class index {
    public static void main(String[] args) {
        if (args.length > 0) {
            String str = args[0];
            String reversedStr = reverseString(str);

            System.out.println("元の文字列: " + str);
            System.out.println("逆順の文字列: " + reversedStr);
        } else {
            System.out.println("文字列を引数として渡してください。");
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
