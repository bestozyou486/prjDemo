package jp.spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ranger")
public class RangerController {

	@RequestMapping("/riyoukiyaku14")
	public void riyoukiyaku14(){
		System.out.println("利用規約");
	}
	@RequestMapping("/info15")
	public void info15(){
		System.out.println("取得情報画面");
	}
	@RequestMapping("/phase11")
	public void phase11(){
		System.out.println("紹介画面仕様");
	}
	@RequestMapping("/content18")
	public void content18(){
		System.out.println("問い合わせ");
	}
}
 