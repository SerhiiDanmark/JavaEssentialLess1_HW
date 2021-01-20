package Task3;

public class Book {
    public static void main(String[] args) {

        Title title = new Title();
        Author author = new Author();
        Content content = new Content();

        title.setTitle("Finance");
        author.setAuthor("Warren Buffett");
        content.setContent("Finance & World");

        title.show();
        author.show();
        content.show();
    }
}
