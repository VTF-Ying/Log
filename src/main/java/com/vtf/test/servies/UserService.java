package com.vtf.test.servies;

import java.util.*;
import com.vtf.test.entity.Users;
import com.vtf.test.mapper.UsersMapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: Log
 * @ClassName: UserService
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-11 14:55
 */
@Service
@Slf4j
public class UserService {
    @Autowired
    private UsersMapper usersMapper;

    public List<Users> findUsers(){
        List<Users> users = usersMapper.findUsers();
        log.info(users.toString());
        return users;
    }
}
