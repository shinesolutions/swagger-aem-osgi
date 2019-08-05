package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteInfocollectorInfoCollectorInfo._

case class ComAdobeGraniteInfocollectorInfoCollectorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteInfocollectorInfoCollectorProperties])

object ComAdobeGraniteInfocollectorInfoCollectorInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteInfocollectorInfoCollectorInfoCodecJson: CodecJson[ComAdobeGraniteInfocollectorInfoCollectorInfo] = CodecJson.derive[ComAdobeGraniteInfocollectorInfoCollectorInfo]
  implicit val ComAdobeGraniteInfocollectorInfoCollectorInfoDecoder: EntityDecoder[ComAdobeGraniteInfocollectorInfoCollectorInfo] = jsonOf[ComAdobeGraniteInfocollectorInfoCollectorInfo]
  implicit val ComAdobeGraniteInfocollectorInfoCollectorInfoEncoder: EntityEncoder[ComAdobeGraniteInfocollectorInfoCollectorInfo] = jsonEncoderOf[ComAdobeGraniteInfocollectorInfoCollectorInfo]
}
