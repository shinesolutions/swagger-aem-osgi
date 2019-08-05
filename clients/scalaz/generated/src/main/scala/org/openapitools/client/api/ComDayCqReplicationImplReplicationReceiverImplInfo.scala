package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplReplicationReceiverImplInfo._

case class ComDayCqReplicationImplReplicationReceiverImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationImplReplicationReceiverImplProperties])

object ComDayCqReplicationImplReplicationReceiverImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplReplicationReceiverImplInfoCodecJson: CodecJson[ComDayCqReplicationImplReplicationReceiverImplInfo] = CodecJson.derive[ComDayCqReplicationImplReplicationReceiverImplInfo]
  implicit val ComDayCqReplicationImplReplicationReceiverImplInfoDecoder: EntityDecoder[ComDayCqReplicationImplReplicationReceiverImplInfo] = jsonOf[ComDayCqReplicationImplReplicationReceiverImplInfo]
  implicit val ComDayCqReplicationImplReplicationReceiverImplInfoEncoder: EntityEncoder[ComDayCqReplicationImplReplicationReceiverImplInfo] = jsonEncoderOf[ComDayCqReplicationImplReplicationReceiverImplInfo]
}
