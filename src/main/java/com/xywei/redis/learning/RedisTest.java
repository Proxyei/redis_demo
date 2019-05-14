package com.xywei.redis.learning;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

public class RedisTest {

	private String ip = "192.168.36.130";
	private int port = 6379;

	Jedis jedis = null;

	private Jedis getJedis() {

		jedis = new Jedis(ip, port);

		return jedis;

	}

	private void closeRedis(Jedis jedis) {
		if (jedis != null) {
			jedis.close();

		}
	}

	/**
	 * 测试联通ping
	 * 
	 */
	@Test
	public void testPing() {
		jedis = getJedis();
		System.out.println(jedis.ping());
		closeRedis(jedis);

	}

}
