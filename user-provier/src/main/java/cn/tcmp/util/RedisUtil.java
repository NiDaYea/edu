package cn.tcmp.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisUtil {

    @Autowired
    private RedisTemplate<String ,Object> redisTemplate;


    //保存
    public void set(String key,Object value,Integer timeOut){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        vo.set(key,value);
        redisTemplate.expire(key,timeOut,TimeUnit.SECONDS);
    }

    //获取
    public Object get(String key){
        ValueOperations<String,Object> vo=redisTemplate.opsForValue();
        return vo.get(key);
    }
    //删除
    public void delete(String key){
        redisTemplate.delete(key);
    }
}
