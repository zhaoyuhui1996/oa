package mapper;

import po.EmailFile;

public interface EmailFileMapper {
    int deleteByPrimaryKey(Integer fileid);

    int insert(EmailFile record);

    int insertSelective(EmailFile record);

    EmailFile selectByPrimaryKey(Integer fileid);

    int updateByPrimaryKeySelective(EmailFile record);

    int updateByPrimaryKey(EmailFile record);
}