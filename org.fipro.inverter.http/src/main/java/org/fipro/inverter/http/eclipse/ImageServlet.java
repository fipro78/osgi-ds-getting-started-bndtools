package org.fipro.inverter.http.eclipse;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

@Component(
    service=Servlet.class,
    property= {
        "osgi.http.whiteboard.servlet.pattern=/image",
        "osgi.http.whiteboard.context.select=(osgi.http.whiteboard.context.name=eclipse)"
    },
    scope=ServiceScope.PROTOTYPE)
public class ImageServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");
        resp.getWriter().write("Show an image from www.eclipse.org");
        resp.getWriter().write(
            "<p><img src='img/nattable/images/FeatureScreenShot.png'/></p>");
    }

}