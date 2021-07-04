package com.hendisantika.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/07/21
 * Time: 10.20
 */
@Data
public class AuthorCreationRequest {
    private String firstName;
    private String lastName;
}
