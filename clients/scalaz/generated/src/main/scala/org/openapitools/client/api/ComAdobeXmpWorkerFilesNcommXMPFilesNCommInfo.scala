package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo._

case class ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo {
  import DateTimeCodecs._

  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoCodecJson: CodecJson[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = CodecJson.derive[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo]
  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoDecoder: EntityDecoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = jsonOf[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo]
  implicit val ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfoEncoder: EntityEncoder[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo] = jsonEncoderOf[ComAdobeXmpWorkerFilesNcommXMPFilesNCommInfo]
}
