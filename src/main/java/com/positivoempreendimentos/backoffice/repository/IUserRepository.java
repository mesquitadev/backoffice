package com.positivoempreendimentos.backoffice.repository;

import com.positivoempreendimentos.backoffice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
