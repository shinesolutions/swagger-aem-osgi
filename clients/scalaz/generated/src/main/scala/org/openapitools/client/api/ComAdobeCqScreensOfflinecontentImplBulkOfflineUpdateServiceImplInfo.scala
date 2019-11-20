package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo._

case class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties])

object ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoCodecJson: CodecJson[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = CodecJson.derive[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo]
  implicit val ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoDecoder: EntityDecoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = jsonOf[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo]
  implicit val ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfoEncoder: EntityEncoder[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo] = jsonEncoderOf[ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo]
}