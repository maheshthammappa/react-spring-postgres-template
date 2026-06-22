package me.maheshthammappa.myproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.maheshthammappa.myproject.entity.Test;

public interface TestRepository extends JpaRepository<Test, Long> {
}