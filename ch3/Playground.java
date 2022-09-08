// Code Magnets answer ##############################
// island = Fiji
// island = Cozumel
// island = Bermuda
// island = Azores
// class Playground {
//     public static void main(String[] args){
//         int y = 0;
//         int [] index = new int[4];
//         index[0] = 1;
//         index[1] = 3;
//         index[2] = 0;
//         index[3] = 2;

//         String [] islands = new String[4];
//         islands[0] = "Bermuda";
//         islands[1] = "Fiji";
//         islands[2] = "Azores";
//         islands[3] = "Cozumel";

//         int ref;
//         while (y < 4){
//             ref = index[y];
//             System.out.print("island = ");
//             System.out.println(islands[ref]);
//             y = y + 1;
//         }
//     }
// }


// Pool Puzzle answer ##############################
// triangle 0, area = 4.0
// triangle 1, area = 10.0
// triangle 2, area = 18.0
// triangle 3, area = 4.0
// y =

class Triangle {
    double area;
    int height;
    int length;

    public static void main (String[] args){
        int x = 0;
        Triangle [] ta = new Triangle[4];
        while (x < 4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area = ");
            System.out.println(ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    void setArea(){
        area = (height * length) / 2;
    }
}