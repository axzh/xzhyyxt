package cn.yy.utils;

import cn.yy.pojo.YYException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class YYHandlerException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView mv = new ModelAndView();
        RuntimeException exp = null;
        if (ex instanceof YYException) {
            mv.addObject("expInfo", ex.getMessage());
        } else {
            mv.addObject("expInfo", "请与管理员联系");
        }
        mv.setViewName("prompt");
        return mv;
    }
}
