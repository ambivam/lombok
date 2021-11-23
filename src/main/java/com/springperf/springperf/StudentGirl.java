package com.springperf.springperf;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor(access=AccessLevel.PROTECTED)
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class StudentGirl {


    private long studentId;

    private String studentName;

    private List<String> subjects;

}
