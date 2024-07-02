package org.demo2.repository;

import org.demo2.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenreRepository extends JpaRepository<Genre, Long> {
}
