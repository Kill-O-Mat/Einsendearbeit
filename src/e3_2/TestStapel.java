package src.e3_2;

class TestStapel {
    public static void main(String[] args) {
        Stapel s = new Stapel(5);
        Person p1 = new Person("Kirk", 36);
        Person p2 = new Person("Pille", 43);
        Person p3 = new Person("Spok", 43);
        Person p4 = new Person("Uhura", 43);
        Person p5 = new Person("Scotty", 47);

        //Elemente hinzufügen
        s.push(p2);
        s.add(p3, 0);
        s.push(p1);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.add(p5, 4);
        s.add(p5, 9);
        s.add(p5, 12);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);
        s.push(p4);

        System.out.println();
        System.out.println("************************");
        System.out.println("Größe des Stapels: " + s.getSize());

        System.out.println();
        System.out.println("************************");
        int[] positionen = {0, 3, 8};
        for (int position : positionen) {
            System.out.println("Element " + position + " das Stapels: " + ((s.getElementAt(position) == null) ? "ELement an dieser Position nicht vorhanden." : s.getElementAt(position)));
        }

        System.out.println();
        System.out.println("************************");
        System.out.println(s.peek());

        System.out.println();
        System.out.println("************************");
        System.out.println("Entferne: " + s.removeElementAt(-1));

        System.out.println();
        System.out.println("************************");
        System.out.println("Entferne: " + s.pop());

        System.out.println();
        System.out.println("************************");
        System.out.println("Der Stapel ist " + ((s.isEmpty()) ? "" : "nicht ") + "leer.");

        System.out.println();
        System.out.println("************************");
        System.out.println(s);
    }
}
