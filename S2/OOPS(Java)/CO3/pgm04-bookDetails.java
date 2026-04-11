import java.util.Scanner;

class Publisher {
    String publisher;

    Publisher(String pub) {
        this.publisher = pub;
    }
}

class Book extends Publisher {
    String book;

    Book(String pub, String boo) {
        super(pub);
        this.book = boo;
    }
}

class Literature extends Book {

    Literature(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher : " + publisher);
        System.out.println("Book : " + book);
    }
}

class Fiction extends Book {

    Fiction(String pub, String boo) {
        super(pub, boo);
    }

    void display() {
        System.out.println("Publisher : " + publisher);
        System.out.println("Book : " + book);
    }
}

public class bookDetails {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter the No. of Literature Books");
        int num = sc1.nextInt();

        Literature arr[] = new Literature[num];

        System.out.println("\nEnter the Literature Book Details\n");

        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");

            System.out.println("Book : ");
            String boo = sc.next();

            System.out.println("Publisher : ");
            String pub = sc.next();
            arr[i] = new Literature(pub, boo);
        }

        System.out.println("\nEnter the No. of Fiction Books");
        int num1 = sc1.nextInt();

        Fiction arr1[] = new Fiction[num1];

        System.out.println("\nEnter the Fiction Book Details\n");

        for (int i = 0; i < num1; i++) {
            System.out.println("\n" + (i + 1) + ").");

            System.out.println("Book : ");
            String boo = sc.next();

            System.out.println("Publisher : ");
            String pub = sc.next();
            arr1[i] = new Fiction(pub, boo);
        }

        System.out.println("\n *** Informations of all the Literature Books *** ");
        for (int i = 0; i < num; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr[i].display();
        }

        System.out.println("\n *** Informations of all the Fiction Books *** ");
        for (int i = 0; i < num1; i++) {
            System.out.println("\n" + (i + 1) + ").");
            arr1[i].display();
        }

        sc.close();
        sc1.close();
    }
}