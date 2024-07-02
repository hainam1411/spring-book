package org.demo2.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    private String pulishers;

    private int pages;

    private double price;

    private String image;

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;


}
