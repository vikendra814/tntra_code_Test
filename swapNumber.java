public class swapNumber {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Numbers before swapping: " + a + " " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping: " + a + " " + b);

    }
}
