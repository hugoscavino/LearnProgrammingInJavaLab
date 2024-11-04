package com.learnprogramminginjava.reuse;

public class ShapeManager {

    public void draw(final Rectangle rectangle) {

        if (rectangle instanceof Square) {
            rectangle.setShapeId(Integer.parseInt("2" + rectangle.getShapeId()));
        } else {
            rectangle.setShapeId(Integer.parseInt("1" + rectangle.getShapeId()));
        }

        int height = rectangle.getHeight();
        int width = rectangle.getWidth();
        String SIDE_CHAR = "│";

        StringBuilder output = new StringBuilder();
        System.out.println("[ID:" + rectangle.getShapeId() + "]");

        // height + 2 for the extra row of characters on the top and bottom
        for (int h = 0; h < height + 2; h++) {

                // If on the outer edge, when h = 0 or h = height + 1
                if (h % (height + 1) == 0) {
                    if (h == 0){
                        output.append("┌");
                    } else {
                        output.append("└");
                    }

                    output.append("—".repeat(Math.max(0, width)));
                    // Otherwise only draw the vertical lines.
                } else {
                    output.append(SIDE_CHAR);
                    output.append(" ".repeat(Math.max(0, width)));
                }

            // Add the last line of characters
            if (h % (height + 1) == 0) {
                if (h == 0){
                    output.append("┐");
                } else {
                    output.append("┘");
                }


            } else {
                output.append(SIDE_CHAR);
            }
            // Add new line character
            output.append("\n");
        }
        System.out.println(output);

    }
    public void draw(Rectangle[] rectangles){
        for(Rectangle rectangle : rectangles){
            draw(rectangle);
        }
    }
    public static void main(String[] args) {

        ShapeManager sm = new ShapeManager();

        Rectangle r1 = new Rectangle(4,4);
        Square s1 = new Square(10,2);

        Rectangle[] rectangles = {r1,s1};
        sm.draw(rectangles);
    }
}
