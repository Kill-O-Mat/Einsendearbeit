package src.selbsttestaufgabe4_2;

public class TestTupel implements Druckbar {
    public static void main(String[] args) {
        TestTupel tt1 = new TestTupel();
        TestTupel tt2 = new TestTupel();
        Tupel<TestTupel> tupel1 = new Tupel<>(tt1, tt2);
        tupel1.beideDrucken();
      /*  Tupel<Integer> tupel2 = new Tupel<Integer>(42, 7);
        int l2 = tupel2.getLinks(); // 42
        int r2 = tupel2.getRechts(); // 7
        System.out.println(l2 + " ------ " + r2);

       */
    }

    @Override
    public void drucken() {
        System.out.println("Ich bin druckbbbbar!");
    }
}
