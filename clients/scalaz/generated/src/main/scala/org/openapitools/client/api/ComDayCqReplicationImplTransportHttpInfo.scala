package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplTransportHttpInfo._

case class ComDayCqReplicationImplTransportHttpInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationImplTransportHttpProperties])

object ComDayCqReplicationImplTransportHttpInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplTransportHttpInfoCodecJson: CodecJson[ComDayCqReplicationImplTransportHttpInfo] = CodecJson.derive[ComDayCqReplicationImplTransportHttpInfo]
  implicit val ComDayCqReplicationImplTransportHttpInfoDecoder: EntityDecoder[ComDayCqReplicationImplTransportHttpInfo] = jsonOf[ComDayCqReplicationImplTransportHttpInfo]
  implicit val ComDayCqReplicationImplTransportHttpInfoEncoder: EntityEncoder[ComDayCqReplicationImplTransportHttpInfo] = jsonEncoderOf[ComDayCqReplicationImplTransportHttpInfo]
}
