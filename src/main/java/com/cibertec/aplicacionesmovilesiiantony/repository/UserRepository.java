package com.cibertec.aplicacionesmovilesiiantony.repository;

import com.cibertec.aplicacionesmovilesiiantony.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query("select u from User u where u.email=?1")
    public User iniciarSesion(String vLogin);
}
