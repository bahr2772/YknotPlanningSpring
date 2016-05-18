package com.yknotplanning.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yknotplanning.persistence.model.User;
import com.yknotplanning.persistence.model.VerificationToken;

public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {

    VerificationToken findByToken(String token);

    VerificationToken findByUser(User user);

}
