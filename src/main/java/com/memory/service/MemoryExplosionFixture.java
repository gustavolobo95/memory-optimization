package com.memory.service;

import com.memory.model.Post;
import com.memory.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MemoryExplosionFixture {

    private static final Logger LOGGER = LoggerFactory.getLogger(MemoryExplosionFixture.class);

    public static User createUserWithHugePosts(int postsToGenerate, int textRepeatSize) {
        User user = new User();
        List<Post> posts = new ArrayList<>();

        for(int i = 0; i < postsToGenerate; i++) {
            Post p = new Post();
            p.setAuthor(user);
            p.setCreatedDate(LocalDate.now());
            LOGGER.warn("Posts criados antes do heap estourar: {}", i + 1);
            p.setContent(BigTextGenerator.generateBigText(textRepeatSize));

            posts.add(p);

        }

        user.setPosts(posts);
        return user;
    }
}
