package com.zsgs.librasphere.features.books.details;

import com.zsgs.librasphere.features.base.BaseModel;
import com.zsgs.librasphere.repository.db.LibraScopeDb;
import com.zsgs.librasphere.repository.dto.Book;
import java.util.Optional;

class DetailsModel extends BaseModel {

    private final DetailsView view;

    public DetailsModel(DetailsView view) {
        this.view = view;
    }

    void getBookDetails(String bookId) {
        if (bookId == null || bookId.trim().isEmpty()) {
            view.showMessage("Please enter a valid Book ID.");
            return;
        }

        Optional<Book> book = LibraScopeDb.getInstance().getAllBooks().stream()
                .filter(b -> b.getId().equals(bookId))
                .findFirst();

        view.displayBookDetails(book.orElse(null));
    }
}
