package cn.ksdshpx.springmvc.views;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

/**
 * @author peng.x
 * @date 2019年1月22日 上午11:06:04
  * 自定义视图解析器
 */
@Component
public class HelloView implements View {

	@Override
	public String getContentType() {
		return "text/html";
	}

	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		response.getWriter().print("hello view,time:"+new Date());
	}

}
