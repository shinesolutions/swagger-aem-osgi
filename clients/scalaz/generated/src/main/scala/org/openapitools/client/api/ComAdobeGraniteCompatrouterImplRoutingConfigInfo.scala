package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteCompatrouterImplRoutingConfigInfo._

case class ComAdobeGraniteCompatrouterImplRoutingConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteCompatrouterImplRoutingConfigProperties])

object ComAdobeGraniteCompatrouterImplRoutingConfigInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteCompatrouterImplRoutingConfigInfoCodecJson: CodecJson[ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = CodecJson.derive[ComAdobeGraniteCompatrouterImplRoutingConfigInfo]
  implicit val ComAdobeGraniteCompatrouterImplRoutingConfigInfoDecoder: EntityDecoder[ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = jsonOf[ComAdobeGraniteCompatrouterImplRoutingConfigInfo]
  implicit val ComAdobeGraniteCompatrouterImplRoutingConfigInfoEncoder: EntityEncoder[ComAdobeGraniteCompatrouterImplRoutingConfigInfo] = jsonEncoderOf[ComAdobeGraniteCompatrouterImplRoutingConfigInfo]
}
