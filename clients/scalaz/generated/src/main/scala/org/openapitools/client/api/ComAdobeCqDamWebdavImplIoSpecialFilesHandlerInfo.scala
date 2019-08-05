package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo._

case class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties])

object ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoCodecJson: CodecJson[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = CodecJson.derive[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo]
  implicit val ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoDecoder: EntityDecoder[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = jsonOf[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo]
  implicit val ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfoEncoder: EntityEncoder[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo] = jsonEncoderOf[ComAdobeCqDamWebdavImplIoSpecialFilesHandlerInfo]
}
