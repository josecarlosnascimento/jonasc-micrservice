package br.com.nascar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.nascar.book.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
