package mapper;

import po.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    User selectByUserId(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}