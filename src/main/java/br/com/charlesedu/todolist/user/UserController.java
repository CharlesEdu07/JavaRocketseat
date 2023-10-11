package br.com.charlesedu.todolist.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/")
    public ResponseEntity<UserModel> create(@RequestBody UserModel userModel) {
        return ResponseEntity.ok().body(userModel);
    }
}
