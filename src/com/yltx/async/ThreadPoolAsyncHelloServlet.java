package com.yltx.async;/*
 * @Title: ThreadPoolAsyncHelloServlet
 * @Package: com.yltx.async
 * @Description:
 * @author: xiaoyh
 * @date: 2019/9/2 12:51
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * @ClassName : ThreadPoolAsyncHelloServlet
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/9/2 12:51
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/

@WebServlet(value = "/threadPoolAsync", asyncSupported = true)
public class ThreadPoolAsyncHelloServlet extends HttpServlet {

    private static ThreadPoolExecutor executor = new ThreadPoolExecutor(100, 200, 50000L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<>(100));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        AsyncContext asyncContext = request.startAsync();

        executor.execute(() -> {

            new LongRunningProcess().run();

            try {
                asyncContext.getResponse().getWriter().write("Hello World!");
            } catch (IOException e) {
                e.printStackTrace();
            }

            asyncContext.complete();

        });
    }

}
