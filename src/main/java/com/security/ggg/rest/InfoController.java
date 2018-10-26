package com.security.ggg.rest;

import com.security.ggg.common.RestResp;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gaoyp
 * @create 2018/10/26  18:02
 **/
@RestController
public class InfoController {

    @GetMapping(value = "/info")
    public RestResp welcome(){
        return RestResp.success("welcome to the demo app");
    }


}
