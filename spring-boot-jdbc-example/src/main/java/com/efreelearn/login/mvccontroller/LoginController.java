package com.efreelearn.login.mvccontroller;

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

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpMethod;
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

import com.efreelearn.model.UserInfo;
import com.efreelearn.vo.QuestionAnswersResponse;
import com.efreelearn.vo.QuestionResponse;
import com.efreelearn.vo.User;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

//1.@EnableAspectJAutoProxy 
//2.@Aspect 
//3.before after around

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
	    final String uri = "https://efreelearn.cfapps.io/validateUser";
	    
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
	    final String url = "https://efreelearn.cfapps.io/validateUserDummy";
	    
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
	@RequestMapping(value = "/validateUserandLoginNew", method = RequestMethod.POST)
    public UserInfo addTodo1(@ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model) {
		
		
		

		//final String url = "https://efreelearn.cfapps.io/addtodorest"

		final String url = "https://efreelearn.cfapps.io/validateUserandLoginRest";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    UserInfo result1 = restTemplate.postForObject(url, user, UserInfo.class);
	    
	    	if(result1!=null)
	    	{
	    
	    		 System.out.println("sss"+result1.getName());
	    
	    System.out.println("ss78979797s"+result1.toString());
	    	}
	    	else
	    	{
	    		 System.out.println("sss ");
	    	}
	    	return result1;
	}
	
	@RequestMapping(value = "/validateUserandLogin", method = RequestMethod.POST)
    public String addTodo(@ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model) {
		
		
		

		//final String url = "https://efreelearn.cfapps.io/addtodorest"

		final String url = "https://efreelearn.cfapps.io/validateUserandLoginRest";
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    UserInfo result1 = restTemplate.postForObject(url, user, UserInfo.class);
	    
	    	if(result1!=null)
	    	{
	    
	    		 System.out.println("sss"+result1.getName());
	    
	    System.out.println("ss78979797s"+result1.toString());
	    	}
	    	else
	    	{
	    		 System.out.println("sss ");
	    	}
	    
	  //  @RequestParam("pk_SchoolId") String fk_schoolid,@RequestParam("classid") String classid
	    
		String url1 = "https://efreelearn.cfapps.io/findAllQuesAansbySchoolIDClassID?pk_SchoolId="+result1.getFk_school_id()+"&classid="+result1.getClassid();
		 restTemplate = new RestTemplate();
		 

		 
		 
		 //findAllQuesAansbySchoolIDSubjecIDClassID(String pk_SubjectId,String fk_SchoolId,String classid) {

		 QuestionAnswersResponse[] qa=restTemplate.getForObject(url1, QuestionAnswersResponse[].class);
		System.out.println("I AM SOP qqq 111"+qa.length);
		//QuestionResponse q= qa[0].getQuestion();
		//System.out.println("I AM SOP aaaa 111"+q.getQuestionName());
		model.put("allquestionAnswers", qa);
	   

		return "onlineExam";
	
		
	}

	
	@RequestMapping(value ="validateUserandLoginold", method = RequestMethod.POST)	
	public String validateUserandLogin(@ModelAttribute("user")User user, 
		      BindingResult result, ModelMap model)	
	
	{
		final String url = "https://efreelearn.cfapps.io/validateUser";		
	    
	    RestTemplate restTemplate = new RestTemplate();
	    
	    log.info("model employee"+user.toString());
		//System.out.println("model "+model.);
		

		String userName = (String) user.getUsername();
		String password = (String) user.getPassword();
		System.out.println(""+userName);
		System.out.println("password"+password);
		//model.getClass().getClasses().length();
		log.error("model employee"+user.toString());

		
		
		String url1 = "https://efreelearn.cfapps.io/findAllQuesAansbySchoolIDSubjecIDClassID?";
		url1 = url1+"pk_SubjectId={pk_SubjectId}&";
		url1 = url1+"fk_SchoolId={fk_SchoolId}&";
		url1 = url1+"classid={classid}";
		
		restTemplate = new RestTemplate();
		
		Map<String, String> map = new HashMap<String, String>();
		//m.put(key, value)
		map.put("userName", userName);
		map.put("password", password);	
		
		try
		{
		
		//URI u =restTemplate.postForLocation(url, HttpMethod.POST, map);
		//System.out.println("getUserInfo()"+u.getUserInfo());
		
		HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, String> bodyMap = new LinkedMultiValueMap<>();
		bodyMap.add("userName", userName);
		bodyMap.add("password", password);	
	    HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(bodyMap, headers);
	    String result1 = restTemplate.postForObject(url, requestEntity, String.class);
	    
	    System.out.println("result1 aaaaa"+result1);
		}
		catch(Exception e)
		{
			System.out.println("getUserInfo()"+e.getStackTrace()+""+e.getMessage());
		}
				

	
		
			


		


 
		
		// String url1 = "https://efreelearn.cfapps.io/findAllQuesAansbySchoolIDSubjecIDClassID";
		//String url1 = "https://efreelearn.cfapps.io/findAllQuestionwithAnswerforAll";
		url1 = "https://efreelearn.cfapps.io/findAllQuestionwithAnswerforAll";
		 restTemplate = new RestTemplate();
		 
		 restTemplate = new RestTemplate();
		 
		 
		 //findAllQuesAansbySchoolIDSubjecIDClassID(String pk_SubjectId,String fk_SchoolId,String classid) {

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