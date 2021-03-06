	package basic

object S06Tuples {
  var pair = (1001,"Night", false)                //> pair  : (Int, String, Boolean) = (1001,Night,false)
  pair._1                                         //> res0: Int = 1001
  pair._2                                         //> res1: String = Night
  pair._3                                         //> res2: Boolean = false
  
  val p: (Int, String) = (3,"B")                  //> p  : (Int, String) = (3,B)
  val p2: Tuple2[Int, String] = (333, "BBB")      //> p2  : (Int, String) = (333,BBB)
  val (i,s) = (1, "Two")                          //> i  : Int = 1
                                                  //| s  : String = Two
  
  pair = (1, "A", true)
  val speci = (1 -> "A")                          //> speci  : (Int, String) = (1,A)
}