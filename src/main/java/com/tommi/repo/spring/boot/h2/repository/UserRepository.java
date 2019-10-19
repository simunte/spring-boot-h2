package com.tommi.repo.spring.boot.h2.repository;

import com.tommi.repo.spring.boot.h2.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
