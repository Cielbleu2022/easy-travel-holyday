package com.example.EasyTravelHolyday.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "utilisateur")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="user_type")
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;

    //Association fille avec la classe Role
    @ManyToMany
    @JoinTable(
            name = "userRole",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

}
