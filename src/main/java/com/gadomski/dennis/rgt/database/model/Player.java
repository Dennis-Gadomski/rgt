package com.gadomski.dennis.rgt.database.model;

import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "player", schema = "public")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
}
