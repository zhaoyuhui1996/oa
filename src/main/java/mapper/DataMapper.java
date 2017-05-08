package mapper;

import po.Data;

public interface DataMapper {
    int deleteByPrimaryKey(Integer dataid);

    int insert(Data record);

    int insertSelective(Data record);

    Data selectByPrimaryKey(Integer dataid);

    int updateByPrimaryKeySelective(Data record);

    int updateByPrimaryKey(Data record);
}