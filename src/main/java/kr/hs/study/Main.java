package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.config.BeanConfigClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
        TestBean1 obj1 = ctx.getBean("java1", TestBean1.class);
        TestBean1 obj2 = ctx.getBean("java2", TestBean1.class);
        int sum = 0;
        for(int i=obj1.getN(); i<=obj2.getM(); i++) {
            sum+=i;
        }
        System.out.println("n부터 m까지의 합: "+sum+"\n");

        TestBean1 obj3 = ctx.getBean("java3", TestBean1.class);
        if(obj3.getC() == 'o') {
            for(int i=1; i<=obj3.getN(); i++) {
                if(i%2!=0) System.out.println(i);   // 홀수 출력
            }
        }else if(obj3.getN() == 'e') {
            for(int i=1; i<=obj3.getN(); i++) {
                if(i%2==0) System.out.println(i);   // 짝수 출력
            }
        }

        System.out.println("\n");
        TestBean1 obj4 = ctx.getBean("java4", TestBean1.class);
        while(true) {
            if(obj4.getN()==0) {
                System.out.println("프로그램 종료");
                break;
            }
            else
                if(obj4.getN()==1) {
                System.out.println("원의 넓이: "+obj4.getN()*obj4.getN()*3.14+"\n원의 둘레: "+obj4.getN()*2*3.14);
                break;
            }
            else
                if(obj4.getN()==2) {
                System.out.println("정사각형의 넓이: "+obj4.getN()*obj4.getN());
                break;
            }
        }
        ctx.close();
    }
}