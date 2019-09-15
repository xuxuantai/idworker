package com.nju.idworker;

import com.nju.idworker.util.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IdworkerApplicationTests {

    @Test
    public void testGenerateId() {

        /**
         * 测试生成固定个Id需要多长时间
         */
        IdWorker idWorker = new IdWorker(2, 3);
        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            System.out.println(idWorker.nextId());
        }
        System.out.println("生成10000个全局唯一Id耗时" + (System.nanoTime() - startTime) / 1000000 + "ms");



//        /**
//         * 测试每1秒生成多少个全局唯一Id
//         */
//        IdWorker idWorker = new IdWorker(2, 3);
//        long startTime = System.nanoTime();
//        for(int i = 0; i >= 0; i++){
//            if(System.nanoTime() - startTime >= 1000000000){
//                System.out.println("1s内生成了" + i + "个全局唯一Id");
//                break;
//            }
//            System.out.println(idWorker.nextId());
////            idService.getId();

//        }

    }

}
