package com.codesample.controllers.admin;

import com.codesample.entities.NewEntity;
import com.codesample.services.INewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//@Controller(value = "newControllerOfAdmin")
public class NewController {
	
	@Autowired
	private INewService newService;

	@RequestMapping(value = "/show-list", method = RequestMethod.GET)
	public String showList(Model model) {
		List<NewEntity> kq = newService.findAll();
		model.addAttribute("model",kq);
		return "admin/new/list";
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ResponseEntity<List<NewEntity>> getList() {
//		ModelAndView mav = new ModelAndView("admin/new/list");
		List<NewEntity> kq = newService.findAll();
//		model.setListResult(kq);
//		mav.addObject("model", model);
//		return mav; @ModelAttribute("model") NewModel model
		return  ResponseEntity.ok(kq);
	}

	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
	public ModelAndView editNew() {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		return mav;
	}
}
