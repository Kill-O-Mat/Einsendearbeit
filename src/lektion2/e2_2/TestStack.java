package lektion2.e2_2;

public class TestStack {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        s1.push("Das ist der erste Eintrag.");
        s1.push("Das ist ein zweiter Eintrag.");
        s1.push("Das ist der dritte Eintrag.");
        s1.push("Das ist der vierte Eintrag.");
        s1.push("Das ist der fünfte Eintrag.");

        System.out.println("Das ist die Ausgabe des Stacks: ");
        s1.printList();
        System.out.println(s1);
        System.out.println("**********************");
        s1.pop();
        s1.pop();
        System.out.println(s1);
        System.out.println("Das ist die Ausgabe des Stacks: ");
        s1.printList();
        //    s1.pop();
        //    System.out.println(s1);
        //    s1.push("Das ist ein zweiter Eintrag.");
        //   System.out.println(s1);
    }
}