package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
