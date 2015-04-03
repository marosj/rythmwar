package com.marosj.servlet;

import org.rythmengine.Rythm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

@WebServlet(urlPatterns = "/display")
public class DisplayServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init();
        Map<String, Object> conf = new HashMap<String, Object>();
        conf.put("rythm.engine.mode", "dev");
        Rythm.init(conf);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter out = response.getWriter();

        Path mainTemplate = Paths.get("c:/tmp/main.rtm");

        out.println(Rythm.render(mainTemplate.toFile(), "World"));

        out.close();
    }
}
