package com.idomsoft.competencematrix.controllers;

import com.idomsoft.competencematrix.managers.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  //  @Autowired
    private UserManager userManager;
}
