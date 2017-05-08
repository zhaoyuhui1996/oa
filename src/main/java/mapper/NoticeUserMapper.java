package mapper;

import po.NoticeUser;
import po.NoticeUserKey;

public interface NoticeUserMapper {
    int deleteByPrimaryKey(NoticeUserKey key);

    int insert(NoticeUser record);

    int insertSelective(NoticeUser record);

    NoticeUser selectByPrimaryKey(NoticeUserKey key);

    int updateByPrimaryKeySelective(NoticeUser record);

    int updateByPrimaryKey(NoticeUser record);
}