package ml.jinggo.util

import org.springframework.security.crypto.password.{PasswordEncoder, StandardPasswordEncoder}

/**
  * SpringSecurity加密工具 PasswordEncoder
  * Created by gz12 on 2018-07-09.
  */
object SecurityUtil {
  /** 秘钥*/
  private final val SITE_WIDE_SECRET: String = "jingo"

  private final val encoder: PasswordEncoder = new StandardPasswordEncoder(SITE_WIDE_SECRET);

  /**
    * description 采用SHA-256算法，迭代1024次，使用一个密钥(site-wide secret)以及8位随机盐对原密码进行加密
    * @param rawPassword
    * @return 80位加密后的密码
    */
  def encrypt(rawPassword: String) = encoder.encode(rawPassword)

  /**
    * description 验证密码和加密后密码是否一致
    * @param rawPassword 明文密码
    * @param password 加密后的密码
    * @return
    */
  def matchs(rawPassword: String, password: String): Boolean = {
    if (rawPassword == null && password == null) {
      return true
    }
    encoder.matches(rawPassword, password)
  }
}
