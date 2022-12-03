package com.rhallal.evaluation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("api/v1/evaluations")
public record EvaluationController(EvaluationService evaluationService) {
    @PostMapping
    public void registerEvaluator(@RequestBody EvaluationRegistrationRequest evaluationRegistrationRequest){
        log.info("new evaluation registration {}", evaluationRegistrationRequest);
        evaluationService.registerEvaluator(evaluationRegistrationRequest);
    }

//    @GetMapping("student/{studentId}")
//    public List<Evaluation> getEvalStudentId(Integer id) {
//        return evaluationService.getEvalStudentId(id);
//    }

}
