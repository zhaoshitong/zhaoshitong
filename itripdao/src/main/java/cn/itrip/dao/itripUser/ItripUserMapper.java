package cn.itrip.dao.itripUser;

import cn.itrip.pojo.ItripUser;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface ItripUserMapper {

	public ItripUser getItripUserById(@Param(value = "id") Long id)throws Exception;

	public ItripUser getItripUserListByMap(Map<String,Object> param)throws Exception;

	public Integer getItripUserCountByMap(Map<String,Object> param)throws Exception;

	public Integer insertItripUser(ItripUser itripUser)throws Exception;

	public Integer updateItripUser(@Param("userCode")String Phone)throws Exception;

	public Integer deleteItripUserById(@Param(value = "id") Long id)throws Exception;

}
