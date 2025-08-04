package rectangle;

public class Rectangle {

    public double width;
    public double height;

    public double areaDoRetangulo() {
      return width * height;
    }

    public double areaDoPerimetro() {
      return 2 * (width + height);
    }

    public double areaDiagonal() {
      return Math.sqrt(width * width + height * height);
    }

}
