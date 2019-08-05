package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo._

case class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties])

object ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoCodecJson: CodecJson[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = CodecJson.derive[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo]
  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoDecoder: EntityDecoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = jsonOf[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo]
  implicit val ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfoEncoder: EntityEncoder[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo] = jsonEncoderOf[ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerInfo]
}
