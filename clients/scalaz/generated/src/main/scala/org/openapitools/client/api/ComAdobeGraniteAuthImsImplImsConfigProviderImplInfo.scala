package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo._

case class ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties])

object ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoCodecJson: CodecJson[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = CodecJson.derive[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo]
  implicit val ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoDecoder: EntityDecoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = jsonOf[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo]
  implicit val ComAdobeGraniteAuthImsImplImsConfigProviderImplInfoEncoder: EntityEncoder[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo] = jsonEncoderOf[ComAdobeGraniteAuthImsImplImsConfigProviderImplInfo]
}
