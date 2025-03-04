package com.parking.parkinglot.common;

public class UserDto {
    private Long id;
    public String username;
    public String password;
    public String email;

    public UserDto(Long id, String username, String password, String email) {
        this.id = id;
        this.username=username;
        this.password=password;
        this.email=email;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
