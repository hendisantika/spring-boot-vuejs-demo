package com.hendisantika.repository;

import com.hendisantika.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-rest-api-mysql
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 04/07/21
 * Time: 10.34
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}
