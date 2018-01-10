package Assignment_03

class ReverseList {

  def reverseOfList(i: Int, list: List[Int]): Unit = {
    if (i >= 0) {
      val value = list(i)
      print(s"$value  ")
      reverseOfList(i - 1, list)
    }
  }
}
