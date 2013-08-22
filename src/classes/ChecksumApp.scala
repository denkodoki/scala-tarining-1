package classes

import ChecksumAccumulator.calculate

object ChecksumApp {
	def main(args: Array[String]) {
	  for(arg <- args) println(arg + ": " + calculate(arg))
	}
}