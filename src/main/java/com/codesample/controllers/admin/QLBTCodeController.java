package com.codesample.controllers.admin;

import com.codesample.entities.AdminRole;
import com.codesample.entities.Exercise;
import com.codesample.entities.TestCase;
import com.codesample.repositories.ExerciseRepository;
import com.codesample.repositories.TestcaseRepository;
import com.codesample.services.IExerciseService;
import com.codesample.services.ITestcaseService;
import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class QLBTCodeController {

    @Autowired
    private IExerciseService exerciseService;

    @Autowired
    private ITestcaseService testCaseService;

    @Autowired
    private ExerciseRepository exerciseRepository;

    @Autowired
    private TestcaseRepository testCaseRepository;

    @RequestMapping(value = "/admin/QLBTCode/", method = RequestMethod.GET)
    public ModelAndView quanLyBTCode(HttpSession session){
        if(session.getAttribute("admin")!=null)
        {
            ModelAndView qlbt = new ModelAndView("admin/QLBTCode");
            List<Exercise> listEx = exerciseService.findAll();
            List<TestCase> listTest = testCaseService.findAll();
            qlbt.addObject("getAllExercise", listEx);
            qlbt.addObject("getAllTestCase", listTest);
            return qlbt;
        }
        ModelAndView mav = new ModelAndView("admin/NoneLogin");
        return mav;
    }

    @RequestMapping(value = "/admin/createBTCode/", method = RequestMethod.GET)
    public ModelAndView createBTCode(){
        ModelAndView mav = new ModelAndView("admin/createBTCode");
        return mav;
    }

    @PostMapping("/admin/createBTCode/DoneCreate/")
    public String createExercise(@RequestParam String level, @RequestParam  String title, @RequestParam  String content, @RequestParam  String constraint, @RequestParam  String inputFormat, @RequestParam  String outputFormat, @RequestParam  String sampleInput, @RequestParam  String sampleOutput, @RequestParam  String status, @RequestParam  String tag)
    {
        boolean check = exerciseService.createExercise(level, title, content, constraint, inputFormat, outputFormat, sampleInput, sampleOutput, Integer.valueOf(status), tag);
        System.out.println("Check: "+ check);
        if(check){
            return "redirect:/admin/QLBTCode/";
        }
        return "redirect:/admin/createBTCode/";
    }

    @RequestMapping(value = "/admin/editBTCode/{id}", method = RequestMethod.GET)
    public ModelAndView editBTCode(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/editBTCode");
        Exercise ex = new Exercise();
        ex = exerciseService.getExerciseById(id);
        mav.addObject("ex", ex);
        return mav;
    }

    @RequestMapping(value = "/admin/editBTCode/{id}", method = RequestMethod.POST)
    public String editBTCode(@PathVariable int id, HttpServletRequest request){
        Exercise ex = new Exercise();
        ex = exerciseService.getExerciseById(id);
        String level = request.getParameter("level");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String constraint = request.getParameter("constraint");
        String inputFormat = request.getParameter("inputFormat");
        String outputFormat = request.getParameter("outputFormat");
        String sampleInput = request.getParameter("sampleInput");
        String sampleOutput = request.getParameter("sampleOutput");
        String status = request.getParameter("status");
        String tag = request.getParameter("tag");
        ex.setLevel(level);
        ex.setTitle(title);
        ex.setContent(content);
        ex.setConstraint(constraint);
        ex.setInputFormat(inputFormat);
        ex.setOutputFormat(outputFormat);
        ex.setSampleInput(sampleInput);
        ex.setSampleOutput(sampleOutput);
        ex.setStatus(Integer.valueOf(status));
        ex.setTag(tag);
        exerciseRepository.save(ex);
        if (ex!=null)
        {
            return "redirect:/admin/QLBTCode/";
        }
        return "redirect:/admin/editBTCode/${id}";
    }

    @RequestMapping(value = "/admin/deleteBTCode/{id}", method = RequestMethod.GET)
    public ModelAndView deleteBTCode(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/deleteBTCode");
        Exercise ex = new Exercise();
        ex = exerciseService.getExerciseById(id);
        mav.addObject("ex", ex);
        return mav;
    }

    @RequestMapping(value = "/admin/deleteBTCode/{id}", method = RequestMethod.POST)
    public String deleteBTCode(@PathVariable int id, HttpServletRequest request){
        Exercise ex = new Exercise();
        ex = exerciseService.getExerciseById(id);
        List<TestCase> ls = testCaseService.getTestCaseByID(id);
        testCaseRepository.delete(ls);
        exerciseRepository.delete(ex);
        return "redirect:/admin/QLBTCode/";
    }

    @RequestMapping(value = "/admin/createTestCase/{id}", method = RequestMethod.GET)
    public ModelAndView createTestCase(@PathVariable int id){
        ModelAndView mav = new ModelAndView("admin/createTestCase");
        mav.addObject("idBTCode", id);
        return mav;
    }

    @RequestMapping(value = "/admin/createTestCase/{id}", method = RequestMethod.POST)
    public String createTestCase(@PathVariable int id, HttpServletRequest request){
        TestCase tc = new TestCase();
        String input = request.getParameter("input");
        String output = request.getParameter("output");
        tc.setInput(input);
        tc.setOutput(output);
        Exercise ex = new Exercise();
        ex.setId(id);
        tc.setExercise(ex);
        testCaseRepository.save(tc);
        return "redirect:/admin/QLBTCode/";
    }

    @RequestMapping(value = "/admin/editTestCase/{id}", method = RequestMethod.GET)
    public ModelAndView editTestCase(@PathVariable int id)
    {
        ModelAndView mav = new ModelAndView("admin/editTestCase");
        TestCase tc = new TestCase();
        tc = testCaseRepository.findOne(id);
        mav.addObject("testcase", tc);
        return mav;
    }

    @RequestMapping(value = "/admin/editTestCase/{id}", method = RequestMethod.POST)
    public String editTestCase(@PathVariable int id, HttpServletRequest request)
    {
        TestCase tc = new TestCase();
        tc = testCaseRepository.findOne(id);
        String input = request.getParameter("input");
        String output = request.getParameter("output");
        tc.setInput(input);
        tc.setOutput(output);
        testCaseRepository.save(tc);
        return "redirect:/admin/QLBTCode/";
    }

    @RequestMapping(value = "/admin/deleteTestCase/{id}", method = RequestMethod.GET)
    public ModelAndView deleteTestCase(@PathVariable int id)
    {
        ModelAndView mav = new ModelAndView("admin/deleteTestCase");
        TestCase tc = new TestCase();
        tc = testCaseRepository.findOne(id);
        mav.addObject("testcase", tc);
        return mav;
    }

    @RequestMapping(value = "/admin/deleteTestCase/{id}", method = RequestMethod.POST)
    public String deleteTestCase(@PathVariable int id, HttpServletRequest request)
    {
        TestCase tc = new TestCase();
        tc = testCaseRepository.findOne(id);
        testCaseRepository.delete(tc);
        return "redirect:/admin/QLBTCode/";
    }
}
