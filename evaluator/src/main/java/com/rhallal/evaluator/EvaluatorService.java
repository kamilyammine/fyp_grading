package com.rhallal.evaluator;

import org.springframework.stereotype.Service;

@Service
public record EvaluatorService(EvaluatorRepository evaluatorRepository) {
    public void registerEvaluator(EvaluatorRegistrationRequest request) {
        Evaluator evaluator = Evaluator.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        evaluatorRepository.save(evaluator);
    }
}

