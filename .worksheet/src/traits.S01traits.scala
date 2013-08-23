package traits

object S01traits {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(55); 
  println("traits");$skip(28); 
  
  val q = new FifoQueue;System.out.println("""q  : traits.FifoQueue = """ + $show(q ));$skip(10); 
  q put 1;$skip(11); 
  q put -3;$skip(10); 
  q put 5;$skip(4); val res$0 = 
  q;System.out.println("""res0: traits.FifoQueue = """ + $show(res$0));$skip(8); val res$1 = 
  q.get;System.out.println("""res1: Int = """ + $show(res$1));$skip(4); val res$2 = 
  q;System.out.println("""res2: traits.FifoQueue = """ + $show(res$2));$skip(161); 
  
  val q2 = new FifoQueue with Filtering with Transforming {
  	override val filter: Int => Boolean = _ > 0
  	override val transform: Int => Int = _ + 2
  };System.out.println("""q2  : traits.FifoQueue with traits.Filtering with traits.Transforming = """ + $show(q2 ));$skip(11); 
  q2 put 1;$skip(12); 
  q2 put -3;$skip(11); 
  q2 put 5;$skip(5); val res$3 = 
  q2;System.out.println("""res3: traits.FifoQueue with traits.Filtering with traits.Transforming = """ + $show(res$3));$skip(9); val res$4 = 
  q2.get;System.out.println("""res4: Int = """ + $show(res$4));$skip(5); val res$5 = 
  q2;System.out.println("""res5: traits.FifoQueue with traits.Filtering with traits.Transforming = """ + $show(res$5));$skip(91); 
                                                  
  val q3 = new IncreasingDoublingQueue;System.out.println("""q3  : traits.IncreasingDoublingQueue = """ + $show(q3 ));$skip(11); 
  q3 put 3;$skip(5); val res$6 = 
  q3;System.out.println("""res6: traits.IncreasingDoublingQueue = """ + $show(res$6));$skip(43); 
  
  val q4 = new DoublingIncreasingQueue;System.out.println("""q4  : traits.DoublingIncreasingQueue = """ + $show(q4 ));$skip(11); 
  q4 put 3;$skip(5); val res$7 = 
  q4;System.out.println("""res7: traits.DoublingIncreasingQueue = """ + $show(res$7))}
}
