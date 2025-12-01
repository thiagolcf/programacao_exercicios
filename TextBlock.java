public class TextBlock {

    public static void main(String[] args) {

        String textoBlock = """
                Print a bulleted list:
                    \u2022 First point
                        \u2022 sub point""";
        System.out.println(textoBlock);
        int age = 45;
        System.out.printf("Your age is %d\n", age);

        System.out.printf("Your age is %.2f%n", (float) age);
    }
}
