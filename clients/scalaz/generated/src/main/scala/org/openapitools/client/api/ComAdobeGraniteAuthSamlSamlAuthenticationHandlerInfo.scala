package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo._

case class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoCodecJson: CodecJson[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = CodecJson.derive[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo]
  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoDecoder: EntityDecoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = jsonOf[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo]
  implicit val ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfoEncoder: EntityEncoder[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo] = jsonEncoderOf[ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo]
}
