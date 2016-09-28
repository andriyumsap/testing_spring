package com.andri.yuman.lelang.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created with IntelliJ IDEA.
 * User: Andri_2
 * Date: 9/29/16
 * Time: 2:01 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class User {
    @Id
    public String id;

    @NotEmpty
    @NotNull
    public String username;

    @NotEmpty
    @NotNull
    public String password;

    @NotEmpty
    @NotNull
    @Email
    public String email;
}
