package mapper;

import po.Holiday;
import po.HolidayKey;

public interface HolidayMapper {
    int deleteByPrimaryKey(HolidayKey key);

    int insert(Holiday record);

    int insertSelective(Holiday record);

    Holiday selectByPrimaryKey(HolidayKey key);

    int updateByPrimaryKeySelective(Holiday record);

    int updateByPrimaryKey(Holiday record);
}