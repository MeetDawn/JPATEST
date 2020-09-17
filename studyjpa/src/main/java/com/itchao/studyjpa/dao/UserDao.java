package com.itchao.studyjpa.dao;

import com.itchao.studyjpa.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author Mr.L
 */
public interface UserDao extends JpaRepository<User,Long> {

}
