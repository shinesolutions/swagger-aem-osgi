package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreProcessExtractMetadataProcessInfo._

case class ComDayCqDamCoreProcessExtractMetadataProcessInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreProcessExtractMetadataProcessProperties])

object ComDayCqDamCoreProcessExtractMetadataProcessInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreProcessExtractMetadataProcessInfoCodecJson: CodecJson[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = CodecJson.derive[ComDayCqDamCoreProcessExtractMetadataProcessInfo]
  implicit val ComDayCqDamCoreProcessExtractMetadataProcessInfoDecoder: EntityDecoder[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = jsonOf[ComDayCqDamCoreProcessExtractMetadataProcessInfo]
  implicit val ComDayCqDamCoreProcessExtractMetadataProcessInfoEncoder: EntityEncoder[ComDayCqDamCoreProcessExtractMetadataProcessInfo] = jsonEncoderOf[ComDayCqDamCoreProcessExtractMetadataProcessInfo]
}
