package com.codesample.controllers.web;

import com.codesample.services.IExerciseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExerciseController {

    @Autowired
    IExerciseService exerciseService;

    @GetMapping("/list-exercise")
    public String listExercise(Model model){
        model.addAttribute("lsExercise",exerciseService.getAll());
        return "web/list-exercise";
    }

    @GetMapping("/exercise/{id}")
    public String exercise(@PathVariable int id){

        return "web/exercise-detail";
    }
}
