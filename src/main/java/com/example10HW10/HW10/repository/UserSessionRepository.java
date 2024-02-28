package com.example10HW10.HW10.repository;


import com.example10HW10.HW10.model.UserSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSessionRepository extends JpaRepository<UserSession, Long> {

    void deleteByUserId(Long userId);
}
