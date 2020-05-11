package com.vtf.test.mapper;

import com.vtf.test.entity.Users;
import java.util.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @ProjectName: Log
 * @ClassName: UsersMapper
 * @Description: TODO(一句话描述该类的功能)
 * @Author: VTF
 * @create: 2020-05-11 14:51
 */
@Repository
@Mapper
public interface UsersMapper {
    void save(Users users);
    void deleteById(Users users);
    void update(Users users);
    List<Users> findUsers();
}

