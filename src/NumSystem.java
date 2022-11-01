public class NumSystem {
    public void number() {

        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
    }
    public void number(int a) {
        for (int y = 3; y >= 0; y--) {
            System.out.println(y);
        }
    }
}
class TestProgram{
    public static void main(String[] args) {
        NumSystem n = new NumSystem();
        n.number();
        System.out.println("\n");
        n.number(5);
    }
}
