package jp.prjdemo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	@RequestMapping(value = "/demo01")
	public String demo01(HttpServletRequest request,HttpServletResponse response) throws IOException {
//		PrintWriter out = response.getWriter();
//		out.println("demo01controller");
		System.out.println("demo01controller");
		return "demo01";
	}
	
}
