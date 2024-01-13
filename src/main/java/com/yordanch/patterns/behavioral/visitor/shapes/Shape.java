package com.yordanch.patterns.behavioral.visitor.shapes;

import com.yordanch.patterns.behavioral.visitor.visitor.Visitor;

public interface Shape {
        void move(int x, int y);
        void draw();
        String accept(Visitor visitor);
}
