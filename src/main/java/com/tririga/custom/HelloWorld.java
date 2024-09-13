package com.tririga.custom;

import com.tririga.pub.adapter.IConnect;

import com.tririga.ws.TririgaWS;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorld implements IConnect {

    public void execute(TririgaWS tririga, HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello");
    }

}
