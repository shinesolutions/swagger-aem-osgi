package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplVersionPurgeTaskInfo._

case class ComDayCqWcmCoreImplVersionPurgeTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplVersionPurgeTaskProperties])

object ComDayCqWcmCoreImplVersionPurgeTaskInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplVersionPurgeTaskInfoCodecJson: CodecJson[ComDayCqWcmCoreImplVersionPurgeTaskInfo] = CodecJson.derive[ComDayCqWcmCoreImplVersionPurgeTaskInfo]
  implicit val ComDayCqWcmCoreImplVersionPurgeTaskInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplVersionPurgeTaskInfo] = jsonOf[ComDayCqWcmCoreImplVersionPurgeTaskInfo]
  implicit val ComDayCqWcmCoreImplVersionPurgeTaskInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplVersionPurgeTaskInfo] = jsonEncoderOf[ComDayCqWcmCoreImplVersionPurgeTaskInfo]
}
