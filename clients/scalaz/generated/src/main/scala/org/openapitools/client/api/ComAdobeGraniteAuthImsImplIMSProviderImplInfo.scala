package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthImsImplIMSProviderImplInfo._

case class ComAdobeGraniteAuthImsImplIMSProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthImsImplIMSProviderImplProperties])

object ComAdobeGraniteAuthImsImplIMSProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthImsImplIMSProviderImplInfoCodecJson: CodecJson[ComAdobeGraniteAuthImsImplIMSProviderImplInfo] = CodecJson.derive[ComAdobeGraniteAuthImsImplIMSProviderImplInfo]
  implicit val ComAdobeGraniteAuthImsImplIMSProviderImplInfoDecoder: EntityDecoder[ComAdobeGraniteAuthImsImplIMSProviderImplInfo] = jsonOf[ComAdobeGraniteAuthImsImplIMSProviderImplInfo]
  implicit val ComAdobeGraniteAuthImsImplIMSProviderImplInfoEncoder: EntityEncoder[ComAdobeGraniteAuthImsImplIMSProviderImplInfo] = jsonEncoderOf[ComAdobeGraniteAuthImsImplIMSProviderImplInfo]
}
