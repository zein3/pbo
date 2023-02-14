public class Main {
    public static void main(String[] args) {
        Author nano = new Author("Nano Yulian P.", "nano@bps.go.id", 'm');
        System.out.println(nano);

        Book oopBook = new Book("OOP for dummies", new Author[] { nano }, 50000, 100);
        System.out.println(oopBook);

        oopBook.setPrice(35000);
        oopBook.setQty(50);

        System.out.println(oopBook);

        Author yeni = new Author("Wa ode Zuhayeni M.", "yeni@bps.go.id", 'f');
        Author[] authors = { nano, yeni };
        Book javaBook = new Book("Java for dummies", authors, 10000);
        System.out.println(javaBook);
        System.out.println(javaBook.getAuthorNames());
    }
}
