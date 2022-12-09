package com.github.churakovia.planner.model;

import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Пользователь.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String id;
  private String name;
  private String email;
  private String password;
  private boolean enabled = true;
  private Date registered = new Date();
  private Set<Role> roles;
}
