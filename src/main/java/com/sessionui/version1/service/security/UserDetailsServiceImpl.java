package com.sessionui.version1.service.security;

import com.sessionui.version1.repository.UserRepository;
import com.sessionui.version1.security.configs.detiles.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class  UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
       try {
         return new UserDetailsImpl(userRepository.findOneByLogin(login).orElseThrow(IllegalArgumentException::new));}
         catch (IllegalArgumentException e ){
           System.out.println(e);
         }
         return new UserDetailsImpl();
       }
    }

