package com.rhallal.evaluation;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public record EvaluationService(EvaluationRepository evaluationRepository) {
    public void registerEvaluator(EvaluationRegistrationRequest request) {
        Evaluation evaluator = Evaluation.builder()
                .evaluatorId(request.evaluatorId())
                .StudentId(request.studentId())
                .Criteria1(request.criteria1())
                .Criteria2(request.criteria2())
                .Criteria3(request.criteria3())
                .Criteria4(request.criteria4())
                .Criteria5(request.criteria5())
                .Criteria6(request.criteria6())
                .Criteria7(request.criteria7())
                .Criteria8(request.criteria8())
                .grade((request.criteria1()*0.1+request.criteria2()*0.15+request.criteria3()*0.1+
                        request.criteria4()*0.1+request.criteria5()*0.2+request.criteria6()*0.1+
                        request.criteria7()*0.1+ request.criteria8()*0.15)*5)
                .build();

        evaluationRepository.save(evaluator);
    }
//    public List<Evaluation> getEvalStudentId(Integer id){
//        return evaluationRepository.findStudentById(id);
//    }
}
