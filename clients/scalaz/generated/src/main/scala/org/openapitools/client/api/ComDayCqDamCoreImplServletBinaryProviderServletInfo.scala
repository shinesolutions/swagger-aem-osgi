package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletBinaryProviderServletInfo._

case class ComDayCqDamCoreImplServletBinaryProviderServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletBinaryProviderServletProperties])

object ComDayCqDamCoreImplServletBinaryProviderServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletBinaryProviderServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletBinaryProviderServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletBinaryProviderServletInfo]
  implicit val ComDayCqDamCoreImplServletBinaryProviderServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletBinaryProviderServletInfo] = jsonOf[ComDayCqDamCoreImplServletBinaryProviderServletInfo]
  implicit val ComDayCqDamCoreImplServletBinaryProviderServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletBinaryProviderServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletBinaryProviderServletInfo]
}
