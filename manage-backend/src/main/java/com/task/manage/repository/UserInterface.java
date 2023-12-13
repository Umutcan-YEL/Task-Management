package com.task.manage.repository;

import com.task.manage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserInterface extends JpaRepository<User, Long> {
}
