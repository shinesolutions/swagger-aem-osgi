package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWidgetImplHtmlLibraryManagerImplInfo._

case class ComDayCqWidgetImplHtmlLibraryManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWidgetImplHtmlLibraryManagerImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWidgetImplHtmlLibraryManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWidgetImplHtmlLibraryManagerImplInfoCodecJson: CodecJson[ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = CodecJson.derive[ComDayCqWidgetImplHtmlLibraryManagerImplInfo]
  implicit val ComDayCqWidgetImplHtmlLibraryManagerImplInfoDecoder: EntityDecoder[ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = jsonOf[ComDayCqWidgetImplHtmlLibraryManagerImplInfo]
  implicit val ComDayCqWidgetImplHtmlLibraryManagerImplInfoEncoder: EntityEncoder[ComDayCqWidgetImplHtmlLibraryManagerImplInfo] = jsonEncoderOf[ComDayCqWidgetImplHtmlLibraryManagerImplInfo]
}
