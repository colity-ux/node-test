package com.book.springboot.domain.posts;

import lombok.Getter;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.sql.init.dependency.DependsOnDatabaseInitialization;

import javax.persistence.Column;


@Getter

@NoArgsConstructor
@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(lenght = 500, nullable = false)

    @Builer
    public Posts(String title, String content String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }



}
