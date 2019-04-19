package com.ym.ssm.test;

import com.ym.ssm.pojoex.EmpoyeeStatus;

/**
 * @ClassName: EnumTest
 * @Description: enum test
 * @auther: ym
 * @Date: 2019-4-18 16:37
 */
public class EnumTest {
    public static void main(String[] args) {
        EmpoyeeStatus empoyeeStatus=EmpoyeeStatus.LOGIN;
        System.out.println(empoyeeStatus.ordinal());
        System.out.println(empoyeeStatus.name());
        System.out.println(empoyeeStatus.getCode());
        System.out.println(empoyeeStatus.getMsg());
    }
}
