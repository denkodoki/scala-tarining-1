package basic

object S04Arrays {

  val sa = new Array[String](3)                   //> sa  : Array[String] = Array(null, null, null)
  
  sa(0) = "How"
  sa(1) = "are"
  
  sa(2) = "you"
  sa.update(2,"you?")
  sa(2)                                           //> res0: String = you?
  
  sa.head                                         //> res1: String = How
  sa.tail                                         //> res2: Array[String] = Array(are, you?)
  sa.reverse                                      //> res3: Array[String] = Array(you?, are, How)
  sa.max                                          //> res4: String = you?
  sa.foldRight(" ")(_+_)                          //> res5: String = "Howareyou? "
  sa.foldRight(sa(0))((a,b) => if(a > b) a else b)//> res6: String = you?
  sa.mkString(" ")                                //> res7: String = How are you?
  sa.sortBy(_.length)                             //> res8: Array[String] = Array(How, are, you?)
}