package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthProviderInfo._

case class ComAdobeGraniteAuthOauthProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthOauthProviderProperties])

object ComAdobeGraniteAuthOauthProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthProviderInfoCodecJson: CodecJson[ComAdobeGraniteAuthOauthProviderInfo] = CodecJson.derive[ComAdobeGraniteAuthOauthProviderInfo]
  implicit val ComAdobeGraniteAuthOauthProviderInfoDecoder: EntityDecoder[ComAdobeGraniteAuthOauthProviderInfo] = jsonOf[ComAdobeGraniteAuthOauthProviderInfo]
  implicit val ComAdobeGraniteAuthOauthProviderInfoEncoder: EntityEncoder[ComAdobeGraniteAuthOauthProviderInfo] = jsonEncoderOf[ComAdobeGraniteAuthOauthProviderInfo]
}
