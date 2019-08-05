package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletBatchMetadataServletInfo._

case class ComDayCqDamCoreImplServletBatchMetadataServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletBatchMetadataServletProperties])

object ComDayCqDamCoreImplServletBatchMetadataServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletBatchMetadataServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletBatchMetadataServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletBatchMetadataServletInfo]
  implicit val ComDayCqDamCoreImplServletBatchMetadataServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletBatchMetadataServletInfo] = jsonOf[ComDayCqDamCoreImplServletBatchMetadataServletInfo]
  implicit val ComDayCqDamCoreImplServletBatchMetadataServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletBatchMetadataServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletBatchMetadataServletInfo]
}
