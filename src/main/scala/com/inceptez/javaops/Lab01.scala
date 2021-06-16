package com.inceptez.javaops

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf


object Lab01 {
  
  def main(args:Array[String])=
  {
    val sc = new SparkContext(new SparkConf().setAppName("Lab01").setMaster("local"))
    
    val rdd = sc.textFile("file:/home/hduser/test.txt")
    
    rdd.foreach(println)
    
    println("Welcome to scala...")
    
  }
  
}