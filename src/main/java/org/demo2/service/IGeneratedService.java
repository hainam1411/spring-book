package org.demo2.service;

import java.util.Optional;

public interface IGeneratedService <T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);

}
