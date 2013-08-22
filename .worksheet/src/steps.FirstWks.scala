package steps

object FirstWks {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(126); 

  // define  functions
  
  def max(x:Int, y:Int): Int = {
  	return if (x > y) x else y
  };System.out.println("""max: (x: Int, y: Int)Int""");$skip(14); val res$0 = 
  
  max(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(51); 
  
  def max2 (x:Int, y:Int) = if (x > y) x else y;System.out.println("""max2: (x: Int, y: Int)Int""");$skip(15); val res$1 = 
  
  max2(3,5);System.out.println("""res1: Int = """ + $show(res$1));$skip(51); 
  
  def max3 (x:Int, y:Int) {if (x > y) x else y};System.out.println("""max3: (x: Int, y: Int)Unit""");$skip(15); 
  
  max3(3,5);$skip(126); 
  
  def smax(a:Int, b:Int) = {
    def aGb(a:Int, b:Int) = s"$a is greather than $b"
    if (a>b) aGb(a,b) else aGb(b,a)
  };System.out.println("""smax: (a: Int, b: Int)String""");$skip(15); val res$2 = 
  
  smax(3,5);System.out.println("""res2: String = """ + $show(res$2));$skip(64); 
  
  
  // loops
  
  val args = Array("Hello", "Haliho", "Hi");System.out.println("""args  : Array[String] = """ + $show(args ));$skip(16); 
  
  var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(61); ;
  while(i < args.length) {
  	println(args(i))
  	i += 1
  };$skip(103); 
                                                  
  for(i <- 0 to args.length -1)
  	println(args(i));$skip(31); 
  
  for(s <- args) println(s);$skip(137); 
                    
  // function literal
                                                  
  args.foreach( (s:String) => println(s) );$skip(85); 
                                                  
  args.foreach( s => println(s) );$skip(32); 
  
  args.foreach( println(_) );$skip(27); 
  
  args.foreach(println)}
                                                  
}
