package com.yltx.async;/*
 * @Title: SyncHelloServlet
 * @Package: com.yltx.async
 * @Description:
 * @author: xiaoyh
 * @date: 2019/9/2 11:59
 * @version: V1.0
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved.
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName : SyncHelloServlet
 * @Description :
 * @Author : xiaoyh
 * @Date : 2019/9/2 11:59
 * @Copyright: 2019 www.chinayltx.com Inc. All rights reserved
 * 注意：本内容仅限于公司内部传阅，禁止外泄以及用于其他商业目的
 **/
@WebServlet("/syncHello")
public class SyncHelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        new LongRunningProcess().run();
        response.getWriter().write("Hello World!");
    }
}
