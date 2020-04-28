package com.xxx.springcloud.api;

import com.xxx.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author JN
 * @Date 2020/4/28 16:47
 * @Version 1.0
 * @Description
 *  如果需要使用feign，就必须存在一个service接口(一定是service层，不能是其他层，因为只有service才会控制事务，feign的使用最大特点就是AOP)
 *  所有的Service接口中，都必须把抽象方法标注上@RequestMapping("")-->里面的值必须要和生产者项目中的controller的requestMapping向对相应
 *  在IUserService类上添加@FeignClient注解，把整个接口标识为feign的客户端
 *  @FeignClient(value = "")--->value值指向的就是生产者的application.name值
 **/
@FeignClient(value = "user-provider", fallbackFactory = com.xxx.springcloud.api.UserFallBackFactory.class)
public interface IUserService {

    @RequestMapping("/userAll")
    List<User> selectAllUsers();

    @RequestMapping("/userOne")
    User selectOne();
}
