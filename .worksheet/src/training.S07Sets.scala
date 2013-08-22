package training

object S07Sets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

   var team = Set("Tomas", "Denis", "Julia");System.out.println("""team  : scala.collection.immutable.Set[String] = """ + $show(team ));$skip(17); val res$0 = 
   team("Tomas");System.out.println("""res0: Boolean = """ + $show(res$0));$skip(25); val res$1 = 
   
   
   team("Been");System.out.println("""res1: Boolean = """ + $show(res$1));$skip(17); val res$2 = 
   team + "Been";System.out.println("""res2: scala.collection.immutable.Set[String] = """ + $show(res$2));$skip(18); 
   team += "Bean"
   
   import collection.mutable.Set;$skip(83); 
   val fteam = Set("Tomas", "Denis", "Julia");System.out.println("""fteam  : scala.collection.mutable.Set[String] = """ + $show(fteam ));$skip(18); val res$3 = 
   fteam + "Bean";System.out.println("""res3: scala.collection.mutable.Set[String] = """ + $show(res$3));$skip(19); val res$4 = 
   fteam += "Bean";System.out.println("""res4: training.S07Sets.fteam.type = """ + $show(res$4));$skip(19); val res$5 = 
   fteam += "Bean";System.out.println("""res5: training.S07Sets.fteam.type = """ + $show(res$5))}
}
