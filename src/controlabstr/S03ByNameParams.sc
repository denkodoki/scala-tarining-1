package controlabstr

object S03ByNameParams {
  println("By-name parameters")                   //> By-name parameters
  
  var assertionsEnabled = true                    //> assertionsEnabled  : Boolean = true

  def assert1(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError                    //> assert1: (predicate: () => Boolean)Unit
      
  // ugly syntax
  assert1(() => 5 > 3)
      
  // using by-name parameter
  def assert2(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError                    //> assert2: (predicate: => Boolean)Unit
     
  // nice syntax
  assert2(5 > 3)
   
}