package bookstored;

import org.example.BookShelf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("<= BookShelf Specification =>")
public class BookShelfSpec {

    private BookShelfSpec(TestInfo testInfo) {
        System.out.println("Working on test " + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("is empty when no book is added to it")
    public void shelfEmptyWhenNoBooksAdded(TestInfo testInfo) throws Exception {
        System.out.println("Working on test " + testInfo.getDisplayName());
        BookShelf shelf = new BookShelf();
        List<String> books = shelf.books();
        assertTrue(books.isEmpty(), () -> "BookShelf should be empty.");
    }

}
