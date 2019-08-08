package com.cn.ben.utile

import java.util

import scala.collection.mutable.ListBuffer

/**
  * @Auther: ljh
  * @Date: 2019/8/8 15:05
  * @Description:
  */
object ListStat {
  def demoStat(map :java.util.Map[java.lang.String,java.lang.Long]): String ={
//    list.stream().map(x -> x)
    //       map.forEach((k,v) -> {
    //       });

    val ben: Array[Array[Int]] =  Array.ofDim[Int](10, 10)

//    println(ben(1)(1))
    import scala.collection.JavaConversions._
     map.foreach(x => {
       x._1.split(",")(0) match{
       case "(1"  =>
         ben(0)(1) = 1
         ben(1)(0) = 1
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(1) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(1) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(1) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(1) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(1) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(1) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(1) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(1) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(1) = x._2.toInt
           case _ =>
         }
       case "(2" =>
         ben(0)(2) = 2
         ben(2)(0) = 2
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(2) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(2) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(2) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(2) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(2) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(2) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(2) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(2) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(2) = x._2.toInt
           case _ =>
         }
       case "(3" =>
         ben(0)(3) = 3
         ben(3)(0) = 3
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(3) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(3) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(3) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(3) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(3) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(3) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(3) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(3) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(3) = x._2.toInt
           case _ =>
         }
       case "(4" =>
         ben(0)(4) = 4
         ben(4)(0) = 4
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(4) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(4) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(4) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(4) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(4) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(4) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(4) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(4) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(4) = x._2.toInt
           case _ =>
         }
       case "(5" =>
         ben(0)(5) = 5
         ben(5)(0) = 5
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(5) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(5) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(5) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(5) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(5) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(5) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(5) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(5) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(5) = x._2.toInt
           case _ =>
         }
       case "(6" =>
         ben(0)(6) = 6
         ben(6)(0) = 6
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(6) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(6) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(6) = x._2.toInt
           case "4)" =>
             ben(4)(0) = 4
             ben(4)(6) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(6) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(6) = x._2.toInt
           case "7)" =>
             ben(7)(0) = 7
             ben(7)(6) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(6) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(6) = x._2.toInt
           case _ =>
         }
       case "(7" =>
         ben(0)(7) = 7
         ben(7)(0) = 7
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(7) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(7) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(7) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(7) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(7) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(7) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(7) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(7) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(7) = x._2.toInt
           case _ =>
         }
       case "(8" =>
         ben(0)(8) = 8
         ben(8)(0) = 8
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(8) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(8) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(8) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(8) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(8) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(8) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(8) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(8) = x._2.toInt
           case "9)" =>
//             ben(9)(0) = 9
             ben(9)(8) = x._2.toInt
           case _ =>
         }
       case "(9" =>
         ben(0)(9) = 9
         ben(9)(0) = 9
         x._1.split(",")(1) match{
           case "1)" =>
             ben(1)(9) = x._2.toInt
           case "2)" =>
//             ben(2)(0) = 2
             ben(2)(9) = x._2.toInt
           case "3)" =>
//             ben(3)(0) = 3
             ben(3)(9) = x._2.toInt
           case "4)" =>
//             ben(4)(0) = 4
             ben(4)(9) = x._2.toInt
           case "5)" =>
//             ben(5)(0) = 5
             ben(5)(9) = x._2.toInt
           case "6)" =>
//             ben(6)(0) = 6
             ben(6)(9) = x._2.toInt
           case "7)" =>
//             ben(7)(0) = 7
             ben(7)(9) = x._2.toInt
           case "8)" =>
//             ben(8)(0) = 8
             ben(8)(9) = x._2.toInt
           case "9)" =>
             ben(9)(0) = 9
             ben(9)(9) = x._2.toInt
           case _ =>
         }
       case _ =>

       }
     })
    for (i <- 0 to 9) {
      for ( j <- 0 to 9) {
        print(" " + ben(i)(j));
      }
      println();
    }
//    map.forEach((k,v) -> {
//    });
    map.toString
  ""
  }

  def main(args: Array[String]): Unit = {
    val ben: Array[Array[Int]] =  Array.ofDim[Int](10, 10)
    //第一行 和第一列
    ben(0)(1) = 1
    ben(1)(0) = 1
    //第2行 和第2列
    ben(0)(2) = 2
    ben(2)(0) = 2
    //第3行 和第3列
    ben(0)(3) = 3
    ben(3)(0) = 3
    //第4行 和第4列
    ben(0)(4) = 4
    ben(4)(0) = 4
    //第5行 和第5列
    ben(0)(5) = 5
    ben(5)(0) = 5
    //第6行 和第6列
    ben(0)(6) = 6
    ben(6)(0) = 6
    //第7行 和第7列
    ben(0)(7) = 7
    ben(7)(0) = 7
    //第8行 和第8列
    ben(0)(8) = 8
    ben(8)(0) = 8
    //第9行 和第9列
    ben(0)(9) = 9
    ben(9)(0) = 9
    for (i <- 0 to 9) {
      for ( j <- 0 to 9) {
        print(" " + ben(i)(j));
      }
      println();
    }
  }
}
