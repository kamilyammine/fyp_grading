package com.rhallal.evaluation;

public record EvaluationRegistrationRequest(
        Integer id,
        Integer evaluatorId,
        Integer studentId,
        Integer criteria1,
        Integer criteria2,
        Integer criteria3,
        Integer criteria4,
        Integer criteria5,
        Integer criteria6,
        Integer criteria7,
        Integer criteria8,
        Double grade) {
}
