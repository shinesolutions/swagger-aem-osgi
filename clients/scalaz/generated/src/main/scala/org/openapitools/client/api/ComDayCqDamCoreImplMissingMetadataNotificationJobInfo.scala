package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplMissingMetadataNotificationJobInfo._

case class ComDayCqDamCoreImplMissingMetadataNotificationJobInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplMissingMetadataNotificationJobProperties])

object ComDayCqDamCoreImplMissingMetadataNotificationJobInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplMissingMetadataNotificationJobInfoCodecJson: CodecJson[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = CodecJson.derive[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo]
  implicit val ComDayCqDamCoreImplMissingMetadataNotificationJobInfoDecoder: EntityDecoder[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = jsonOf[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo]
  implicit val ComDayCqDamCoreImplMissingMetadataNotificationJobInfoEncoder: EntityEncoder[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo] = jsonEncoderOf[ComDayCqDamCoreImplMissingMetadataNotificationJobInfo]
}
