package in.maoesoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import in.maoesoft.onlinebookstore.entity.Book;

public interface BookRepository extends  JpaRepository<Book, Long> {

}
