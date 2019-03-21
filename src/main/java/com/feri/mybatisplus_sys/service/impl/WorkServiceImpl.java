package com.feri.mybatisplus_sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feri.mybatisplus_sys.entity.Work;
import com.feri.mybatisplus_sys.mapper.WorkMapper;
import com.feri.mybatisplus_sys.service.WorkService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Feri
 * @since 2019-03-21
 */
@Service
public class WorkServiceImpl extends ServiceImpl<WorkMapper, Work> implements WorkService {


    @Override
    public int updateMoney(int id, int money) {
        return getBaseMapper().updateBymoney(id,money);
    }
}
