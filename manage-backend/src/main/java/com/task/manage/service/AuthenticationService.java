package com.task.manage.service;

import com.task.manage.dto.JwtAuthenticationResponse;
import com.task.manage.dto.RefreshTokenRequest;
import com.task.manage.dto.SignUpRequest;
import com.task.manage.dto.SigninRequest;
import com.task.manage.model.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
