package web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo02",loadOnStartup = 1)
public class ServletDemo02 implements Servlet {


    /*初始化方法
        时机：第一次被访问时
        调用次数：1次
     */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init..");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
    每次访问时都会调用
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        System.out.println("Servlet hello world");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /*
    调用时机：内存释放或者服务器关闭时，Servlet对象会被销毁，调用
     */
    @Override
    public void destroy() {

        System.out.println("destroy..");
    }
}
