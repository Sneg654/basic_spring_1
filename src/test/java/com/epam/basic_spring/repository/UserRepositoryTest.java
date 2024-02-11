package com.epam.basic_spring.repository;

import com.epam.basic_spring.repository.UserEntity;
import com.epam.basic_spring.repository.UserRepository;
import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ActiveProfiles("test")
@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTest {
    @Autowired
    UserRepository repository;


    @Test
    void save_user() {

        //given
        UserEntity userEntity = new UserEntity();
        userEntity.setName("name_test");
        repository.save(userEntity);

        //when
        List<UserEntity> userEntityList = repository.findAll();

        //then
        assertEquals(1, userEntityList.size());

    }

}
