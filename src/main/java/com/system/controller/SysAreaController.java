package com.system.controller;

import com.system.entity.SysArea;
import com.system.pojo.SysUserDTO;
import com.system.service.SysAreaService;
import com.system.service.SysUserService;
import com.system.service.impl.SysAreaServiceImpl;
import com.system.util.CheckException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: 李景然
 * @Date: 2018/6/11 21:04
 * @Description:
 */
@RestController
@Api(tags = "sysArea",description = "病区相关操作")
@RequestMapping(value = "/sysArea")
@CheckException(reason = "检查病区操作参数的合法性")
public class SysAreaController {

    @Resource
    private SysAreaService sysAreaService;

    @ApiOperation(value = "根据id查询病区")
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public SysArea get(@PathVariable int id){
        return sysAreaService.get(id);
    }

    @ApiOperation(value = "获取所有病区")
    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<SysArea> getList() {
        return sysAreaService.getList();
    }

}