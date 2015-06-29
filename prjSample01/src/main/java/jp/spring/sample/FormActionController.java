package jp.spring.sample;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.spring.model.Member;

import org.junit.runner.Request;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormActionController {

	@RequestMapping("/formSample01")
	public void formSample(HttpServletRequest request) {

	} 
//	@RequestMapping("/formAction")
//	public void formAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		//request.getParameter("id");
//		System.out.println("id :" + request.getParameter("id"));
////		PrintWriter out = response.getWriter();
////		out.print("id: " + request.getParameter("id"));
//	} 
	
	/**
	 * @param request
	 * @param response
	 * @return
	 * @throws IOException
	 */
	@RequestMapping("/formAction")
	public String formAction(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("id");
		System.out.println(id);
		
		request.setAttribute("id", id);
		request.setAttribute("id2", id);
		return "formAction02";
	} 
	
	
	@RequestMapping("/formActionAnno01")
	public String formActionAnno(@RequestParam("id")String id, @RequestParam("name")String name, @RequestParam("address")String address) {
		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("address : " + address);
		return "formAction";
	}
	@RequestMapping("/formActionAnno02")
	public String formActionAnno02(@RequestParam Map<String, String> params) {
		
		//System.out.println(params.entrySet()); 
		//System.out.println("toString() : "+ params.toString());
		Set<Entry<String,String>> set= params.entrySet();
		
//		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
//			Entry<String,String> entry = (Entry<String,String>)iterator.next();
//			System.out.println(entry.getValue());
//		}
		
		for (Entry<String,String> entry : set) {
			System.out.println(entry.getValue() +"!!");
		}
		return "formAction";
	}
	
	
	@RequestMapping("/formActionModel")
	public String formActionmodel(@ModelAttribute Member member, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Binging Failed");
			return "formSample01";
		}else {
			System.out.println(member.getId());
			System.out.println(member.getName());
			System.out.println(member.getAddress());
			return "formAction";
		}
	}
	
	@RequestMapping("/formActionModel2")
	public String formActionmodel2(@RequestParam("id")String id, Model model, HttpServletRequest request){
		model.addAttribute("id1", id);
		request.setAttribute("id2", id);
		return "formAction02"; 
	}
	
	//自分自身のページ？
	@RequestMapping("/formActionModelAndView")
	public ModelAndView formActionmodelAndView(@RequestParam("id") String id){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", id);
		return modelAndView;
	}
	@RequestMapping("/formActionBody")
	public void formActionBody(@RequestBody String body, 
							   @RequestHeader(value="Accept-Language", required=false, defaultValue="jp") String header){
		System.out.println("requestBody : "+ body);
		System.out.println("requestHeader : "+ header);
		String str[]=body.split("&");
		for (String string : str) {
			System.out.println(string);
			
		}
	}
//	@RequestMapping("/formActionHeader")
//	public void formActionHeader(@RequestHeader String Header){
//		
//	}
}
