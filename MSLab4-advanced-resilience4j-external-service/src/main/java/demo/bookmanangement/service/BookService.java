package demo.bookmanangement.service;

import java.util.List;

import demo.bookmanangement.model.Book;

public interface BookService {


    public String addBook(Book book);

    public List<Book> retrieveBookList();
}
