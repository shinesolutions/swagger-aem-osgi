package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthAccesstokenProviderInfo._

case class ComAdobeGraniteAuthOauthAccesstokenProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthOauthAccesstokenProviderProperties])

object ComAdobeGraniteAuthOauthAccesstokenProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderInfoCodecJson: CodecJson[ComAdobeGraniteAuthOauthAccesstokenProviderInfo] = CodecJson.derive[ComAdobeGraniteAuthOauthAccesstokenProviderInfo]
  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderInfoDecoder: EntityDecoder[ComAdobeGraniteAuthOauthAccesstokenProviderInfo] = jsonOf[ComAdobeGraniteAuthOauthAccesstokenProviderInfo]
  implicit val ComAdobeGraniteAuthOauthAccesstokenProviderInfoEncoder: EntityEncoder[ComAdobeGraniteAuthOauthAccesstokenProviderInfo] = jsonEncoderOf[ComAdobeGraniteAuthOauthAccesstokenProviderInfo]
}
