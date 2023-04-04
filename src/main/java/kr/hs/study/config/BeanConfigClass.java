package kr.hs.study.config;

import kr.hs.study.beans.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigClass {

     @Bean
     public TestBean1 java1() {
        TestBean1 t1 = new TestBean1();
        t1.setN(1);
        return t1;
     }

    @Bean
    public TestBean1 java2() {
        TestBean1 t2 = new TestBean1();
        t2.setN(2);
        return t2;
    }

    @Bean
    public TestBean1 java3() {
        TestBean1 t3 = new TestBean1();
        t3.setN(5);
        t3.setC('o');
        return t3;
    }

    @Bean
    public TestBean1 java4() {
        TestBean1 t4 = new TestBean1();
        t4.setN(2);
        return t4;
    }
}
