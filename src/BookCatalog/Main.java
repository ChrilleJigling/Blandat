package BookCatalog;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;


public class Main {

	public static void main(String[] args) {

		BookCollection bc = new BookCollection();
		List<Book> foundBooks = bc.findBooks(book -> book.getTitle().toLowerCase().contains("men"));
                foundBooks.forEach(System.out::println);
		
                
                Map<Integer, String> bookMap = bc.findBooksToMap(book -> book.getTitle().toLowerCase().contains("men"));
                bookMap.forEach((k,v) -> System.out.println(k+" : "+v));
                
                
                System.out.println(bc.nrOfBooksMatch(b -> b.getAuthor().startsWith("D")));
	}
}
