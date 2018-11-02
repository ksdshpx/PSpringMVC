package cn.ksdshpx.springmvc.requestmapping;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.ksdshpx.springmvc.beans.User;

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
	 * @RequestParam 映射请求参数到请求方法的形参中 1.如果请求参数与形参名一致，则可以省略@RequestParam的指定
	 *               2.@RequestParam注解标注的形参必须要赋值。必须要能从请求对象中获取到对应的请求参数。
	 *               可以通过required类设置不是必须的 3.可以使用defaultValue来指定一个默认值取代null
	 *               客户端请求：testRequestParam?username=zhangSan&age=88
	 */
	@RequestMapping("/testRequestParam")
	public String testRequestParam(@RequestParam("username") String username,
			@RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {
		System.out.println(username + "---" + age);
		return "success";
	}

	/**
	 * @RequestHeader 映射请求头信息到请求方法的形参中
	 */
	@RequestMapping("/testRequestHeader")
	public String testRequestHeader(@RequestHeader("Accept-Language") String acceptLanguage) {
		System.out.println("acceptLanguage:" + acceptLanguage);
		return "success";
	}

	/**
	 * @CookieValue 映射Cookie信息到请求方法的形参中
	 */
	@RequestMapping("/testCookieValue")
	public String testCookieValue(@CookieValue("JSESSIONID") String sessionId) {
		System.out.println("seesionId:" + sessionId);
		return "success";
	}

	/**
	 * 使用Pojo对象映射请求参数
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping("/testPojo")
	public String testPojo(User user) {
		System.out.println("user:" + user);
		return "success";
	}

	/**
	 * 使用原生的Servlet API
	 * 
	 * @throws IOException
	 */
	@RequestMapping("/testServletAPI")
	public void testServletAPI(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println(request);
		System.out.println(response);
		response.getWriter().write("使用原生的ServletAPI");
	}

	/**
	 * 测试ModelAndView SpringMVC会把ModelAndView中模型数据存放到request域中
	 * 
	 * @return
	 */
	@RequestMapping("/testModelAndView")
	public ModelAndView testModelAndView() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("username", "admin");
		mav.setViewName("success");
		return mav;
	}

	/**
	 * 测试Map
	 * SpringMVC会把Map中模型数据存放到request域中
	 * SpringMVC调用请求处理方法后，无论方法返回什么类型，都要将其封装成一个ModelAndView类型
	 * @return
	 */
	@RequestMapping("/testMap")
	public String testMap(Map<String,Object> map) {
		System.out.println(map.getClass().getName());
		map.put("password", "123456");
		return "success";
	}
	
	/**
	 * 测试Model
	 * SpringMVC会把Model中模型数据存放到request域中
	 * SpringMVC调用请求处理方法后，无论方法返回什么类型，都要将其封装成一个ModelAndView类型
	 * @return
	 */
	@RequestMapping("/testModel")
	public String testModel(Model model) {
		model.addAttribute("errorMsg", "用户名或密码错误");
		return "success";
	}
}
