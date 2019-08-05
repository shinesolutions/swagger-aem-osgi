package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo._

case class ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthCertImplClientCertAuthHandlerProperties])

object ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoCodecJson: CodecJson[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = CodecJson.derive[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo]
  implicit val ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoDecoder: EntityDecoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = jsonOf[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo]
  implicit val ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfoEncoder: EntityEncoder[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo] = jsonEncoderOf[ComAdobeGraniteAuthCertImplClientCertAuthHandlerInfo]
}
