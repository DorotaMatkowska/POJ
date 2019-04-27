package Exercise_04_04;

public class Shape {

    private String colour;
    private boolean filled;


    public Shape(){
        colour = "red";
        filled = true;
    }

    public Shape(String colour, boolean filled) {


        this.colour = colour;
        this.filled = filled;
        }

        public String getcolour() {
            return colour;
        }

        public boolean getfilled () {
            return filled;
        }

        public void setfilled (boolean filled){
            this.filled = filled;
        }

        public String toString () {
            return "Shape[colour =  " + colour + "  filled = " + filled;
        }





    }




