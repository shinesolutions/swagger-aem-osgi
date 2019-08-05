package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo._

case class ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteI18nImplBundlePseudoTranslationsProperties])

object ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoCodecJson: CodecJson[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = CodecJson.derive[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo]
  implicit val ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoDecoder: EntityDecoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = jsonOf[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo]
  implicit val ComAdobeGraniteI18nImplBundlePseudoTranslationsInfoEncoder: EntityEncoder[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo] = jsonEncoderOf[ComAdobeGraniteI18nImplBundlePseudoTranslationsInfo]
}
