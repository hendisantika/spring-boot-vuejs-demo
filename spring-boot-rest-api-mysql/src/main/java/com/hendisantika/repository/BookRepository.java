package com.hendisantika.repository;

import com.hendisantika.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/07/21
 * Time: 10.31
 */
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIsbn(String isbn);
}
