package com.juzuan.advertiser;

import com.juzuan.advertiser.rpts.service.impl.CreativeRptsDaygetServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvertiserApplicationTests {


    @Test
    public void test() {

    }
    public static void main(String[] args) {
        SpringApplication.run(CreativeRptsDaygetServiceImpl.class, args);
    }
}
