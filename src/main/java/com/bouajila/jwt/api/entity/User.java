package com.bouajila.jwt.api.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name="USER_TBL")
public class User {
    @Id
    @Column(name = "Id", nullable = false)
    private int id;
    private String username;
    private String password;
    private  String email;
}
