package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplEventDamEventAuditListenerInfo._

case class ComDayCqDamCoreImplEventDamEventAuditListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplEventDamEventAuditListenerProperties])

object ComDayCqDamCoreImplEventDamEventAuditListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplEventDamEventAuditListenerInfoCodecJson: CodecJson[ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = CodecJson.derive[ComDayCqDamCoreImplEventDamEventAuditListenerInfo]
  implicit val ComDayCqDamCoreImplEventDamEventAuditListenerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = jsonOf[ComDayCqDamCoreImplEventDamEventAuditListenerInfo]
  implicit val ComDayCqDamCoreImplEventDamEventAuditListenerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplEventDamEventAuditListenerInfo] = jsonEncoderOf[ComDayCqDamCoreImplEventDamEventAuditListenerInfo]
}
