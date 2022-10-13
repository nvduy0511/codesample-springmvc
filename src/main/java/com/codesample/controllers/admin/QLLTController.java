package com.codesample.controllers.admin;

import com.codesample.entities.Subject;
import com.codesample.entities.Theory;
import com.codesample.repositories.SubjectRepository;
import com.codesample.repositories.TheoryRepository;
import com.codesample.services.impl.TheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QLLTController {

    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    protected TheoryRepository theoryRepository;

    @Autowired
    private TheoryService theoryService;

    @RequestMapping(value = "/admin/QLLT/", method = RequestMethod.GET)
    public ModelAndView quanLyLT(HttpSession session){
        if(session.getAttribute("admin")!=null)
        {
            ModelAndView mav = new ModelAndView("admin/QLMH_LT");
            List<Subject> listSb = subjectRepository.findAll();
            List<Theory> listTheory = theoryRepository.findAll();
            mav.addObject("getAllSubject", listSb);
            mav.addObject("getAllTheory", listTheory);
            return mav;
        }
        ModelAndView mav1 = new ModelAndView("admin/NoneLogin");
        return mav1;
    }

    @RequestMapping(value = "/admin/createMH/", method = RequestMethod.GET)
    public ModelAndView createMH(){
        ModelAndView mav = new ModelAndView("admin/createMH");
        return mav;
    }

    @RequestMapping(value = "/admin/createMH/", method = RequestMethod.POST)
    public String createMH(HttpServletRequest request) {
        String tenmh = request.getParameter("tenmh");
        String mota = request.getParameter("mota");
        Subject sb = new Subject();
        sb.setName(tenmh);
        sb.setDescription(mota);
        subjectRepository.save(sb);
        if(sb!=null)
        {
            return "redirect:/admin/QLLT/";
        }
        return "redirect:/admin/createMH/";
    }

    @RequestMapping(value = "/admin/editMH/{id}", method = RequestMethod.GET)
    public ModelAndView editMH(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/editMH");
        Subject sb = new Subject();
        sb = subjectRepository.findOne(id);
        mav.addObject("Subject", sb);
        return mav;
    }

    @RequestMapping(value = "/admin/editMH/{id}", method = RequestMethod.POST)
    public String editMH(@PathVariable int id, HttpServletRequest request){
        Subject sb = new Subject();
        sb = subjectRepository.findOne(id);
        String name = request.getParameter("ten");
        String mota = request.getParameter("mota");
        sb.setName(name);
        sb.setDescription(mota);
        subjectRepository.save(sb);
        return "redirect:/admin/QLLT/";
    }

    @RequestMapping(value = "/admin/deleteMH/{id}", method = RequestMethod.GET)
    public ModelAndView deleteMH(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/deleteMH");
        Subject sb = new Subject();
        sb = subjectRepository.findOne(id);
        mav.addObject("Subject", sb);
        return mav;
    }

    @RequestMapping(value = "/admin/deleteMH/{id}", method = RequestMethod.POST)
    public String deleteMH(@PathVariable int id, HttpServletRequest request){
        Subject sb = new Subject();
        sb = subjectRepository.findOne(id);
        List<Theory> ls = theoryService.findAllByIdSubject(id);
        theoryRepository.delete(ls);
        subjectRepository.delete(sb);
        return "redirect:/admin/QLLT/";
    }

    @RequestMapping(value = "/admin/createLT/{id}", method = RequestMethod.GET)
    public ModelAndView createLT(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/createLT");
        mav.addObject("idSB", id);
        Theory th = new Theory();
        mav.addObject("Theory", th);
        return mav;
    }

    @RequestMapping(value = "/admin/createLT/{id}", method = RequestMethod.POST)
    public String createLT(@PathVariable int id, HttpServletRequest request){
        String title = request.getParameter("title");
        String content = request.getParameter("editor1");
        Theory th = new Theory();
        th.setTitle(title);
        th.setContent(content);
        Subject sb = new Subject();
        sb.setId(id);
        th.setSubject(sb);
        theoryRepository.save(th);
        return "redirect:/admin/QLLT/";
    }

    @RequestMapping(value = "/admin/editLT/{id}", method = RequestMethod.GET)
    public ModelAndView editLT(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/editLT");
        Theory th = new Theory();
        th = theoryRepository.findOne(id);
        mav.addObject("Theory", th);
        return mav;
    }

    @RequestMapping(value = "/admin/editLT/{id}", method = RequestMethod.POST)
    public String editLT(@PathVariable int id, HttpServletRequest request){
        Theory th = new Theory();
        th = theoryRepository.findOne(id);
        String title = request.getParameter("title");
        String content = request.getParameter("editor1");
        th.setTitle(title);
        th.setContent(content);
        theoryRepository.save(th);
        return "redirect:/admin/QLLT/";
    }

    @RequestMapping(value = "/admin/deleteLT/{id}", method = RequestMethod.GET)
    public ModelAndView deleteLT(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/deleteLT");
        Theory th = new Theory();
        th = theoryRepository.findOne(id);
        mav.addObject("Theory", th);
        return mav;
    }

    @RequestMapping(value = "/admin/deleteLT/{id}", method = RequestMethod.POST)
    public String deleteLT(@PathVariable int id, HttpServletRequest request){
        ModelAndView mav = new ModelAndView("admin/deleteLT");
        Theory th = new Theory();
        th = theoryRepository.findOne(id);
        theoryRepository.delete(th);
        return "redirect:/admin/QLLT/";
    }
}
