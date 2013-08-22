package traits

object S01traits {
  println("traits")                               //> traits
  
  val q = new FifoQueue                           //> q  : traits.FifoQueue = FifoQueue()
  q put 1
  q put -3
  q put 5
  q                                               //> res0: traits.FifoQueue = FifoQueue(1,-3,5)
  q.get                                           //> res1: Int = 1
  q                                               //> res2: traits.FifoQueue = FifoQueue(-3,5)
  
  val q2 = new FifoQueue with Filtering with Transforming {
  	override val filter: Int => Boolean = _ > 0
  	override val transform: Int => Int = _ + 2
  }                                               //> q2  : traits.FifoQueue with traits.Filtering with traits.Transforming = Fifo
                                                  //| Queue()
  q2 put 1
  q2 put -3
  q2 put 5
  q2                                              //> res3: traits.FifoQueue with traits.Filtering with traits.Transforming = Fifo
                                                  //| Queue(3,7)
  q2.get                                          //> res4: Int = 3
  q2                                              //> res5: traits.FifoQueue with traits.Filtering with traits.Transforming = Fifo
                                                  //| Queue(7)
                                                  
  val q3 = new IncreasingDoublingQueue            //> q3  : traits.IncreasingDoublingQueue = FifoQueue()
  q3 put 3
  q3                                              //> res6: traits.IncreasingDoublingQueue = FifoQueue(6)
  
  val q4 = new DoublingIncreasingQueue            //> q4  : traits.DoublingIncreasingQueue = FifoQueue()
  q4 put 3
  q4                                              //> res7: traits.DoublingIncreasingQueue = FifoQueue(4)
  
}