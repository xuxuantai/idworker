package com.nju.idworker;

import com.nju.idworker.service.IdService;
import com.nju.idworker.util.IdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IdworkerApplicationTests {
    @Autowired
    private IdService idService;
    @Test
    public void testGenerateId() {

        while(true){
            /**
             * 测试生成固定个Id需要多长时间
             */
            long startTime = System.nanoTime();
            for (int i = 0; i < 10000; i++) {
//            System.out.println(idService.getId());
                idService.getId();
            }
            long endTime = System.nanoTime();
            System.out.println("生成10000个全局唯一Id耗时" + (endTime - startTime) + "ms");
        }



        /**
         * 测试每1秒生成多少个全局唯一Id
         */
//        long startTime = System.nanoTime();
//        for(int i = 0; i >= 0; i++){
//            long curTime = System.nanoTime();
//            if(curTime - startTime >= 1000000000){
//                System.out.println("1s内生成了" + i + "个全局唯一Id");
//                break;
//            }
//            idService.getId();
//        }

    }

}
