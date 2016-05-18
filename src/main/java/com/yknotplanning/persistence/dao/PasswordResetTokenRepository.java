package com.yknotplanning.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yknotplanning.persistence.model.PasswordResetToken;
import com.yknotplanning.persistence.model.User;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {

    PasswordResetToken findByToken(String token);

    PasswordResetToken findByUser(User user);

}
