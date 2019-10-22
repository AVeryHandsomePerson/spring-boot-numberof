package com.cn.ben.utile

import com.cn.ben.utile.ListStat.ben
import org.springframework.util.StringUtils

/**
  * @Auther: ljh
  * @Date: 2019/8/9 09:47
  * @Description:
  */
class MatrxCreate {
  //初始化矩阵
  {
    for (i <- 1 to ben.length-1){
    ben(0)(i) = i.toString
    ben(i)(0) = i.toString
      if(i == ben.length -1){
        ben(0)(i) = "合计"
        ben(i)(0) = "合计"
      }
    }
}
  def demoStat(map :java.util.Map[java.lang.String,java.lang.Long]): String ={
    import scala.collection.JavaConversions._
    map.foreach(x => {
      x._1.split(",")(0) match{
        case "(1"  =>
          toMatrx(x._1.split(",")(1),x._2.toString,1)
        case "(2" =>
          toMatrx(x._1.split(",")(1),x._2.toString,2)
        case "(3" =>
          toMatrx(x._1.split(",")(1),x._2.toString,3)
        case "(4" =>
          toMatrx(x._1.split(",")(1),x._2.toString,4)
        case "(5" =>
          toMatrx(x._1.split(",")(1),x._2.toString,5)
        case "(6" =>
          toMatrx(x._1.split(",")(1),x._2.toString,6)
        case "(7" =>
          toMatrx(x._1.split(",")(1),x._2.toString,7)
        case "(8" =>
          toMatrx(x._1.split(",")(1),x._2.toString,8)
        case "(9" =>
          toMatrx(x._1.split(",")(1),x._2.toString,9)
        case "(10" =>
          toMatrx(x._1.split(",")(1),x._2.toString,10)
        case "(11" =>
          toMatrx(x._1.split(",")(1),x._2.toString,11)
        case "(12" =>
          toMatrx(x._1.split(",")(1),x._2.toString,12)
        case "(13" =>
          toMatrx(x._1.split(",")(1),x._2.toString,13)
        case "(14" =>
          toMatrx(x._1.split(",")(1),x._2.toString,14)
        case _ =>
      }
    })
    //累加行
    for (i <- 1 to ben.length-2) {
      ben(i)(ben.length-1) = "0"
      for ( j <- 1 to ben.length-2) {
        if(!StringUtils.isEmpty(ben(i)(j))){
          ben(i)(ben.length-1) = (ben(i)(ben.length-1).toInt +ben(i)(j).toInt).toString
        }
      }
    }
    //累加列
    for (i <- 1 to ben.length-1) {
      ben(ben.length-1)(i) = "0"
      for ( j <- 1 to ben.length-2) {
        if(!StringUtils.isEmpty(ben(j)(i))){
          ben(ben.length-1)(i) = (ben(ben.length-1)(i).toInt +ben(j)(i).toInt).toString
        }
      }
    }
    val sben = new StringBuffer()
    for (i <- 0 to ben.length-1) {
      for ( j <- 0 to ben.length-1) {
        if(j == ben.length-1){
          sben.append(ben(i)(j)).append("\n")
        }else {
          sben.append(ben(i)(j)).append(",")
        }
      }
    }
    sben.toString.replaceAll("null", "0")
  }
  def toMatrx(mat:String,num:String,matrxxb:Int):Unit = {
    mat match {
      case "1)" =>
        ben(1)(matrxxb) = num
      case "2)" =>
        ben(2)(matrxxb) = num
      case "3)" =>
        ben(3)(matrxxb) = num
      case "4)" =>
        ben(4)(matrxxb) = num
      case "5)" =>
        ben(5)(matrxxb) = num
      case "6)" =>
        ben(6)(matrxxb) = num
      case "7)" =>
        ben(7)(matrxxb) = num
      case "8)" =>
        ben(8)(matrxxb) = num
      case "9)" =>
        ben(9)(matrxxb) = num
      case "10)" =>
        ben(10)(matrxxb) = num
      case "11)" =>
        ben(11)(matrxxb) = num
      case "12)" =>
        ben(12)(matrxxb) = num
      case "13)" =>
        ben(13)(matrxxb) = num
      case "14)" =>
        ben(14)(matrxxb) = num
      case _ =>
    }
  }
}
