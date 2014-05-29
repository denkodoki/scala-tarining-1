package basic

object S05Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  val l = List(1, 2, 3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(9); val res$0 = 
  4 :: l;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(4); val res$1 = 
  l;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(24); val res$2 = 
  1 :: 2 :: 3 :: List();System.out.println("""res2: List[Int] = """ + $show(res$2));$skip(21); val res$3 = 
  1 :: 2 :: 3 :: Nil;System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(36); 
  
  val luj = l ::: List("a", "b");System.out.println("""luj  : List[Any] = """ + $show(luj ));$skip(32); val res$4 = 
  luj.map(x => 10 + x.toString);System.out.println("""res4: List[String] = """ + $show(res$4));$skip(27); 
  
  val List(a, b, c) = l;System.out.println("""a  : Int = """ + $show(a ));System.out.println("""b  : Int = """ + $show(b ));System.out.println("""c  : Int = """ + $show(c ));$skip(12); val res$5 = 
  
  l :+ 1;System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(25); 
  val l2 = List(4, 5, 6);System.out.println("""l2  : List[Int] = """ + $show(l2 ));$skip(11); val res$6 = 
  l ::: l2;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(20); val res$7 = 
  
  l.map(10 + _);System.out.println("""res7: List[Int] = """ + $show(res$7));$skip(4); val res$8 = 
  l;System.out.println("""res8: List[Int] = """ + $show(res$8));$skip(72); val res$9 = 
  
  List(List(1,2,3), List(1,2,3, 7), List(8,9)).flatMap(_.map(_*10));System.out.println("""res9: List[Int] = """ + $show(res$9));$skip(16); val res$10 = 
  
  l.drop(1);System.out.println("""res10: List[Int] = """ + $show(res$10));$skip(12); val res$11 = 
  l.reverse;System.out.println("""res11: List[Int] = """ + $show(res$11));$skip(9); val res$12 = 

  l(1);System.out.println("""res12: Int = """ + $show(res$12));$skip(13); val res$13 = 
  l.apply(1);System.out.println("""res13: Int = """ + $show(res$13));$skip(9); val res$14 = 
  l.head;System.out.println("""res14: Int = """ + $show(res$14));$skip(9); val res$15 = 
  l.last;System.out.println("""res15: Int = """ + $show(res$15));$skip(9); val res$16 = 
  l.tail;System.out.println("""res16: List[Int] = """ + $show(res$16));$skip(9); val res$17 = 
  l.init;System.out.println("""res17: List[Int] = """ + $show(res$17));$skip(36); 

  def isEven(i: Int) = i % 2 == 0;System.out.println("""isEven: (i: Int)Boolean""");$skip(18); val res$18 = 
  l.count(isEven);System.out.println("""res18: Int = """ + $show(res$18));$skip(19); val res$19 = 
  l.exists(isEven);System.out.println("""res19: Boolean = """ + $show(res$19));$skip(18); val res$20 = 
  l filter isEven;System.out.println("""res20: List[Int] = """ + $show(res$20));$skip(18); val res$21 = 
  l forall isEven;System.out.println("""res21: Boolean = """ + $show(res$21));$skip(16); val res$22 = 
  l map {_ + 1};System.out.println("""res22: List[Int] = """ + $show(res$22));$skip(20); val res$23 = 
  l.sortWith(_ > _);System.out.println("""res23: List[Int] = """ + $show(res$23));$skip(19); val res$24 = 
  l.groupBy(_ % 2);System.out.println("""res24: scala.collection.immutable.Map[Int,List[Int]] = """ + $show(res$24));$skip(25); 
  val l10 = List(1, "1");System.out.println("""l10  : List[Any] = """ + $show(l10 ))}
}
