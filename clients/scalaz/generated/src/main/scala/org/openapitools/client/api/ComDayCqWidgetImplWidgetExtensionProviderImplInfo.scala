package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWidgetImplWidgetExtensionProviderImplInfo._

case class ComDayCqWidgetImplWidgetExtensionProviderImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWidgetImplWidgetExtensionProviderImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWidgetImplWidgetExtensionProviderImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWidgetImplWidgetExtensionProviderImplInfoCodecJson: CodecJson[ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = CodecJson.derive[ComDayCqWidgetImplWidgetExtensionProviderImplInfo]
  implicit val ComDayCqWidgetImplWidgetExtensionProviderImplInfoDecoder: EntityDecoder[ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = jsonOf[ComDayCqWidgetImplWidgetExtensionProviderImplInfo]
  implicit val ComDayCqWidgetImplWidgetExtensionProviderImplInfoEncoder: EntityEncoder[ComDayCqWidgetImplWidgetExtensionProviderImplInfo] = jsonEncoderOf[ComDayCqWidgetImplWidgetExtensionProviderImplInfo]
}
