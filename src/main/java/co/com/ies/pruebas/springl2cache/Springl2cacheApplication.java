package co.com.ies.pruebas.springl2cache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.cache.RedisCacheManager;

@SpringBootApplication
@EnableCaching
public class Springl2cacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springl2cacheApplication.class, args);
	}



}
