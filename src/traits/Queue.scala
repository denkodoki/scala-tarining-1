package traits

import scala.collection.mutable.ArrayBuffer

abstract class Queue {
	def put(e: Int): Unit
	def get(): Int
}

class FifoQueue extends Queue {
  private val queue = new ArrayBuffer[Int]
  
  def put(e: Int): Unit = queue+= e
  def get(): Int = queue.remove(0);
  
  override def toString = "FifoQueue(" + queue.mkString(",") + ")"
}

trait Filtering extends Queue {
  val filter: Int => Boolean
  abstract override def put(e: Int): Unit = if (filter(e)) super.put(e)
}

trait Transforming extends Queue {
  val transform: Int => Int
  abstract override def put(e: Int): Unit = super.put(transform(e))
}

trait Increasing extends Transforming {
  override val transform: Int => Int = _ + 1
}

trait Doubling extends Transforming {
  override val transform: Int => Int = _ * 2
}

class IncreasingDoublingQueue extends FifoQueue with Increasing with Doubling 

class DoublingIncreasingQueue extends FifoQueue with Doubling with Increasing

