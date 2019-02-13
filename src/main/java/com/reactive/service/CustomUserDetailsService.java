package com.reactive.service;

import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;

import reactor.core.publisher.Mono;

//@Service
public class CustomUserDetailsService implements ReactiveUserDetailsService {

    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return null;
    }
}
