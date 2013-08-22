package training

object S03Loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 

  // loops
  
  val args = Array("Hello", "Haliho", "Hi");System.out.println("""args  : Array[String] = """ + $show(args ));$skip(16); 
  
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(61); ;
  while(i < args.length) {
  	println(args(i))
  	i += 1
  };$skip(103); 
                                                  
  for(i <- 0 to args.length -1)
  	println(args(i));$skip(31); 
  
  for(s <- args) println(s);$skip(147); 
                    
  // foreach + function literal
                                                  
  args.foreach( (s:String) => println(s) );$skip(85); 
                                                  
  args.foreach( s => println(s) );$skip(32); 
  
  args.foreach( println(_) );$skip(27); 
  
  args.foreach(println);$skip(88); 
                                                  
  val prt = (s:String) => println(s);System.out.println("""prt  : String => Unit = """ + $show(prt ));$skip(20); 
  args.foreach(prt);$skip(112); 
                                                  
  def prt2(prefix:String ) = (s:String) => println(prefix+s);System.out.println("""prt2: (prefix: String)String => Unit""");$skip(30); 
  args.foreach(prt2("arg: "))}
  
}
