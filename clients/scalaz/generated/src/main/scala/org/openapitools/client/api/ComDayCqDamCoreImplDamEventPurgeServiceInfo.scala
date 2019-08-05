package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplDamEventPurgeServiceInfo._

case class ComDayCqDamCoreImplDamEventPurgeServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplDamEventPurgeServiceProperties])

object ComDayCqDamCoreImplDamEventPurgeServiceInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplDamEventPurgeServiceInfoCodecJson: CodecJson[ComDayCqDamCoreImplDamEventPurgeServiceInfo] = CodecJson.derive[ComDayCqDamCoreImplDamEventPurgeServiceInfo]
  implicit val ComDayCqDamCoreImplDamEventPurgeServiceInfoDecoder: EntityDecoder[ComDayCqDamCoreImplDamEventPurgeServiceInfo] = jsonOf[ComDayCqDamCoreImplDamEventPurgeServiceInfo]
  implicit val ComDayCqDamCoreImplDamEventPurgeServiceInfoEncoder: EntityEncoder[ComDayCqDamCoreImplDamEventPurgeServiceInfo] = jsonEncoderOf[ComDayCqDamCoreImplDamEventPurgeServiceInfo]
}
