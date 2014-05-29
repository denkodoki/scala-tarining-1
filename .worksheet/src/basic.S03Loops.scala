package basic

object S03Loops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 

  // loops
  
  val args = Array("Hello", "Haliho", "Hi");System.out.println("""args  : Array[String] = """ + $show(args ));$skip(17); 
  
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(61); ;
  while(i < args.length) {
  	println(args(i))
  	i += 1
  };$skip(104); 
                                                  
  for(i <- 0 to args.length -1)
  	println(args(i));$skip(32); 
  
  for(s <- args) println(s);$skip(149); 
                    
  // foreach + function literal
                                                  
  args.foreach( (s:String) => println(s) );$skip(86); 
                                                  
  args.foreach( s => println(s) );$skip(33); 
  
  args.foreach( println(_) );$skip(28); 
  
  args.foreach(println);$skip(89); 
                                                  
  val prt = (s:String) => println(s);System.out.println("""prt  : String => Unit = """ + $show(prt ));$skip(20); 
  args.foreach(prt);$skip(113); 
                                                  
  def prt2(prefix:String ) = (s:String) => println(prefix+s);System.out.println("""prt2: (prefix: String)String => Unit""");$skip(54); 
  val prt3: Function1[String, Unit] = prt2("Detto: ");System.out.println("""prt3  : String => Unit = """ + $show(prt3 ));$skip(21); 
  args.foreach(prt3)}
  
}
