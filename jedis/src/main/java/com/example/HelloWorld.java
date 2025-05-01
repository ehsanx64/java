package com.example;

import redis.clients.jedis.*;

public class HelloWorld {
    private JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
    
    private void test() {
        try {
            Jedis jedis = pool.getResource();
            jedis.set("MSG", "Hello World");
            String result = jedis.get("MSG");
            System.out.println(" MSG : " + result);
            pool.returnResource(jedis);
        }
        catch (Exception e) {
            System.out.println("FUCK!!!");
            System.err.println(e.toString());
        } finally {
            pool.destroy();
        }
    }

    public static void main(String[] args) {
        // Simple message printing
        System.out.println("Hello from Simple Jedis Demo!");
        
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.test();
    }
}
