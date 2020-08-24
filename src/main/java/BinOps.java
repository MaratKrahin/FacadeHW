public class BinOps {
    public String sum(String a, String b) {

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int result = a1 + b1;
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {

        int a1 = Integer.parseInt(a, 2);
        int b1 = Integer.parseInt(b, 2);
        int result = a1 * b1;
        return Integer.toBinaryString(result);
    }
}