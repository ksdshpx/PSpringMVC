package cn.ksdshpx.springmvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author peng.x
 * @date 2018年10月30日 上午11:12:31
 */
@Controller
@RequestMapping("/springmvc")
public class TestRequestMappingHandler {
	@RequestMapping("/testRequestMapping")
	public String requestMapping() {
		return "success";
	}

	/**
	 * 映射请求方式
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testRequestMappingMethod", method = { RequestMethod.POST, RequestMethod.GET })
	public String requestMappingMethod() {
		return "success";
	}

	/**
	 * 映射请求参数和请求头
	 * 
	 * @return
	 */
	@RequestMapping(value = "/testRequestMappingParamsAndHeaders", params = { "username", "age=25" }, headers = {
			"Accept-Language" })
	public String requestMappingParamsAndHeaders() {
		return "success";
	}

	/**
	 * 带占位符的URL(REST风格)
	 * @param name
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/testPathVariable/{name}/{id}")
	public String testPathVariable(@PathVariable("name") String name, @PathVariable("id") Integer id) {
		System.out.println(name + ":" + id);
		return "success";
	}
}
