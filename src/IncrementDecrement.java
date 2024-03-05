public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        System.out.println(lives);
        lives--;
        System.out.println(lives);

        lives --;
        System.out.println(lives);

        int gift = 100 + ++lives;
        System.out.println(lives);
        System.out.println(gift);
    }
}
