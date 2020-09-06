package demo.librarymanangement.service;

import java.util.List;

import demo.librarymanangement.model.Book;

public interface LibrarymanagementService {

    String addBook(Book book);
    String addBookwithRateLimit(Book book);
    List<Book> getBookList();
    List<Book> getBookListBulkhead();
}