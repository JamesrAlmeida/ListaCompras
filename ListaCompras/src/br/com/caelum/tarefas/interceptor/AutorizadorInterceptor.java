//package br.com.caelum.tarefas.interceptor;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.HandlerInterceptor;
//import org.springframework.web.servlet.ModelAndView;
//
//public class AutorizadorInterceptor implements HandlerInterceptor {
//
//	@Override
//	public void afterCompletion(HttpServletRequest arg0,
//			HttpServletResponse arg1, Object arg2, Exception arg3)
//			throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
//			Object arg2, ModelAndView arg3) throws Exception {
//		// TODO Auto-generated method stub
//
//	}
//
//	@Override
//	public boolean preHandle(HttpServletRequest req, HttpServletResponse res,
//			Object controller) throws Exception {
//		// TODO Auto-generated method stub
//		
//		String uri = req.getRequestURI();
//		if(uri.endsWith("loginForm") || uri.contains("resources")){
//			return true;
//		}
//		res.sendRedirect("loginForm");
//		return false;
//	}
//
//}
