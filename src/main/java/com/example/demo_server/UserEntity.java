package com.example.demo_server;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "userserver")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
}