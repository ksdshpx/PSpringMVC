package cn.ksdshpx.springmvc.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author peng.x
 * @date 2018年10月28日 下午4:35:54
  * 请求处理器
 */
@Controller
public class SpringMVCHandler {

	/**
	 * @RequestMapping:对请求与请求处理方法进行映射
	 * @return
	 */
	@RequestMapping("hello")
	public String handleHello() {
		System.out.println("Hello SpringMVC!");
		return "success";//通过视图解析器返回具体的视图，并转发到该视图
	}
}
