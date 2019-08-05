package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCrxSecurityTokenImplTokenCleanupTaskInfo._

case class ComDayCrxSecurityTokenImplTokenCleanupTaskInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCrxSecurityTokenImplTokenCleanupTaskProperties])

object ComDayCrxSecurityTokenImplTokenCleanupTaskInfo {
  import DateTimeCodecs._

  implicit val ComDayCrxSecurityTokenImplTokenCleanupTaskInfoCodecJson: CodecJson[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = CodecJson.derive[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo]
  implicit val ComDayCrxSecurityTokenImplTokenCleanupTaskInfoDecoder: EntityDecoder[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = jsonOf[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo]
  implicit val ComDayCrxSecurityTokenImplTokenCleanupTaskInfoEncoder: EntityEncoder[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo] = jsonEncoderOf[ComDayCrxSecurityTokenImplTokenCleanupTaskInfo]
}
