package basic

object S05Lists {
  val l = List(1, 2, 3)                           //> l  : List[Int] = List(1, 2, 3)
  4 :: l                                          //> res0: List[Int] = List(4, 1, 2, 3)
  l                                               //> res1: List[Int] = List(1, 2, 3)
  1 :: 2 :: 3 :: List()                           //> res2: List[Int] = List(1, 2, 3)
  1 :: 2 :: 3 :: Nil                              //> res3: List[Int] = List(1, 2, 3)
  
  val List(a, b, c) = l                           //> a  : Int = 1
                                                  //| b  : Int = 2
                                                  //| c  : Int = 3
  
  val l2 = List(4, 5, 6)                          //> l2  : List[Int] = List(4, 5, 6)
  l ::: l2                                        //> res4: List[Int] = List(1, 2, 3, 4, 5, 6)
  
  l.map("element " + _)                           //> res5: List[String] = List(element 1, element 2, element 3)
  
  List(List(1,2,3), List(4,5,6, 7), List(8,9)).flatMap(_.map(_*10))
                                                  //> res6: List[Int] = List(10, 20, 30, 40, 50, 60, 70, 80, 90)
  
  l.drop(2)                                       //> res7: List[Int] = List(3)
  l.reverse                                       //> res8: List[Int] = List(3, 2, 1)

  l(1)                                            //> res9: Int = 2
  l.apply(1)                                      //> res10: Int = 2
  l.head                                          //> res11: Int = 1
  l.last                                          //> res12: Int = 3
  l.tail                                          //> res13: List[Int] = List(2, 3)
  l.init                                          //> res14: List[Int] = List(1, 2)

  def isEven(i: Int) = i % 2 == 0                 //> isEven: (i: Int)Boolean
  l.count(isEven)                                 //> res15: Int = 1
  l.exists(isEven)                                //> res16: Boolean = true
  l filter isEven                                 //> res17: List[Int] = List(2)
  l forall isEven                                 //> res18: Boolean = false
  l map {_ + 1}                                   //> res19: List[Int] = List(2, 3, 4)
  l.sortWith(_ > _)                               //> res20: List[Int] = List(3, 2, 1)
  l.groupBy(_ % 2)                                //> res21: scala.collection.immutable.Map[Int,List[Int]] = Map(1 -> List(1, 3), 
                                                  //| 0 -> List(2))
}