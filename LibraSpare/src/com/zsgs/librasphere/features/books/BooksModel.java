package com.zsgs.librasphere.features.books;

import com.zsgs.librasphere.features.base.BaseModel;
import com.zsgs.librasphere.repository.db.LibraScopeDb;
import com.zsgs.librasphere.repository.dto.Book;
import java.util.List;
import java.util.stream.Collectors;

class BooksModel extends BaseModel {

    private final BooksView view;

    public BooksModel(BooksView view) {
        this.view = view;
    }

    void viewAllBooks() {
        List<Book> books = LibraScopeDb.getInstance().getAllBooks();
        view.displayBooks(books);
    }
}
