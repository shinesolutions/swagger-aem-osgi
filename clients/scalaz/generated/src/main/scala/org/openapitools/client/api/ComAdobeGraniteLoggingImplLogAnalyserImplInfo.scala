package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteLoggingImplLogAnalyserImplInfo._

case class ComAdobeGraniteLoggingImplLogAnalyserImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteLoggingImplLogAnalyserImplProperties])

object ComAdobeGraniteLoggingImplLogAnalyserImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteLoggingImplLogAnalyserImplInfoCodecJson: CodecJson[ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = CodecJson.derive[ComAdobeGraniteLoggingImplLogAnalyserImplInfo]
  implicit val ComAdobeGraniteLoggingImplLogAnalyserImplInfoDecoder: EntityDecoder[ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = jsonOf[ComAdobeGraniteLoggingImplLogAnalyserImplInfo]
  implicit val ComAdobeGraniteLoggingImplLogAnalyserImplInfoEncoder: EntityEncoder[ComAdobeGraniteLoggingImplLogAnalyserImplInfo] = jsonEncoderOf[ComAdobeGraniteLoggingImplLogAnalyserImplInfo]
}
