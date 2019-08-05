package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqContentsyncImplContentSyncManagerImplInfo._

case class ComDayCqContentsyncImplContentSyncManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqContentsyncImplContentSyncManagerImplProperties])

object ComDayCqContentsyncImplContentSyncManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqContentsyncImplContentSyncManagerImplInfoCodecJson: CodecJson[ComDayCqContentsyncImplContentSyncManagerImplInfo] = CodecJson.derive[ComDayCqContentsyncImplContentSyncManagerImplInfo]
  implicit val ComDayCqContentsyncImplContentSyncManagerImplInfoDecoder: EntityDecoder[ComDayCqContentsyncImplContentSyncManagerImplInfo] = jsonOf[ComDayCqContentsyncImplContentSyncManagerImplInfo]
  implicit val ComDayCqContentsyncImplContentSyncManagerImplInfoEncoder: EntityEncoder[ComDayCqContentsyncImplContentSyncManagerImplInfo] = jsonEncoderOf[ComDayCqContentsyncImplContentSyncManagerImplInfo]
}
