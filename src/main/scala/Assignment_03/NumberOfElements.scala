package Assignment_03

class NumberOfElements {
  def numberOfElements(i: Int, list: List[Int]): Int =
  {
   if(i <= list.size) {
     1 + numberOfElements(i + 1, list)
     1
    }
    print(s"Number of elements in $list is i+1 ")
    1
  }
}
