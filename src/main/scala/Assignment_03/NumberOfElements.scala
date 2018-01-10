package Assignment_03

class NumberOfElements {
  def numberOfElements(i: Int, list: List[Int]): Int =
  {
   if(i < list.size) {
     1 + numberOfElements(i + 1, list)
    }
   else if(i == list.size)
     {
       0
     }
    else
     {
       0
     }

  }
}
