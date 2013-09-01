package controlabstr

object S03ByNameParams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("By-name parameters");$skip(35); 
  
  var assertionsEnabled = true;System.out.println("""assertionsEnabled  : Boolean = """ + $show(assertionsEnabled ));$skip(118); 

  def assert1(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError;System.out.println("""assert1: (predicate: () => Boolean)Unit""");$skip(47); 
      
  // ugly syntax
  assert1(() => 5 > 3);$skip(147); 
      
  // using by-name parameter
  def assert2(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError;System.out.println("""assert2: (predicate: => Boolean)Unit""");$skip(40); 
     
  // nice syntax
  assert2(5 > 3)}
   
}
