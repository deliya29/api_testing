package RestApi.restapi_aplikasi.Auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import RestApi.restapi_aplikasi.Auth.dto.LoginDTO;
import RestApi.restapi_aplikasi.Auth.dto.RegisterDTO;
import RestApi.restapi_aplikasi.Auth.service.AuthService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/auth/")
public class AuthController {
    
    @Autowired
    public AuthService authService;
    
    // @PostMapping("/login")
    // public String insert(@RequestBody RegisterDTO dto) {
    //     return authService.insert(dto);
    // }

    @PostMapping("/register")
    public String postMethodName(@RequestBody RegisterDTO dto) {
        return authService.register(dto);
    }

    // @PostMapping("/logout")
    // public String postMethodName(@RequestBody String entity) {
    //     //TODO: process POST request
        
    //     return authService.delete(null);
    // }
    

}
