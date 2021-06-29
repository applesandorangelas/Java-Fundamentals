package labs_examples.objects_classes_methods.labs.objects;

class myExercise02to04 {


    public static void main(String[] args) {

        StudioRoom myStudioRoom = new StudioRoom("music","white");
       System.out.println("I use my " + myStudioRoom.color + "-colored studio for " + myStudioRoom.roomFunction);

        System.out.println(myStudioRoom.toString()); //why does it say the toString is redundant?

        //overloading test
        StudioRoom myStudioRoom2 = new StudioRoom("art","green",640);
        System.out.println(myStudioRoom2.toString());

        //overloading test
        StudioRoom myStudioRoom3 = new StudioRoom("sleeping","blue",1010,6);
        System.out.println(myStudioRoom3.toString());

    }
}

class StudioRoom {

    String roomFunction;
    String color;
    int squarefeet;
    int floor;

    //overloading example [exercise 03]
    public StudioRoom(String roomFunction, String color, int squarefeet) {
        this.roomFunction = roomFunction;
        this.color = color;
        this.squarefeet = squarefeet;
    }
    public StudioRoom(String roomFunction, String color, int squarefeet, int floor) {
        this.roomFunction = roomFunction;
        this.color = color;
        this.squarefeet = squarefeet;
        this.floor=floor;
    }


    public StudioRoom(String roomFunction, String color) {
        this.roomFunction = roomFunction;
        this.color = color;
    }

    public String getRoomFunction() {
        return roomFunction;
    }

    public void setRoomFunction(String roomFunction) {
        this.roomFunction = roomFunction;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSquarefeet() {
        return squarefeet;
    }

    public void setSquarefeet(int squarefeet) {
        this.squarefeet = squarefeet;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "StudioRoom{" +
                "roomFunction='" + roomFunction + '\'' +
                ", color='" + color + '\'' +
                ", squarefeet=" + squarefeet +
                ", floor=" + floor +
                '}';
    }
}


//class RoomFunction {
    //String roomFunction;

    //public RoomFunction(String roomFunction) {
    //    this.roomFunction = roomFunction;
  //  }
//}

//class RoomColor {
    //String color;

    //public RoomColor(String color) {
    //    this.color = color;
  //  }
//}