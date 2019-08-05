package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthImplGraniteProviderInfo._

case class ComAdobeGraniteAuthOauthImplGraniteProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthOauthImplGraniteProviderProperties])

object ComAdobeGraniteAuthOauthImplGraniteProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthImplGraniteProviderInfoCodecJson: CodecJson[ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = CodecJson.derive[ComAdobeGraniteAuthOauthImplGraniteProviderInfo]
  implicit val ComAdobeGraniteAuthOauthImplGraniteProviderInfoDecoder: EntityDecoder[ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = jsonOf[ComAdobeGraniteAuthOauthImplGraniteProviderInfo]
  implicit val ComAdobeGraniteAuthOauthImplGraniteProviderInfoEncoder: EntityEncoder[ComAdobeGraniteAuthOauthImplGraniteProviderInfo] = jsonEncoderOf[ComAdobeGraniteAuthOauthImplGraniteProviderInfo]
}
