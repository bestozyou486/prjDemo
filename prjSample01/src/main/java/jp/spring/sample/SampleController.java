package jp.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class SampleController {
	
	@RequestMapping("/demo01")
	public void demo01() {
		System.out.println("demo01");
	}
	
}
