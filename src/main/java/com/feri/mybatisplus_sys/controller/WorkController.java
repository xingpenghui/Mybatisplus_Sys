package com.feri.mybatisplus_sys.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.feri.mybatisplus_sys.entity.Work;
import com.feri.mybatisplus_sys.service.WorkService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/3/21 14:41
 */
@RestController
@Api(value = "记录千锋学员工作",tags = "工作相关方法")
public class WorkController {
    @Autowired
    private WorkService workService;

    //新增
    @ApiOperation(value = "新增工作")
    @PostMapping("work/add.do")
    public String save(Work work){
        return workService.save(work)==true?"新增成功":"新增失败";
    }
    //修改
    @ApiOperation(value = "修改工作")
    @PutMapping("work/updatemoney.do")
    public String update2(int id,int money){
        return workService.updateMoney(id,money)>0?"修改成功":"修改失败";
    }
    //修改
    @ApiOperation(value = "修改工作")
    @PutMapping("work/update.do")
    public String update(Work work){
        return workService.updateById(work)?"修改成功":"修改失败";
    }
    //删除
    @ApiOperation(value = "删除工作")
    @DeleteMapping("work/delete.do")
    public String del(int id){
        return workService.removeById(id)?"删除成功":"删除失败";
    }
    //查询单个
    @ApiOperation(value = "查询详情")
    @GetMapping("work/one.do")
    public Work one(int id){
        return workService.getById(id);
    }
    //查询全部
    @ApiOperation(value = "查询全部")
    @GetMapping("work/all.do")
    public List<Work> queryAll(){
        return workService.list();
    }
    //分页查询
    @ApiOperation(value = "分页查询")
    @GetMapping("work/page.do")
    public List<Work> page(int page,int limit){
        Page<Work> page1=new Page<>(page,limit);
        return workService.page(page1).getRecords();
    }


}
