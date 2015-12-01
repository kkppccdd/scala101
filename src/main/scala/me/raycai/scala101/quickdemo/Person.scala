package me.raycai.scala101.quickdemo

trait Person {
  def first:String
  def last:String
}

case class Student(first:String,last:String) extends Person
case class Teacher(first:String,last:String) extends Person
case class SuperHero(first:String,last:String) extends Person