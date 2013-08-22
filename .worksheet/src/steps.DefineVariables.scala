package steps

object DefineVariables {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(87); 

  // define variables
  
	val s: String = "Hi";System.out.println("""s  : String = """ + $show(s ));$skip(16); 
   
  var n = 1;System.out.println("""n  : Int = """ + $show(n ))}
  
}
