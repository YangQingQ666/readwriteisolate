package cn.mpy.plustest;

import cn.mpy.plustest.entity.User;
import cn.mpy.plustest.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class PlustestApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    void findList() {
        //查询
        List<User> users = this.userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    @Test
    public void insert(){
        User user=new User();
        user.setName("smith");
        user.setAge(30);
        user.setEmail("2423615474@qq.com");
        int insert = userMapper.insert(user);
        System.out.println(insert);
        //User(id=1411878597148254209, name=smith, age=20, email=2423615474@qq.com)
        //会自动生成全局唯一的编号
        System.out.println(user);
    }

    @Test
    public void update(){
        User user=new User();
        user.setId(1411898870274703361l);
        user.setName("smith11");
        user.setAge(38);
        user.setEmail("242361547411@qq.com");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }
    //测试乐观锁
    @Test
    public void testOptimisticLocker(){
        User user = userMapper.selectById(1);
        user.setName("locker");
        user.setAge(80);
        user.setEmail("8754242424@qq.com");
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    // 测试乐观锁失败！多线程下 只会有一个是成功执行的，避免修改失败可以使用队列来操作，保证了顺序
    @Test
    public void testOptimisticLocker2(){
        // 线程 1
        User user = userMapper.selectById(1L);
        user.setName("kwhua111");
        user.setEmail("123456@qq.com");
        // 模拟另外一个线程执行了插队操作
        User user2 = userMapper.selectById(1L);
        user2.setName("kwhua222");
        user2.setEmail("123456@qq.com");
        int i = userMapper.updateById(user2);
        // 自旋锁来多次尝试提交！
        int j=userMapper.updateById(user); // 如果没有乐观锁就会覆盖插队线程的值！
        System.out.println(i+"  "+j);
    }
@Test
public void delete(){
//    int i = userMapper.deleteById(1l);
    int i = userMapper.deleteBatchIds(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(i);
}
    @Test
    public void select(){
        //查询单个
//        User user = userMapper.selectById(1l);
//        System.out.println(user);
        //多编号查询
//        List<User> users = userMapper.selectBatchIds(Arrays.asList(1l, 2l, 3l));
//        users.forEach(System.out::print);
        //map查询
//        Map<String,Object> map=new HashMap<>();
//        map.put("name","smith");
//        map.put("age",30);
//        List<User> users = userMapper.selectByMap(map);
//        users.forEach(System.out::println);
        //分页查询 PLUS 3.1以后删除不用配置插件
//        Page<User> page=new Page<>(2,5);
//        Page<User> page1 = userMapper.selectPage(page, null);
//        page1.getRecords().forEach(System.out::println);
//        System.out.println(page1.getTotal());\
        //条件构造器
        QueryWrapper<User> wapper = new QueryWrapper<>();
//        wapper.isNull("gmt_create")
//                .isNotNull("age");
//        wapper.like("name","s");
        wapper.eq("name","jon");
        User user = userMapper.selectOne(wapper);
        System.out.println(user);
        User user1 = userMapper.selectById(1l);
        System.out.println(user1);
//        List<User> users = userMapper.selectList(wapper);
//        users.forEach(System.out::println);
    }


}
