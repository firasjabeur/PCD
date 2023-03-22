package com.projet.pcd.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

  private String nom;
  private String prenom;
  private String addresse;
  private String tel;
  private String email;
  private String password;
}
