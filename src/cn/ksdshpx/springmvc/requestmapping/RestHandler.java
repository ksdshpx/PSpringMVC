package cn.ksdshpx.springmvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author peng.x
 * @date 2018年10月31日 下午2:33:22
 */
@Controller
public class RestHandler {
	@RequestMapping(value = "/order/{id}", method = RequestMethod.GET)
	public String testRestGet(@PathVariable("id") Integer id) {
		System.out.println("REST GET:" + id);
		return "success";
	}

	@RequestMapping(value = "/order/{id}", method = RequestMethod.DELETE)
	@ResponseBody
	public String testRestDelete(@PathVariable("id") Integer id) {
		System.out.println("REST DELETE:" + id);
		return "success";
	}

	@RequestMapping(value = "/order", method = RequestMethod.PUT)
	@ResponseBody
	public String testRestPut() {
		System.out.println("REST PUT");
		return "success";
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public String testRestPost() {
		System.out.println("REST POST");
		return "success";
	}

	/**
	 * @RequestParam 映射请求参数到请求方法的形参中
	 * 		1.如果请求参数与形参名一致，则可以省略@RequestParam的指定
	 * 		2.@RequestParam注解标注的形参必须要赋值。必须要能从请求对象中获取到对应的请求参数。
	 * 		  可以通过required类设置不是必须的
	 * 		3.可以使用defaultValue来指定一个默认值取代null
	 * 客户端请求：testRequestParam?username=zhangSan&age=88
	 */
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam("username") String username, @RequestParam(value="age",required=false,defaultValue="0") Integer age) {
		System.out.println(username + "---" + age);
		return "success";
	}
}
