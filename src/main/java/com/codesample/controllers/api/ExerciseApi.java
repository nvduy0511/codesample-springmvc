package com.codesample.controllers.api;

import com.codesample.entities.DoExercise;
import com.codesample.entities.Exercise;
import com.codesample.entities.User;
import com.codesample.models.Rank;
import com.codesample.models.RunCodeRequest;
import com.codesample.models.RunCodeResponse;
import com.codesample.services.IDoExerciseService;
import com.codesample.services.IExerciseService;
import com.codesample.services.IRunCodeService;
import com.codesample.services.ITestcaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    @Autowired
    IDoExerciseService doExerciseService;


    @PostMapping("/runCode")
    public String runCode(@RequestBody RunCodeRequest runCodeRequest){

        return runCodeService.runCode(runCodeRequest).getOutput();
    }

    @PostMapping("/runCodes")
    public List<Integer> runCodes(@RequestBody RunCodeRequest runCodeRequest, @RequestParam int id){
        return runCodeService.runCodes(runCodeRequest,id);
    }

    @GetMapping("/getExercise")
    public Exercise getExercise(@RequestParam int id){
        return exerciseService.getOne(id);
    }

    @GetMapping("/getTestCase")
    public List<Integer> getTestCase(@RequestParam int id){
        return testcaseService.getByIdExercise(id);
    }

    @GetMapping("/getHistory")
    public List<DoExercise> getHistory(@RequestParam int id, HttpServletRequest request){
        User user = (User) request.getSession().getAttribute("user");
        if(user == null)
            return null;
        return doExerciseService.getAllByIdUserAndIdExercise(user.getId(),id);
    }

    @GetMapping("/getRank")
    public List<Rank> getRank(@RequestParam int id){
        return doExerciseService.getRankByIdExercise(id);
    }

}
