package RestApi.restapi_aplikasi.User.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api/user")
public class UserController {
    
    @GetMapping()
    public String getAll() {
        return new String();
    }

    @GetMapping("/{id}")
    public ResponseEntity getById(@RequestParam String param) {
        return new String();
    }

    @PostMapping("path")
    public ResponseEntity postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    @PutMapping("path/{id}")
    public ResponseEntity putMethodName(@PathVariable String id, @RequestBody String entity) {
        //TODO: process PUT request
        
        return entity;
    }
    
    @DeleteMapping("/{id}")
        public ResponseEntity deleteMethodName(@PathVariable("id") Long id) {
            return entity;   
    }
}


