package com.feri.mybatisplus_sys.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feri.mybatisplus_sys.entity.Work;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author Feri
 * @since 2019-03-21
 */
public interface WorkMapper extends BaseMapper<Work> {

    //@Update("")
    int updateBymoney(@Param("id") int id, @Param("money") int money);
}