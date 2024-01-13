package com.yordanch.patterns.behavioral.visitor.visitor;

import com.yordanch.patterns.behavioral.visitor.shapes.Circle;
import com.yordanch.patterns.behavioral.visitor.shapes.CompoundShape;
import com.yordanch.patterns.behavioral.visitor.shapes.Dot;
import com.yordanch.patterns.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
