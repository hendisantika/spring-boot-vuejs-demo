package com.hendisantika.repository;

import com.hendisantika.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/07/21
 * Time: 10.28
 */
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
