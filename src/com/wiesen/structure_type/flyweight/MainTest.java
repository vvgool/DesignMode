package com.wiesen.structure_type.flyweight;

/**
 * Created by wiesen on 16-7-19.
 */
public class MainTest {

    public static void main(String[] args){
        FlywightAllShareFactory flywightAllShareFactory = new FlywightAllShareFactory();
        IFlywightAllShare allshare = flywightAllShareFactory.getFlywight("all_share");
        allshare.onDisplay();

        System.out.println("******************************************");

        FlywightPartShareFactory flywightPartShareFactory = new FlywightPartShareFactory();
        IFlywightPartShare partshare = flywightPartShareFactory.getPartShare("part_share");
        partshare.setFontSize(20);
        partshare.onDisplay();

    }
}
