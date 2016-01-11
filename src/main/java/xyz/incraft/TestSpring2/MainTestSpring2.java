package xyz.incraft.TestSpring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xyz.incraft.TestSpring2.model.BLTest;

/**
 * Created by Михаил on 10.01.2016.
 *
 */
public class MainTestSpring2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        BLTest blt = (BLTest) context.getBean("bltest");
        blt.ShowList();
    }
}
