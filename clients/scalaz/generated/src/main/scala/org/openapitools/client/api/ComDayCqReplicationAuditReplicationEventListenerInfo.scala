package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqReplicationAuditReplicationEventListenerInfo._

case class ComDayCqReplicationAuditReplicationEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqReplicationAuditReplicationEventListenerProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqReplicationAuditReplicationEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqReplicationAuditReplicationEventListenerInfoCodecJson: CodecJson[ComDayCqReplicationAuditReplicationEventListenerInfo] = CodecJson.derive[ComDayCqReplicationAuditReplicationEventListenerInfo]
  implicit val ComDayCqReplicationAuditReplicationEventListenerInfoDecoder: EntityDecoder[ComDayCqReplicationAuditReplicationEventListenerInfo] = jsonOf[ComDayCqReplicationAuditReplicationEventListenerInfo]
  implicit val ComDayCqReplicationAuditReplicationEventListenerInfoEncoder: EntityEncoder[ComDayCqReplicationAuditReplicationEventListenerInfo] = jsonEncoderOf[ComDayCqReplicationAuditReplicationEventListenerInfo]
}
