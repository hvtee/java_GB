package seminar6;

public class Reader {
    private String fullName;
    private int id;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", id=" + id +
                ", faculty='" + faculty + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Reader(String fullName, int id, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.id = id;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(Reader reader, Book... books) {
        for (Book book :
                books) {
            System.out.printf("%s took %s(%s)", reader.getFullName(), book.getBookName(), book.getBookAuthor());
            System.out.println();
        }
        System.out.println();
    }

    public void takeBook(String name, int quantity) {
        System.out.printf("%s took %s books", name, quantity);
        System.out.println();
        System.out.println();
    }

    public void takeBook(String name, String... bookNames) {
        for (String book :
                bookNames) {
            System.out.printf("%s took %s ", name, book);
            System.out.println();
        }
        System.out.println();
    }

    public void returnBook(Reader reader, Book... books) {
        for (Book book :
                books) {
            System.out.printf("%s returned %s(%s)", reader.getFullName(), book.getBookName(), book.getBookAuthor());
            System.out.println();
        }
        System.out.println();
    }

    public void returnBook(String name, int quantity) {
        System.out.printf("%s returned %s books", name, quantity);
        System.out.println();
        System.out.println();
    }

    public void returnBook(String name, String... bookNames) {
        for (String book :
                bookNames) {
            System.out.printf("%s returned %s ", name, book);
            System.out.println();
        }
        System.out.println();
    }
}
