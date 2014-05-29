package basic

object Otest2 {
  var pair = (1001,"Night", false)
  pair._1
  pair._2 
  pair._3
  
  val p: (Int, String) = (3,"B")                  //> p  : (Int, String) = (3,B)
  val p2: Tuple2[Int, String] = (333, "BBB")      //> p2  : (Int, String) = (333,BBB)
  val (i,s) = (1, "Two")                          //> i  : Int = 1
                                                  //| s  : String = Two
  
  pair = (1, "A", true)
  val speci = (1 -> "A")                          //> speci  : (Int, String) = (1,A)
}