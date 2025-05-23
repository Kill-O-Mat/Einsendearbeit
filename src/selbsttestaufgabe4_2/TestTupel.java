package src.selbsttestaufgabe4_2;

public class TestTupel {
    public static void main(String[] args) {
        Tupel<String> tupel1 = new Tupel<String>("a", "b");
        String l1 = tupel1.getLinks(); // "a"
        String r1 = tupel1.getRechts(); // "b"
        System.out.println(l1 + " ------ " + r1);
        Tupel<Integer> tupel2 = new Tupel<Integer>(42, 7);
        int l2 = tupel2.getLinks(); // 42
        int r2 = tupel2.getRechts(); // 7
        System.out.println(l2 + " ------ " + r2);
    }
}
