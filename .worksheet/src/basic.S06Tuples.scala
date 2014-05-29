	package basic

object S06Tuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 
  var pair = (1001,"Night", false);System.out.println("""pair  : (Int, String, Boolean) = """ + $show(pair ));$skip(10); val res$0 = 
  pair._1;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  pair._2;System.out.println("""res1: String = """ + $show(res$1));$skip(10); val res$2 = 
  pair._3;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(37); 
  
  val p: (Int, String) = (3,"B");System.out.println("""p  : (Int, String) = """ + $show(p ));$skip(45); 
  val p2: Tuple2[Int, String] = (333, "BBB");System.out.println("""p2  : (Int, String) = """ + $show(p2 ));$skip(25); 
  val (i,s) = (1, "Two");System.out.println("""i  : Int = """ + $show(i ));System.out.println("""s  : String = """ + $show(s ));$skip(27); 
  
  pair = (1, "A", true);$skip(25); 
  val speci = (1 -> "A");System.out.println("""speci  : (Int, String) = """ + $show(speci ))}
}
