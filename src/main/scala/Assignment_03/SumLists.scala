package Assignment_03

class SumLists {

  def sumOfLists(list1: List[Int],list2: List[Int],i: Int,resultList: List[Int]): List[Int] = {

   /*(i < list1.size  )
      {
        val result = list1(i) + list2(i)
        val add = resultList :: result
        resultList = sumOfLists(list1, list2, i+1, add)

      }*/

    resultList
  }
}
