package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo._

case class ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteAuthOauthImplTwitterProviderImplProperties])

object ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteAuthOauthImplTwitterProviderImplInfoCodecJson: CodecJson[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = CodecJson.derive[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo]
  implicit val ComAdobeGraniteAuthOauthImplTwitterProviderImplInfoDecoder: EntityDecoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = jsonOf[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo]
  implicit val ComAdobeGraniteAuthOauthImplTwitterProviderImplInfoEncoder: EntityEncoder[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo] = jsonEncoderOf[ComAdobeGraniteAuthOauthImplTwitterProviderImplInfo]
}
