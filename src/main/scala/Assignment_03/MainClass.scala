package Assignment_03

object MainClass extends App {

//Question 1
  val sum = new SumLists
  val list1 = List(1,2,3,4)
  val list2 = List(10,20,30,40)
  val resultList = sum.sumOfLists(list1, list2, 0, List())
  print(resultList)
  print("\n")
  val zero = 0
  val one = 1

//Question 2
  print("\n\nOutput for Fibonacci series \n")
  val fib = new Fibonacci
  val limit = 6
  print(s"If limit is $limit \nOutput: ")
  val fibonacci = fib.fibonacci(zero,limit)


  //Question 3
  print("\n\nOutput for Area Calculation \n")
  val areaOfRectangle = new CalculateArea
  val first = 3
  val second = 10
  print(areaOfRectangle.calculate("rectangle", first, second, (one, two ) => (one * two)))


  //Question 4
  print("\n\nOutput for Double list elements \n")
  val list = List(1, 2, 3, 4, 5)
  val doubledList = new DoubleElements
  print(s"Input : $list \n")
  print(s"Output: ${doubledList.doubleTheElements(list)} \n")

//Question 5
  print("\n\nOutput for nth Element \n")
  val findNth = List(1, 2, 3, 4, 5)
  val n = 2
  val nth = new KthElement
  val elementAtN = nth.nthElement(n, findNth)
  print(s"value at $n = $elementAtN ")

  //Question 6
  print("\n\nOutput for number of elements \n")
  val sizeList = List(3, 5, 76, 12, 0, 3)
  val sizeOfList = new NumberOfElements
  val size = sizeOfList.numberOfElements(zero, sizeList)
  print(s"Number of elements in $sizeList is $size")

  //Question 7
  print("\n\nOutput for Reverse the given list \n")
  val reverseThis = List(1, 2, 3, 4, 5)
  val reverse = new ReverseList
  print(s"Input: $reverseThis \nOutput: ")
  reverse.reverseOfList(reverseThis.size - 1, reverseThis)
}
