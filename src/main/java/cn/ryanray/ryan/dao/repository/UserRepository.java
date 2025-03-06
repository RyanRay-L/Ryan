package cn.ryanray.ryan.dao.repository;

import cn.ryanray.ryan.dao.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    // 可以根据需要定义自定义查询方法
    User findByEmail(String email);
}
