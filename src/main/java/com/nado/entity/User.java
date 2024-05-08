package com.nado.entity;

import com.nado.dto.UserCreateRequestDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String nickname;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private Boolean emailVerified;

    public User(UserCreateRequestDTO userCreateRequestDTO) {
        email = userCreateRequestDTO.getEmail();
        password = userCreateRequestDTO.getPassword();
        nickname = userCreateRequestDTO.getNickname();
        status = Status.ACTIVE;
        role = Role.USER;
        emailVerified = userCreateRequestDTO.getEmailVerified();
    }

    public User() {

    }

    public enum Status {
        ACTIVE, INACTIVE, BANNED
    }

    public enum Role {
        USER, ADMIN
    }

    @OneToMany(mappedBy = "user")
    private Set<Post> posts = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name = "user_followers",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "follower_id")}
    )
    private Set<User> followers = new HashSet<>();

    @ManyToMany(mappedBy = "followers")
    private Set<User> following = new HashSet<>();
}
