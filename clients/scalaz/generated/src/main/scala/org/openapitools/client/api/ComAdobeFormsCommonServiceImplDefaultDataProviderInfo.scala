package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeFormsCommonServiceImplDefaultDataProviderInfo._

case class ComAdobeFormsCommonServiceImplDefaultDataProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeFormsCommonServiceImplDefaultDataProviderProperties])

object ComAdobeFormsCommonServiceImplDefaultDataProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeFormsCommonServiceImplDefaultDataProviderInfoCodecJson: CodecJson[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = CodecJson.derive[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo]
  implicit val ComAdobeFormsCommonServiceImplDefaultDataProviderInfoDecoder: EntityDecoder[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = jsonOf[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo]
  implicit val ComAdobeFormsCommonServiceImplDefaultDataProviderInfoEncoder: EntityEncoder[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo] = jsonEncoderOf[ComAdobeFormsCommonServiceImplDefaultDataProviderInfo]
}
