package cn.jeremy.study.springmvc.demo.api;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

public class MyWebApplicationInitializer implements WebApplicationInitializer
{
    @Override
    public void onStartup(ServletContext servletContext)
        throws ServletException
    {
        AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
        ac.register(AppConfig.class);
        ac.refresh();
        DispatcherServlet ds = new DispatcherServlet(ac);
        Dynamic registration = servletContext.addServlet("app", ds);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
