package basic

object S05Lists {
  val l = List(1, 2, 3)                           //> l  : List[Int] = List(1, 2, 3)
  4 :: l                                          //> res0: List[Int] = List(4, 1, 2, 3)
  l                                               //> res1: List[Int] = List(1, 2, 3)
  1 :: 2 :: 3 :: List()                           //> res2: List[Int] = List(1, 2, 3)
  1 :: 2 :: 3 :: Nil                              //> res3: List[Int] = List(1, 2, 3)
  
  val luj = l ::: List("a", "b")                  //> luj  : List[Any] = List(1, 2, 3, a, b)
  luj.map(x => 10 + x.toString)                   //> res4: List[String] = List(101, 102, 103, 10a, 10b)
  
  val List(a, b, c) = l                           //> a  : Int = 1
                                                  //| b  : Int = 2
                                                  //| c  : Int = 3
  
  l :+ 1                                          //> res5: List[Int] = List(1, 2, 3, 1)
  val l2 = List(4, 5, 6)                          //> l2  : List[Int] = List(4, 5, 6)
  l ::: l2                                        //> res6: List[Int] = List(1, 2, 3, 4, 5, 6)
  
  l.map(10 + _)                                   //> res7: List[Int] = List(11, 12, 13)
  l                                               //> res8: List[Int] = List(1, 2, 3)
  
  List(List(1,2,3), List(1,2,3, 7), List(8,9)).flatMap(_.map(_*10))
                                                  //> res9: List[Int] = List(10, 20, 30, 10, 20, 30, 70, 80, 90)
  
  l.drop(1)                                       //> res10: List[Int] = List(2, 3)
  l.reverse                                       //> res11: List[Int] = List(3, 2, 1)

  l(1)                                            //> res12: Int = 2
  l.apply(1)                                      //> res13: Int = 2
  l.head                                          //> res14: Int = 1
  l.last                                          //> res15: Int = 3
  l.tail                                          //> res16: List[Int] = List(2, 3)
  l.init                                          //> res17: List[Int] = List(1, 2)

  def isEven(i: Int) = i % 2 == 0                 //> isEven: (i: Int)Boolean
  l.count(isEven)                                 //> res18: Int = 1
  l.exists(isEven)                                //> res19: Boolean = true
  l filter isEven                                 //> res20: List[Int] = List(2)
  l forall isEven                                 //> res21: Boolean = false
  l map {_ + 1}                                   //> res22: List[Int] = List(2, 3, 4)
  l.sortWith(_ > _)                               //> res23: List[Int] = List(3, 2, 1)
  l.groupBy(_ % 2)                                //> res24: scala.collection.immutable.Map[Int,List[Int]] = Map(1 -> List(1, 3), 
                                                  //| 0 -> List(2))
  val l10 = List(1, "1")                          //> l10  : List[Any] = List(1, 1)
}