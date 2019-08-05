package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqPollingImporterImplPollingImporterImplInfo._

case class ComDayCqPollingImporterImplPollingImporterImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqPollingImporterImplPollingImporterImplProperties])

object ComDayCqPollingImporterImplPollingImporterImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqPollingImporterImplPollingImporterImplInfoCodecJson: CodecJson[ComDayCqPollingImporterImplPollingImporterImplInfo] = CodecJson.derive[ComDayCqPollingImporterImplPollingImporterImplInfo]
  implicit val ComDayCqPollingImporterImplPollingImporterImplInfoDecoder: EntityDecoder[ComDayCqPollingImporterImplPollingImporterImplInfo] = jsonOf[ComDayCqPollingImporterImplPollingImporterImplInfo]
  implicit val ComDayCqPollingImporterImplPollingImporterImplInfoEncoder: EntityEncoder[ComDayCqPollingImporterImplPollingImporterImplInfo] = jsonEncoderOf[ComDayCqPollingImporterImplPollingImporterImplInfo]
}
