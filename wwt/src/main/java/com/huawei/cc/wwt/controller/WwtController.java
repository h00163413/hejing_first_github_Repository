package com.huawei.cc.wwt.controller;

import com.huawei.cc.wwt.searchpath.SearchPath;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/9/2.
 */
@Component
@RestController
public class WwtController {
    @GetMapping("/")
    public String RootUrl(){
        SearchPath searchPath = new SearchPath();


        searchPath.dfs(0,0);
        return "hejing sprin";
    }
}
