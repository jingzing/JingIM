package ml.jinggo.entity

import scala.beans.BeanProperty

/**
  * 添加好友、群组信息
  * Created by gz12 on 2018-07-11.
  */
class Add {

  //好友列表id或群组id
  @BeanProperty var groupId: Integer = _
  //附言
  @BeanProperty var remark: String = _
  //类型，好友或群组
  @BeanProperty var Type: Int = _

  override def toString = "groupId=" + groupId + ", remark=" + remark + ", Type=" + Type
}
