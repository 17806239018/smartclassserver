package team.qdu.smartclassserver.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import team.qdu.smartclassserver.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer user_id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer user_id);

    User selectByEmail(String email);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}