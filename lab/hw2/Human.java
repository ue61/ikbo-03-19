package com.company.lab.hw2;

public class Human {
    Human(){
        Arm arm = new Arm(10);
        Leg leg = new Leg(15);
        Head head = new Head(5);
        arm.take();
        leg.step();
        head.spin();
    }
}
