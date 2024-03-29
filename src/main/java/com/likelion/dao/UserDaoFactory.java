package com.likelion.dao;

import com.likelion.connection.AwsConnectionMaker;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class UserDaoFactory {

    @Bean
    public UserDao awsUserDao() {
        return new UserDao(new AwsConnectionMaker());
    }
}
