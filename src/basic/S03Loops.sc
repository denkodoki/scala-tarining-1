package basic

object S03Loops {

  // loops
  
  val args = Array("Hello", "Haliho", "Hi")       //> args  : Array[String] = Array(Hello, Haliho, Hi)
  
  var i = 0;                                      //> i  : Int = 0
  while(i < args.length) {
  	println(args(i))
  	i += 1
  }                                               //> Hello
                                                  //| Haliho
                                                  //| Hi
                                                  
  for(i <- 0 to args.length -1)
  	println(args(i))                          //> Hello
                                                  //| Haliho
                                                  //| Hi
  
  for(s <- args) println(s)                       //> Hello
                                                  //| Haliho
                                                  //| Hi
                    
  // foreach + function literal
                                                  
  args.foreach( (s:String) => println(s) )        //> Hello
                                                  //| Haliho
                                                  //| Hi
                                                  
  args.foreach( s => println(s) )                 //> Hello
                                                  //| Haliho
                                                  //| Hi
  
  args.foreach( println(_) )                      //> Hello
                                                  //| Haliho
                                                  //| Hi
  
  args.foreach(println)                           //> Hello
                                                  //| Haliho
                                                  //| Hi
                                                  
  val prt = (s:String) => println(s)              //> prt  : String => Unit = <function1>
  args.foreach(prt)                               //> Hello
                                                  //| Haliho
                                                  //| Hi
                                                  
  def prt2(prefix:String ) = (s:String) => println(prefix+s)
                                                  //> prt2: (prefix: String)String => Unit
  args.foreach(prt2("arg: "))                     //> arg: Hello
                                                  //| arg: Haliho
                                                  //| arg: Hi
  
}