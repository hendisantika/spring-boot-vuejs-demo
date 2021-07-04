package com.hendisantika.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/07/21
 * Time: 10.21
 */
@Data
public class BookCreationRequest {
    private String name;
    private String isbn;
    private Long authorId;
}
