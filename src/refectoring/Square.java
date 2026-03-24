package refectoring;

//Square erbt von Rectangle -> Methoden werden automatisch von Rectangle übernommen und müssen nicht noch einmal ausgeführt werden

public class Square extends Rectangle {

    protected Square(double side, boolean filled, String color) {
        super(side, side, filled, color); // Breite == Höhe, da Quadrat
    }

}
