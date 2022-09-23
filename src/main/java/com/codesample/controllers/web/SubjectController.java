package com.codesample.controllers.web;

import com.codesample.entities.Subject;
import com.codesample.entities.Theory;
import com.codesample.services.ISubjectService;
import com.codesample.services.ITheoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

@Controller
public class SubjectController {

    @Autowired
    private  ISubjectService subjectService;

    @Autowired
    private ITheoryService theoryService;


    @RequestMapping(value = "/lythuyet", method = RequestMethod.GET)
    public ModelAndView Subject(){
        List<Subject> list = subjectService.findAll();
        ModelAndView subject = new ModelAndView("web/subject");
        subject.addObject("list", list);
        return subject;
    }

    @RequestMapping(value = "/lythuyet/{id}", method = RequestMethod.GET)
    public ModelAndView Theory(@PathVariable int id){
        List<Theory> list = theoryService.findAllByIdSubject(id);

        ModelAndView theory = new ModelAndView("web/theory");
        theory.addObject("list", list);

        return theory;
    }

    @RequestMapping(value = "/lythuyet/baihoc/{id}", method = RequestMethod.GET)
    public ModelAndView TheoryDetail(@PathVariable int id){
        Theory item = theoryService.findOne(id);
        ModelAndView theoryDetail = new ModelAndView("web/theoryDetail");
        theoryDetail.addObject("item", item);
        return theoryDetail;
    }

//    @RequestMapping("/get-all-subject")
//    public List<Subject> getAll(){
//        return subjectService.findAll();
//    }

}
