package com.arcusys.learn.aop

import java.lang.reflect.{ InvocationHandler, Method }
import scala.reflect.runtime.{ universe => ru }
/**
 * Created by Iliya on 04.02.14.
 */

class ManagedComponentProxy(val target: AnyRef) extends InvocationHandler with Interceptor {
  def invoke(proxy: AnyRef, m: Method, args: Array[AnyRef]): AnyRef = {
    //invoke(Invocation(m, args, target))
    //ru.in
    m
  }

  def invoke(invocation: Invocation): AnyRef = {
    invocation.invoke
  }
}
