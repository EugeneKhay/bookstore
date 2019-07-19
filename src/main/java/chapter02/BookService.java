package chapter02;

import javax.inject.Inject;

@Loggable
public class BookService {

    @Inject
    @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book();
        book.setTitle(title);
        book.setPrice(price);
        book.setDescription(description);
        String number = numberGenerator.generateNumber();
        book.setNumber(number);
        return book;
    }
}
