package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqPollingImporterImplManagedPollConfigImplInfo._

case class ComDayCqPollingImporterImplManagedPollConfigImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqPollingImporterImplManagedPollConfigImplProperties])

object ComDayCqPollingImporterImplManagedPollConfigImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqPollingImporterImplManagedPollConfigImplInfoCodecJson: CodecJson[ComDayCqPollingImporterImplManagedPollConfigImplInfo] = CodecJson.derive[ComDayCqPollingImporterImplManagedPollConfigImplInfo]
  implicit val ComDayCqPollingImporterImplManagedPollConfigImplInfoDecoder: EntityDecoder[ComDayCqPollingImporterImplManagedPollConfigImplInfo] = jsonOf[ComDayCqPollingImporterImplManagedPollConfigImplInfo]
  implicit val ComDayCqPollingImporterImplManagedPollConfigImplInfoEncoder: EntityEncoder[ComDayCqPollingImporterImplManagedPollConfigImplInfo] = jsonEncoderOf[ComDayCqPollingImporterImplManagedPollConfigImplInfo]
}
