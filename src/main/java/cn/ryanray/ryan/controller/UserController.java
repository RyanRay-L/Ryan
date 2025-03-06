package cn.ryanray.ryan.controller;

import cn.ryanray.ryan.dao.po.User;
import cn.ryanray.ryan.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("获取所有用户信息")
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @ApiOperation("创建用户")
    @PostMapping(value = "/createUser")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @ApiOperation("根据id获取用户信息")
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @ApiOperation("根据id删除用户信息")
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }

    @ApiOperation("通过邮箱获取所有用户信息")
    @GetMapping("/email/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }
}