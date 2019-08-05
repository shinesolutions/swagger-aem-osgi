package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo._

case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties])

object ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoCodecJson: CodecJson[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = CodecJson.derive[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo]
  implicit val ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoDecoder: EntityDecoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = jsonOf[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo]
  implicit val ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfoEncoder: EntityEncoder[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo] = jsonEncoderOf[ComAdobeGraniteFragsImplCheckHttpHeaderFlagInfo]
}
