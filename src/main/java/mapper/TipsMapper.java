package mapper;

import po.Tips;

public interface TipsMapper {
    int insert(Tips record);

    int insertSelective(Tips record);
}