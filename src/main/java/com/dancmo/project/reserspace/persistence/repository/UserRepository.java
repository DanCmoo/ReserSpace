package com.dancmo.project.reserspace.persistence.repository;

import com.dancmo.project.reserspace.persistence.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);
    @Modifying
    @Query("DELETE User u WHERE u.username= :username")
    int deleteByUsername(@Param("username") String username);
    @Modifying
    @Query("UPDATE User u SET u.password = :password WHERE u.username = :username")
    int updatePasswordByUsername(@Param("username")String username,@Param("password")String password);

}
