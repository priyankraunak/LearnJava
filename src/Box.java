class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d){
        //System.out.println("Constructing.....");
        //width = 1;
        //depth = 2;
        //height = 3;
        width = w;
        height = h;
        depth = d;
    }

    Box(){
        width =-1;
        height =-1;
        depth = -1;
    }

    Box(double len){
        width = depth = height = len;
    }

    Box(Box ob){
        width = ob.width;
        depth = ob.depth;
        height = ob.height;
    }


    /*Box(double width,double height,double depth){
        this.width = width;
        this.height = height;
        this.depth =depth;
    }*/
    //void volume(){
      //  System.out.println("Volume is : " + width*height*depth);
    //}
    double volume(){
        return width*height*depth;
    }

    void setDim(double w,double h,double d){
        width = w;
        height = h;
        depth = d;
    }
}
