package com.codesample.controllers.admin;

import com.codesample.entities.Admin;
import com.codesample.services.*;
import com.sun.net.httpserver.HttpContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class HomeAdminController {

	@Autowired
	private ITheoryService theoryService;

	@Autowired
	private ISubjectService subjectService;

	@Autowired
	private IUserService userService;

	@Autowired
	private IExerciseService exerciseService;

	@Autowired
	private IAdminService adminService;

	@Autowired
	IMD5Service md5;

	@RequestMapping(value = "/admin/trang-chu/", method = RequestMethod.GET)
	public ModelAndView homePage(HttpSession session) {
		if(session.getAttribute("admin") != null){
			int countUser = userService.getCountUser();
			int countSubject = subjectService.getCountSubject();
			int countTheory = theoryService.getCountTheory();
			int countExercise = exerciseService.getCountExercise();
			ModelAndView mav = new ModelAndView("admin/home");
			mav.addObject("countUser", countUser);
			mav.addObject("countSubject", countSubject);
			mav.addObject("countTheory", countTheory);
			mav.addObject("countExercise", countExercise);
			return mav;
		}
		ModelAndView mav1 = new ModelAndView("admin/NoneLogin");
		return mav1;
	}

	@RequestMapping(value = "/Login/admin/adminLogin/", method = RequestMethod.GET)
	public ModelAndView loginAdmin() {
		ModelAndView mav = new ModelAndView("admin/loginAdmin");
		return mav;
	}

	@RequestMapping(value = "/Login/admin/adminLogin/", method = RequestMethod.POST)
	public String loginAdmin(HttpServletRequest request, HttpSession session) {
		String userName = request.getParameter("userName");
		String passWord = request.getParameter("passWord");
		passWord = md5.hash(passWord);
		Admin ad = new Admin();
		ad = adminService.loginAdmin(userName, passWord);
		if(ad!=null)
		{
			session.setAttribute("admin", ad);
			return "redirect:/admin/trang-chu/";
		}
		return "redirect:/Login/admin/adminLogin/";
	}
}
