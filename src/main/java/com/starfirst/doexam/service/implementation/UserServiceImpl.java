package com.starfirst.doexam.service.implementation;

import com.starfirst.doexam.repository.UserRepository;
import com.starfirst.doexam.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;


}
