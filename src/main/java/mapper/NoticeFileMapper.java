package mapper;

import po.NoticeFile;

public interface NoticeFileMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoticeFile record);

    int insertSelective(NoticeFile record);

    NoticeFile selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoticeFile record);

    int updateByPrimaryKey(NoticeFile record);
}