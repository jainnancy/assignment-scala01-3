package Assignment_03

class Fibonacci {

 def fibonacciSeries(number: Int): Int =
  {
  number match
  {
  case 0 => 0
  case 1 => 1
  case _ => fibonacciSeries(number - 1) + fibonacciSeries(number - 2)
  }
  }

  def fibonacci(i: Int, number: Int): Unit =
  {
    if(i < number)
    {
      val result = fibonacciSeries(i)
      print(result + ", ")
      fibonacci(i + 1, number)
    }
  }

}
