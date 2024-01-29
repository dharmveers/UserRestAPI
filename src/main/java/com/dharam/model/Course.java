package com.dharam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Proxy;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Proxy(lazy = false)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String author;
    @Column(length = 1000)
    private String description;
    private double price;

}
