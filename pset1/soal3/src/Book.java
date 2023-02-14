/**
 * Kelas untuk merepresentasikan buku dan memiliki hubungan untuk menggambarkan penulis yang menulis buku.
 *
 * @author  Ahmad Zein Haddad
 */
public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

    /**
     * Mengembalikan array penulis sebagai string.
     * @return {author[name=author1,...],...}
     */
    private String getAuthorsString() {
        String result = "{";

        for (int i = 0; i < authors.length; i++) {
            result += authors[i].toString();
            if (i != (authors.length - 1)) {
                result += ",";
            }
        }

        result += "}";
        return result;
    }

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

	public String getName() {
		return name;
	}

	public Author[] getAuthors() {
        return authors;
	}

    /**
     * Mengembalikan seluruh nama author.
     * @return author1, author2, ...
     */
    public String getAuthorNames() {
        String result = "";

        for (int i = 0; i < authors.length; i++) {
            result += authors[i].getName();
            if (i != (authors.length - 1)) {
                result += ", ";
            }
        }

        return result;
    }

	public double getPrice() {
		return price;
	}

	public int getQty() {
		return qty;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

    public String toString() {
        return String.format("Book[name=%s,authors=%s,price=%.2f,qty=%d]",
            name,
            getAuthorsString(),
            price,
            qty
        );
    }
}
