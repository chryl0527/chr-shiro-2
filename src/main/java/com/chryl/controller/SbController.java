package com.chryl.controller;

import org.springframework.web.bind.annotation.*;

/**
 * Created By Chr on 2019/7/23.
 */
@RestController
@RequestMapping("/sb")
public class SbController {

    @PostMapping("/query")
    public Object query() {

        return "sb查询";
    }

    @PostMapping("/delete")
    public Object delete() {

        return "sb删除";
    }

    @PostMapping("/insert")
    public Object insert() {

        return "sb增加设备";
    }

    @PostMapping("/update")
    public Object update() {

        return "sb修改";
    }
    @GetMapping("/error")
    public Object error() {

        return "sb无权访问";
    }

}
