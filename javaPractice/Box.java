class Box {
    double width; 
    double height;
    double depth;

    //Here's a constructor for Box
    Box() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }

    //display volume of a box
    // void volume() {
    //     System.out.print("Volume is ");
    //     System.out.println(width * height * depth);
    // }

    //compute and return volume
    double volume() {
        return width * height * depth;
    }

    //sets dimensions of the box
    // void setDim( double w, double h, double d) {
    //     width = w;
    //     height = h;
    //     depth = d;
    // }
}