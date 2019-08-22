package com.how2java.tmall.interceptor;

import com.how2java.tmall.pojo.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       HttpSession session = httpServletRequest.getSession();
       // System.out.println(session);
      // String contextPath = session.getServletContext().getContextPath();
       // System.out.println(contextPath);
       String [] requireAuthPages = new String[]{
               "cards",
               "orders",
               "rooms",
               "typies",
               "customers",
               "admin",

               "admin_type_list",
               "admin_type_edit",
               "admin_room_list",
               "admin_room_edit",
               "admin_orders_list",
               "admin_orders_edit",
               "admin_customer_list",
               "admin_customer_edit",
               "admin_card_list",
               "admin_card_edit"
       };

       String uri = httpServletRequest.getRequestURI();
//        System.out.println(uri);
       uri = StringUtils.remove(uri, "/");
       String page = uri;

//        System.out.println(page);

       if(beginWith(page,requireAuthPages)){
           User user = (User)session.getAttribute("user");
           if(user == null){
               // user 如果为空，跳转到 admin 页面
               httpServletResponse.sendRedirect("login_page");
               return false;
           }
       }

        return true;
    }

    private boolean beginWith(String page, String[] requiredAuthPages){
        boolean result = false;
        for(String requiredAuthPage : requiredAuthPages){
            if(StringUtils.startsWith(page,requiredAuthPage)){
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
