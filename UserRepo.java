package com.faaruwq.app.rest.Repo;

import com.faaruwq.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
