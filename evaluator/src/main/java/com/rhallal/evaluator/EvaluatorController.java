package com.rhallal.evaluator;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/evaluators")
public record EvaluatorController(EvaluatorService evaluatorService) {

    @PostMapping
    public void registerEvaluator(@RequestBody EvaluatorRegistrationRequest evaluatorRegistrationRequest){
        log.info("new evaluator registration {}", evaluatorRegistrationRequest);
        evaluatorService.registerEvaluator(evaluatorRegistrationRequest);
    }
}
