package basic

object S04Arrays {

  val sa = new Array[String](3)                   //> sa  : Array[String] = Array(null, null, null)
  
  sa(0) = "How"
  sa(1) = "are"
  
  sa(2) = "you"
  sa.update(2,"you?")
  sa(2)                                           //> res0: String = you?
  sa                                              //> res1: Array[String] = Array(How, are, you?)
  
  sa.head                                         //> res2: String = How
  sa.tail                                         //> res3: Array[String] = Array(are, you?)
  sa.reverse                                      //> res4: Array[String] = Array(you?, are, How)
  sa.max                                          //> res5: String = you?
  sa.foldLeft("")(_+_)                            //> res6: String = Howareyou?
  sa.foldRight(sa(0))((a,b) => if(a > b) a else b)//> res7: String = you?
  sa.mkString(" ")                                //> res8: String = How are you?
  sa.sortBy(0-_.length)                           //> res9: Array[String] = Array(you?, How, are)
}