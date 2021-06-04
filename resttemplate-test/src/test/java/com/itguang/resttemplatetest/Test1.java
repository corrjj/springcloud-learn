package com.itguang.resttemplatetest;

import com.itguang.resttemplatetest.entity.UserEntity;
import com.itguang.resttemplatetest.service.UserService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Test1 {

    @Test
    public void testGit(){
        UserService us = new UserService();
        List<UserEntity> list = us.getAll();
        for (UserEntity userEntity : list) {
            System.out.println(userEntity.toString());
        }


    }

}
