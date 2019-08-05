package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo._

case class ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties])

object ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo]
  implicit val ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = jsonOf[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo]
  implicit val ComAdobeGraniteLoggingImplLogErrorHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteLoggingImplLogErrorHealthCheckInfo]
}
