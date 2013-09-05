package basic

object S07Sets {

   var team = Set("Tomas", "Denis", "Julia")      //> team  : scala.collection.immutable.Set[String] = Set(Tomas, Denis, Julia)
   team("Tomas")                                  //> res0: Boolean = true
   
   
   team("Been")                                   //> res1: Boolean = false
   team + "Been"                                  //> res2: scala.collection.immutable.Set[String] = Set(Tomas, Denis, Julia, Been
                                                  //| )
   team += "Bean"
   
   import collection.mutable.Set
   val fteam = Set("Tomas", "Denis", "Julia")     //> fteam  : scala.collection.mutable.Set[String] = Set(Tomas, Julia, Denis)
   fteam + "Bean"                                 //> res3: scala.collection.mutable.Set[String] = Set(Tomas, Bean, Julia, Denis)
                                                  //| 
   fteam += "Bean"                                //> res4: basic.S07Sets.fteam.type = Set(Tomas, Bean, Julia, Denis)
   fteam += "Bean"                                //> res5: basic.S07Sets.fteam.type = Set(Tomas, Bean, Julia, Denis)
}