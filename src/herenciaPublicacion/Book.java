package herenciaPublicacion;

public class Book extends Publication {

    private int pages;
	private int year;

    public Book() {
        super();
    }

    public Book(String title, int pages,int year ,float price) {
        this.title = title;
        this.price = price;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
	 @Override
	    public void show() {
	        System.out.println("Title: " + title);
	        System.out.println("Pages: " + pages);
	        System.out.println("Year: " + year);
	        System.out.println("Price: " + price);
	 }

}