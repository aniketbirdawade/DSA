public class simpleIntrest {

    public void Calculate(int p, int r, int t) {
        int result = (p * r * t) / 100;
        System.out.println(result);
    }

    public static void main(String[] args) {
        simpleIntrest s = new simpleIntrest();
        s.Calculate(3000, 7, 1);
    }
}
