package cn.ksdshpx.springmvc.requestmapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
