package com.javens.springboot.dubbo.provider.db.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.javens.springboot.dubbo.provider.db.dataobject.UserDO;
import com.javens.springboot.dubbo.provider.db.mapper.UserDOMapper;

/**
* The Table SP_USER.
* SP_USER
*/
@Repository
public class UserDAO{

    @Autowired
    private UserDOMapper userDOMapper;

    /**
    * desc:insert:SP_USER.<br/>
    * descSql =  INSERT INTO SP_USER VALUES 
        * @param entity entity
    * @return Long
    */
    public Long insert(UserDO entity){
        return userDOMapper.insert(entity);
    }
    /**
    * desc:根据用户ID获取信息.<br/>
    * descSql =  SELECT * FROM SP_USER WHERE ID = #{id,jdbcType=INTEGER}
        * @param id id
    * @return UserDO
    */
    public UserDO getById(Integer id){
        return userDOMapper.getById(id);
    }
    /**
    * desc:根据用户ID获取信息.<br/>
    * descSql =  SELECT * FROM SP_USER WHERE ID = #{id,jdbcType=INTEGER} for update
        * @param id id
    * @return UserDO
    */
    public UserDO getByIdForUpdate(Integer id){
        return userDOMapper.getByIdForUpdate(id);
    }
    /**
    * desc:根据ID更新费率表信息.<br/>
    * descSql =  update SP_USER money = #{money,jdbcType=DECIMAL}, where id = #{id,jdbcType=INTEGER}
        * @param entity entity
    * @return Long
    */
    public Long updateMoneyById(UserDO entity){
        return userDOMapper.updateMoneyById(entity);
    }
}
