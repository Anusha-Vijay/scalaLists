package main.scala.lists

/**
  * Created by ashankar on 1/21/17.
  */
trait IList[T] {
  def value: T

  def next: IList[T]

  def isEmpty: Boolean

  def tail: T

  def head: T

  def union(secondList: IList[T]): IList[T]

  override def toString: String = super.toString

  //  def add[S >: T](item:S):IList[S]

}