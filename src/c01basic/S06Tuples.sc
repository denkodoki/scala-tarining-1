	package basic

object S06Tuples {
  val pair = (1001,"Night")                       //> pair  : (Int, String) = (1001,Night)
  pair._1                                         //> res0: Int = 1001
  pair._2                                         //> res1: String = Night
  
  val p: (Int, String) = (3,"B")                  //> p  : (Int, String) = (3,B)
  val p2: Tuple2[Int, String] = (333, "BBB")      //> p2  : (Int, String) = (333,BBB)
  val (i,s) = (1, "Two")                          //> i  : Int = 1
                                                  //| s  : String = Two
}