package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAcpPlatformPlatformServletInfo._

case class ComAdobeGraniteAcpPlatformPlatformServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAcpPlatformPlatformServletProperties])

object ComAdobeGraniteAcpPlatformPlatformServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAcpPlatformPlatformServletInfoCodecJson: CodecJson[ComAdobeGraniteAcpPlatformPlatformServletInfo] = CodecJson.derive[ComAdobeGraniteAcpPlatformPlatformServletInfo]
  implicit val ComAdobeGraniteAcpPlatformPlatformServletInfoDecoder: EntityDecoder[ComAdobeGraniteAcpPlatformPlatformServletInfo] = jsonOf[ComAdobeGraniteAcpPlatformPlatformServletInfo]
  implicit val ComAdobeGraniteAcpPlatformPlatformServletInfoEncoder: EntityEncoder[ComAdobeGraniteAcpPlatformPlatformServletInfo] = jsonEncoderOf[ComAdobeGraniteAcpPlatformPlatformServletInfo]
}
