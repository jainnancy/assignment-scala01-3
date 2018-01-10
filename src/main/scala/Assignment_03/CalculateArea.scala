package Assignment_03

class CalculateArea {

  def calculate(shape: String, first: Int, second: Int, f:(Int, Int) => Int): String =
  {
    if(shape.equalsIgnoreCase("rectangle") || shape.equalsIgnoreCase("rhombus") || shape.equalsIgnoreCase("parallelogram"))
    {
      "Area of " + shape + " is " + f(first,second)
    }
    else {
      "Invalid Shape"
    }
  }
}
