package com.lojaonline.infrastructure.entity;


import com.lojaonline.core.domain.enums.EnumUserType;
import jakarta.persistence.*;
import lombok.*;


import java.util.UUID;

@Entity
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
@Table(name = "usuario")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String email;
    private String password;
    private String type;
}
