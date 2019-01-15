package packageone;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

public class TestNing {
    @Test
    public void test1() {
        // 连接Redis 服务
        Jedis jedis = new Jedis("95.179.130.111", Integer.parseInt("6379"));

        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());

        jedis.select(4);

        jedis.set("1", "Test1");
        jedis.set("2", "Test2");
        jedis.set("3", "Test3");
        jedis.set("4", "Test4");
        jedis.set("5", "Test5");
        jedis.set("6", "Test6");

        System.out.println("redis 存储的字符串为: "+ jedis.get("1"));
        System.out.println("redis 存储的字符串为: "+ jedis.get("2"));
        System.out.println("redis 存储的字符串为: "+ jedis.get("3"));
        System.out.println("redis 存储的字符串为: "+ jedis.get("4"));
        System.out.println("redis 存储的字符串为: "+ jedis.get("5"));
        System.out.println("redis 存储的字符串为: "+ jedis.get("6"));
    }
}
