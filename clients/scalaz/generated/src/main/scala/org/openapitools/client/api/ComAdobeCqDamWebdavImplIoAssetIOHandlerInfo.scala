package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo._

case class ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqDamWebdavImplIoAssetIOHandlerProperties])

object ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoCodecJson: CodecJson[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = CodecJson.derive[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo]
  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoDecoder: EntityDecoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = jsonOf[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo]
  implicit val ComAdobeCqDamWebdavImplIoAssetIOHandlerInfoEncoder: EntityEncoder[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo] = jsonEncoderOf[ComAdobeCqDamWebdavImplIoAssetIOHandlerInfo]
}
