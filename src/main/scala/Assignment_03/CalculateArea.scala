package Assignment_03

class CalculateArea {

  def calculate(shape: String, first: Int, second: Int, f:(Int, Int) => Int): String =
  {
    "Area of " + shape + " is " + f(first,second)
  }
}
