package classes

import ChecksumAccumulator.calculate

class ChecksumApp2 extends App {
	for(sample <- List("Uga", "Buga")) 
	  println(sample + ": " + calculate(sample))
}