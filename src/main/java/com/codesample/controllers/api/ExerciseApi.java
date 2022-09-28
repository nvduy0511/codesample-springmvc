package com.codesample.controllers.api;

import com.codesample.entities.Exercise;
import com.codesample.entities.TestCase;
import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import com.codesample.services.IExerciseService;
import com.codesample.services.IRunCodeService;
import com.codesample.services.ITestcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/api/exercise")
public class ExerciseApi {

    @Autowired
    IExerciseService exerciseService;

    @Autowired
    ITestcaseService testcaseService;

    @Autowired
    IRunCodeService runCodeService;


    @PostMapping("/runCode")
    public RunCodeResponse runCode(@RequestBody RunCodeRequest runCodeRequest){
        return runCodeService.runCode(runCodeRequest);
    }

    @GetMapping("/getExercise")
    public Exercise getExercise(@RequestParam int id){
        return exerciseService.getOne(id);
    }

    @GetMapping("/getTestCase")
    public List<Integer> getTestCase(@RequestParam int id){
        return testcaseService.getByIdExercise(id);
    }

}
