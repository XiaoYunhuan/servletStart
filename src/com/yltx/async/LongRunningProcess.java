package com.yltx.async;
/*
 * @Title: LongRunningProcess
 * @Package: com.yltx.async
 * @Description:
 * @author: xiaoyh
 * @date: 2019/9/2 12:10
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */


import java.util.concurrent.ThreadLocalRandom;

/**
 * @ClassName : LongRunningProcess
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/9/2 12:10
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
public class LongRunningProcess {
    public void run() {
        try {
            int millis = ThreadLocalRandom.current().nextInt(2000);
            String currentThread = Thread.currentThread().getName();
            System.out.println(currentThread + " sleep for " + millis + " milliseconds.");
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
