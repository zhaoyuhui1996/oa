package mapper;

import po.ReceiveEmail;

public interface ReceiveEmailMapper {
    int deleteByPrimaryKey(String receiveuserid);

    int insert(ReceiveEmail record);

    int insertSelective(ReceiveEmail record);

    ReceiveEmail selectByPrimaryKey(String receiveuserid);

    int updateByPrimaryKeySelective(ReceiveEmail record);

    int updateByPrimaryKey(ReceiveEmail record);
}