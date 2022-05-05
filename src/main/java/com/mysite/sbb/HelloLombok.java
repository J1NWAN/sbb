package com.mysite.sbb;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor // 의존성 주입시 사용
@Getter
//@Setter
public class HelloLombok {

    private final String hello;
    private final int lombok;

    public static void main(String[] args) {
//        HelloLombok helloLombok = new HelloLombok();
//        helloLombok.setHello("헬로");
//        helloLombok.setLombok(5);
        HelloLombok helloLombok = new HelloLombok("헬로", 5);

        System.out.println(helloLombok.getHello());
        System.out.println(helloLombok.getLombok());
    }
}
