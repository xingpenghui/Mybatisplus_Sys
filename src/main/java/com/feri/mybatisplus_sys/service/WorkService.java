package com.feri.mybatisplus_sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.feri.mybatisplus_sys.entity.Work;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Feri
 * @since 2019-03-21
 */
public interface WorkService extends IService<Work> {

    int updateMoney(int id,int money);
}
