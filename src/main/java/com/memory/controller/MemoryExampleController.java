package com.memory.controller;

import com.memory.model.User;
import com.memory.service.MemoryExplosionFixture;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemoryExampleController {

    /**
     * A ideia desse endpoint é criar uma chamada que estoure a memoria que gradualmente será melhorada em outras branchs.
     * @return
     */
    @GetMapping("/getUserPosts")
    public ResponseEntity<?> getUserPosts() {

        User u = MemoryExplosionFixture.createUserWithHugePosts(
                20_000,
                2000
        );

        u.setName("Lobo");

        return ResponseEntity.ok(u);
    }

}
