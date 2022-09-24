package com.cookingdata.ingredientstest.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter @Setter @ToString @RequiredArgsConstructor @NoArgsConstructor
public class Ingredient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private Boolean inPantry;
    @NonNull
    private String imageIngredientUrl;
    //NonNull added to everything except to Id to make a constuctor without ID

}
