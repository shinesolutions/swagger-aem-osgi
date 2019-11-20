package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo._

case class ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplProperties])

object ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoCodecJson: CodecJson[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = CodecJson.derive[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo]
  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoDecoder: EntityDecoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = jsonOf[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo]
  implicit val ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfoEncoder: EntityEncoder[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo] = jsonEncoderOf[ComAdobeGraniteAuthOauthImplDefaultTokenValidatorImplInfo]
}