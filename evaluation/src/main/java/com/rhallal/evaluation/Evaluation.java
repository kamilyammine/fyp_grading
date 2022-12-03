package com.rhallal.evaluation;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Evaluation {
    @Id
    @SequenceGenerator(
            name = "evaluation_id_sequence",
            sequenceName = "evaluation_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "evaluation_id_sequence"
    )
    private Integer id;
    private Integer evaluatorId;
    private Integer StudentId;
    private Integer Criteria1;
    private Integer Criteria2;
    private Integer Criteria3;
    private Integer Criteria4;
    private Integer Criteria5;
    private Integer Criteria6;
    private Integer Criteria7;
    private Integer Criteria8;
    private Double grade;
}