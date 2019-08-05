package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreProcessMetadataProcessorProcessInfo._

case class ComDayCqDamCoreProcessMetadataProcessorProcessInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreProcessMetadataProcessorProcessProperties])

object ComDayCqDamCoreProcessMetadataProcessorProcessInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreProcessMetadataProcessorProcessInfoCodecJson: CodecJson[ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = CodecJson.derive[ComDayCqDamCoreProcessMetadataProcessorProcessInfo]
  implicit val ComDayCqDamCoreProcessMetadataProcessorProcessInfoDecoder: EntityDecoder[ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = jsonOf[ComDayCqDamCoreProcessMetadataProcessorProcessInfo]
  implicit val ComDayCqDamCoreProcessMetadataProcessorProcessInfoEncoder: EntityEncoder[ComDayCqDamCoreProcessMetadataProcessorProcessInfo] = jsonEncoderOf[ComDayCqDamCoreProcessMetadataProcessorProcessInfo]
}
