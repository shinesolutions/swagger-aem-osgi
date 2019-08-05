package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplAgentManagerImplInfo._

case class ComDayCqReplicationImplAgentManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationImplAgentManagerImplProperties])

object ComDayCqReplicationImplAgentManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplAgentManagerImplInfoCodecJson: CodecJson[ComDayCqReplicationImplAgentManagerImplInfo] = CodecJson.derive[ComDayCqReplicationImplAgentManagerImplInfo]
  implicit val ComDayCqReplicationImplAgentManagerImplInfoDecoder: EntityDecoder[ComDayCqReplicationImplAgentManagerImplInfo] = jsonOf[ComDayCqReplicationImplAgentManagerImplInfo]
  implicit val ComDayCqReplicationImplAgentManagerImplInfoEncoder: EntityEncoder[ComDayCqReplicationImplAgentManagerImplInfo] = jsonEncoderOf[ComDayCqReplicationImplAgentManagerImplInfo]
}
