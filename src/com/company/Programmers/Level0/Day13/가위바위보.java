package com.company.Programmers.Level0.Day13;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 가위바위보 {
    public String solution(String rsp) {
        return Arrays.stream(rsp.split(""))
                .map(s->s.equals("2")? "0" : s.equals("0") ? "5" : "2")
                .collect(Collectors.joining());
    }
}

