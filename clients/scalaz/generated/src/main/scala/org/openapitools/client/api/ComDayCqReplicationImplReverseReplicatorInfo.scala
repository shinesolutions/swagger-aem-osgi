package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationImplReverseReplicatorInfo._

case class ComDayCqReplicationImplReverseReplicatorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationImplReverseReplicatorProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqReplicationImplReverseReplicatorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationImplReverseReplicatorInfoCodecJson: CodecJson[ComDayCqReplicationImplReverseReplicatorInfo] = CodecJson.derive[ComDayCqReplicationImplReverseReplicatorInfo]
  implicit val ComDayCqReplicationImplReverseReplicatorInfoDecoder: EntityDecoder[ComDayCqReplicationImplReverseReplicatorInfo] = jsonOf[ComDayCqReplicationImplReverseReplicatorInfo]
  implicit val ComDayCqReplicationImplReverseReplicatorInfoEncoder: EntityEncoder[ComDayCqReplicationImplReverseReplicatorInfo] = jsonEncoderOf[ComDayCqReplicationImplReverseReplicatorInfo]
}
