package ml.jinggo.util

import java.text.SimpleDateFormat
import java.util.Date

/**
  * 时间工具
  * Created by gz12 on 2018-07-09.
  */
object DateUtil {
  
  private final val partternAll = "yyyy-MM-dd: HH:mm:ss"

  private final val partternPart = "yyyy-MM-dd"

  /**
    * description 获取格式化后的当前时间yyyy-MM-dd
    * @return
    */
  def getDateString(): String = new SimpleDateFormat(partternPart).format(new Date)

  /**
    * description 获取特定格式的当前时间
    * @return
    */
  def getDateTimeString(parttern: String): String = new SimpleDateFormat(parttern).format(new Date)

  /**
    * description 获取当前时间yyyy-MM-dd: HH:mm:ss
    * @return
    */
  def getDateTimeString(): String = new SimpleDateFormat(partternAll).format(new Date)

  /**
    * description 获取特定格式的当前时间 yyyy-MM-dd
    * @return
    */
  def getDate(): Date = new SimpleDateFormat(partternPart).parse(getDateString)

  /**
    * description 获取特定格式的当前时间 yyyy-MM-dd: HH:mm:ss
    * @return
    */
  def getDateTime: Date = new SimpleDateFormat(partternAll).parse(getDateTimeString)

  /**
    * description 获取当前时间Long类型
    * @return
    */
  def getLongDateTime(): Long = new Date().getTime
}
