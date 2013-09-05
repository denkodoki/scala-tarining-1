package basic

object S08Maps {
	var points = Map("Victor" -> 3, "Carla" -> 10, "Reano" -> 25)
                                                  //> points  : scala.collection.immutable.Map[String,Int] = Map(Victor -> 3, Carla
                                                  //|  -> 10, Reano -> 25)
  points("Victor")                                //> res0: Int = 3
  points.values                                   //> res1: Iterable[Int] = MapLike(3, 10, 25)
  points.keys                                     //> res2: Iterable[String] = Set(Victor, Carla, Reano)
  points + "Robert" -> 12                         //> res3: (String, Int) = (Map(Victor -> 3, Carla -> 10, Reano -> 25)Robert,12)
                                                  //| 
  points += "Robert" -> 12
}