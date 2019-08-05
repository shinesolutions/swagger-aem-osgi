package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplReplicatorImplInfo._

case class ComDayCqReplicationImplReplicatorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationImplReplicatorImplProperties])

object ComDayCqReplicationImplReplicatorImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplReplicatorImplInfoCodecJson: CodecJson[ComDayCqReplicationImplReplicatorImplInfo] = CodecJson.derive[ComDayCqReplicationImplReplicatorImplInfo]
  implicit val ComDayCqReplicationImplReplicatorImplInfoDecoder: EntityDecoder[ComDayCqReplicationImplReplicatorImplInfo] = jsonOf[ComDayCqReplicationImplReplicatorImplInfo]
  implicit val ComDayCqReplicationImplReplicatorImplInfoEncoder: EntityEncoder[ComDayCqReplicationImplReplicatorImplInfo] = jsonEncoderOf[ComDayCqReplicationImplReplicatorImplInfo]
}
