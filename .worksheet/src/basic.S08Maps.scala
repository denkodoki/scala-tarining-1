package basic

object S08Maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 
	var points = Map("Victor" -> 3, "Carla" -> 10, "Reano" -> 25);System.out.println("""points  : scala.collection.immutable.Map[String,Int] = """ + $show(points ));$skip(19); val res$0 = 
  points("Victor");System.out.println("""res0: Int = """ + $show(res$0));$skip(16); val res$1 = 
  points.values;System.out.println("""res1: Iterable[Int] = """ + $show(res$1));$skip(14); val res$2 = 
  points.keys;System.out.println("""res2: Iterable[String] = """ + $show(res$2));$skip(26); val res$3 = 
  points + "Robert" -> 12;System.out.println("""res3: (String, Int) = """ + $show(res$3));$skip(27); 
  points += "Robert" -> 12}
}
