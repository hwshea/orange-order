package com.sfg.orange.order.web.controller;

import com.sfg.orange.common.mvc.core.APIResponse;
import com.sfg.orange.common.util.LogUtils;
import com.sfg.orange.order.facade.IOrderService;
import com.sfg.orange.user.facade.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("order")
@Slf4j
@Api(value = "订单管理", description = "订单管理", tags={"订单操作接口"})
public class OrderController {

    @Autowired
    private IOrderService orderService;

    @Autowired
    private IUserService userService;

    @GetMapping("test")
    @ResponseBody
    @ApiOperation(value = "测试接口", notes = "测试")
    public APIResponse<String> test() {
        System.out.println("+++++++++++++++++");
        orderService.test();

        System.out.println("user system start");
        userService.userTestMethod("say hello");
        System.out.println("user system end");
        APIResponse<String> apiResponse = APIResponse.build();
        apiResponse.setData("SUCCESS");
        return apiResponse;
    }

    @RequestMapping(value = "/sessions", method = RequestMethod.GET)
    public Object sessions (HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("sessionId", request.getSession().getId());
        LogUtils.info(log, "获取SessionID", "session id", request.getSession().getId());
        map.put("message", request.getSession().getAttribute("map"));
        return map;
    }
}
