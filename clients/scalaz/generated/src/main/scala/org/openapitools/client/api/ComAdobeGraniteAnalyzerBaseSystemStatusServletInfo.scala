package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo._

case class ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAnalyzerBaseSystemStatusServletProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoCodecJson: CodecJson[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo] = CodecJson.derive[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo]
  implicit val ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoDecoder: EntityDecoder[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo] = jsonOf[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo]
  implicit val ComAdobeGraniteAnalyzerBaseSystemStatusServletInfoEncoder: EntityEncoder[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo] = jsonEncoderOf[ComAdobeGraniteAnalyzerBaseSystemStatusServletInfo]
}
