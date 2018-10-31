package cn.ksdshpx.springmvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
}
