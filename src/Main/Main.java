package Main;

import seminar6.Book;
//import seminar6.Person;
//import seminar6.Phone;
import seminar6.Reader;

public class Main {

    //    public static void main(String[] args) {
//
//        Person artem = new Person("Artem", 20);
//        System.out.println(artem.getName());
//        System.out.println(artem.getAge());
//
//        Person masha = new Person();
//        masha.setName("Masha");
//        masha.setAge(19);
//        System.out.println(masha.getName());
//        System.out.println(masha.getAge());
//
//        System.out.println(artem);
//    }

//    public static void main(String[] args) {
//        Phone samsung = new Phone("Samsung", "37544", 32.2);
//        Phone iphone = new Phone("Iphone", "37529");
//        iphone.setWeight(36.4);
//        Phone xiaomi = new Phone();
//        xiaomi.setModel("Xiaomi");
//        xiaomi.setNumber("37533");
//        xiaomi.setWeight(29.9);
//
//        System.out.println(samsung);
//        System.out.println(iphone);
//        System.out.println(xiaomi);
//
//        samsung.receiveCall("Artem");
//        iphone.receiveCall("Andrew");
//        xiaomi.receiveCall("Bob");
//
//        System.out.println(samsung.getNumber());
//        System.out.println(iphone.getNumber());
//        System.out.println(xiaomi.getNumber());
//
//        samsung.receiveCall("Artem", "12425");
//        iphone.receiveCall("Andrew", "125436");
//        xiaomi.receiveCall("Bob", "45634523");
//
//        xiaomi.sendMessage("Hello", "3242", "32425", "9975");
//

    public static void main(String[] args) {
        Book book1 = new Book("Name1", "Author1");
        Book book2 = new Book("Name2", "Author2");
        Book book3 = new Book("Name3", "Author3");

        Reader reader1 = new Reader("Fn Ln", 11, "Engineering",
                "12.12.2012", "22311");

        Reader.takeBook(reader1, book1, book3, book2);
        Reader.takeBook("Fn Ln", 4);
        Reader.takeBook("Fn Ln", "book1", "book23", "text");

        Reader.returnBook(reader1, book1, book3, book2);
        Reader.returnBook("Fn Ln", 4);
        Reader.returnBook("Fn Ln", "book1", "book23", "text");
    }
}
