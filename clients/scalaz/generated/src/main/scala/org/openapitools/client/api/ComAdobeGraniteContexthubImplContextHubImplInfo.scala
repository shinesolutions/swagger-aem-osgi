package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteContexthubImplContextHubImplInfo._

case class ComAdobeGraniteContexthubImplContextHubImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteContexthubImplContextHubImplProperties])

object ComAdobeGraniteContexthubImplContextHubImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteContexthubImplContextHubImplInfoCodecJson: CodecJson[ComAdobeGraniteContexthubImplContextHubImplInfo] = CodecJson.derive[ComAdobeGraniteContexthubImplContextHubImplInfo]
  implicit val ComAdobeGraniteContexthubImplContextHubImplInfoDecoder: EntityDecoder[ComAdobeGraniteContexthubImplContextHubImplInfo] = jsonOf[ComAdobeGraniteContexthubImplContextHubImplInfo]
  implicit val ComAdobeGraniteContexthubImplContextHubImplInfoEncoder: EntityEncoder[ComAdobeGraniteContexthubImplContextHubImplInfo] = jsonEncoderOf[ComAdobeGraniteContexthubImplContextHubImplInfo]
}
