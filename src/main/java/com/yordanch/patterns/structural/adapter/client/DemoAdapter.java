package com.yordanch.patterns.structural.adapter.client;

import com.yordanch.patterns.structural.adapter.shapes.RoundHole;
import com.yordanch.patterns.structural.adapter.shapes.RoundPeg;
import com.yordanch.patterns.structural.adapter.shapes.SquarePeg;
import com.yordanch.patterns.structural.adapter.shapes.SquarePegAdapter;

public class DemoAdapter {

    public static void run(){
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println("Round peg fitting round hole: " + hole.fits(rpeg));

        SquarePeg speg = new SquarePeg(5);
        SquarePeg bpeg = new SquarePeg(10);

        SquarePegAdapter spegAdapter = new SquarePegAdapter(speg);
        SquarePegAdapter bpegAdapter = new SquarePegAdapter(bpeg);

        System.out.println("Small square adapter fitting round hole: " + hole.fits(spegAdapter));
        System.out.println("Big square adapter fitting round hole: " + hole.fits(bpegAdapter));
    }
}
