public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty;

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

	public String getAuthors() {
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
            getAuthors(),
            price,
            qty
        );
    }
}
