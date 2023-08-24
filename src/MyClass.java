class MyClass {

    public static int myMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int result = myMethod(num1, num2);
        System.out.println("Result: " + result);
    }
}