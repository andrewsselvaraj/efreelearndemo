package com.efreelearn.mvccontroller;

import java.net.URI;
import java.security.Principal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.efreelearn.vo.QuestionAnswersResponse;
import com.efreelearn.vo.QuestionResponse;
import com.efreelearn.vo.User;



@Controller
@EnableAspectJAutoProxy  
public class LoginController {
	
	 private final Logger log = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/loginNew2")
	public String home(Map<String, Object> model) {
		model.put("message", "HowToDoInJava Reader !!");
		return "index";
	}
	@RequestMapping(value = "/user")
	   public Principal user(Principal principal) {
	      return principal;
	   }
	
	@RequestMapping("/reports")
	public String next(Map<String, Object> model) {
		model.put("message", "You are in new page !!");
		return "index2";
	}
	
	

	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/loginValidateUser", method =  RequestMethod.POST)
	private String validateUser(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
		log.info("ANDREW ERROR");
		System.out.println("ANDREW ERROR SOP");
		log.trace("A TRACE Message");
		log.debug("A DEBUG Message");
		log.info("An INFO Message");
		log.warn("A WARN Message");
		log.error("An ERROR Message");
	    final String uri = "https://spring-jdbc.cfapps.io/validateUser";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> vars = new HashMap<String, String>();
	    vars.put("userName", userName);
	    vars.put("password", password);
	   
	    
	   
	    
	    return "allquestionAnswers";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*") 
	@RequestMapping(value = "/validateUserPostforObjectNew1", method =  RequestMethod.GET)
	private String validateUserPostforObject(@RequestParam("userName") String userName,@RequestParam("password") String password)
	{
	    final String url = "https://spring-jdbc.cfapps.io/validateUserDummy";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    Map<String, String> uriVariables = new HashMap<String, String>();
	    uriVariables.put("userName", userName);
	    uriVariables.put("password", password);
	   // URI result = restTemplate.postForLocation(uri, String.class, vars);
	    String result = restTemplate.getForObject(url, String.class, uriVariables);
	  //  restTemplate.postForObject(url, request, responseType, uriVariables)
	 
	    
	    //System.out.println(result.getRawQuery());
	    return "index";
	}
	
	@RequestMapping(value ="validateUserandLogin", method = RequestMethod.POST)	
	public String validateUserandLogin(@ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model)	
	
	{
		final String url = "https://spring-jdbc.cfapps.io/loginUser";		
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    log.info("model employee"+user.toString());
		//System.out.println("model "+model.);
		

		String userName = (String) user.getUsername();
		String password = (String) user.getPassword();
		System.out.println(""+userName);
		System.out.println("password"+password);
		//model.getClass().getClasses().length();
		log.error("model employee"+user.toString());
		
		 String url1 = "https://spring-jdbc.cfapps.io/findAllQuestionwithAnswerforAll";
		 restTemplate = new RestTemplate();


		QuestionAnswersResponse[] qa=restTemplate.getForObject(url1, QuestionAnswersResponse[].class);
		System.out.println("I AM SOP qqq 111"+qa.length);
		QuestionResponse q= qa[0].getQuestion();
		System.out.println("I AM SOP aaaa 111"+q.getQuestionName());
		model.put("allquestionAnswers", qa);
	   

		return "onlineExam";
	}

	
	
	

	public String initiateLogin(Model model)	
	{	
		System.out.println("model "+model.toString());
		//System.out.println("model "+model.);
		Map<String, Object> s= model.asMap();
		String userName = s.get("userName").toString();
		String password = s.get("password").toString();
		System.out.println("userName"+userName);
		System.out.println("password"+password);
		//model.getClass().getClasses().length();
		return "login";
	}
	
	@RequestMapping(value = "session", method =  RequestMethod.GET)
	public String home(Model model, HttpSession session) {
		@SuppressWarnings("unchecked")
		List<String> messages = (List<String>) session.getAttribute("MY_SESSION_MESSAGES");

		if (messages == null) {
			messages = new ArrayList<>();
		}
		model.addAttribute("sessionMessages", messages);

		return "index";
	}

 
	@RequestMapping(value = "persistMessage", method =  RequestMethod.GET)
	public String persistMessage(@RequestParam("msg") String msg, HttpServletRequest request) {
		@SuppressWarnings("unchecked")
		List<String> msgs = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (msgs == null) {
			msgs = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
		}
		msgs.add(msg);
		request.getSession().setAttribute("MY_SESSION_MESSAGES", msgs);
		return "redirect:/";
	}
 
	@RequestMapping(value = "destroy", method =  RequestMethod.GET)
	public String destroySession(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/";
	}

 

	
}