package com.zsgs.librasphere.repository.db;

import com.zsgs.librasphere.repository.dto.Library;
import com.zsgs.librasphere.repository.dto.RegistrationInfo;
import com.zsgs.librasphere.repository.dto.Book;
import com.zsgs.librasphere.repository.dto.User;
import java.util.ArrayList;
import java.util.List;

public class LibraScopeDb {
    private static LibraScopeDb sLibraScopeDb;

    private LibraScopeDb() {
    }

    public static LibraScopeDb getInstance() {
        if (sLibraScopeDb == null) {
            sLibraScopeDb = new LibraScopeDb();

        }
        return sLibraScopeDb;
    }

    private RegistrationInfo registrationInfo;
    private Library library;
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public RegistrationInfo getRegistrationInfo() {
        return registrationInfo;
    }

    public void setRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public boolean validateLoginIngo(String userName, String password) {
        return registrationInfo.getUserName().equals(userName) && registrationInfo.getPassword().equals(password);
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return new ArrayList<>(books);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}
