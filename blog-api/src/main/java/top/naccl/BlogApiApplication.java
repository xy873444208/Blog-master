package top.naccl;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.naccl.mapper")
public class BlogApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApiApplication.class, args);
	}

}
