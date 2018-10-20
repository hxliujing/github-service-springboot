package com.javens.springboot.dubbo.provider.db.mapper;
import org.apache.ibatis.annotations.Param;
import com.javens.springboot.dubbo.provider.db.dataobject.UserDO;
/**
*
* The Table SP_USER.
* SP_USER
*/
public interface UserDOMapper{

    /**
    * desc:insert:SP_USER.<br/>
    * descSql =  INSERT INTO SP_USER VALUES 
        * @param entity entity
    * @return Long
    */
    Long insert(UserDO entity);
    /**
    * desc:根据用户ID获取信息.<br/>
    * descSql =  SELECT * FROM SP_USER WHERE ID = #{id,jdbcType=INTEGER}
        * @param id id
    * @return UserDO
    */
    UserDO getById(Integer id);
    /**
    * desc:根据用户ID获取信息.<br/>
    * descSql =  SELECT * FROM SP_USER WHERE ID = #{id,jdbcType=INTEGER} for update
        * @param id id
    * @return UserDO
    */
    UserDO getByIdForUpdate(Integer id);
    /**
    * desc:根据ID更新费率表信息.<br/>
    * descSql =  update SP_USER money = #{money,jdbcType=DECIMAL}, where id = #{id,jdbcType=INTEGER}
        * @param entity entity
    * @return Long
    */
    Long updateMoneyById(UserDO entity);
}
