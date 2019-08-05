package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplAssetMoveListenerInfo._

case class ComDayCqDamCoreImplAssetMoveListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplAssetMoveListenerProperties])

object ComDayCqDamCoreImplAssetMoveListenerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplAssetMoveListenerInfoCodecJson: CodecJson[ComDayCqDamCoreImplAssetMoveListenerInfo] = CodecJson.derive[ComDayCqDamCoreImplAssetMoveListenerInfo]
  implicit val ComDayCqDamCoreImplAssetMoveListenerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplAssetMoveListenerInfo] = jsonOf[ComDayCqDamCoreImplAssetMoveListenerInfo]
  implicit val ComDayCqDamCoreImplAssetMoveListenerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplAssetMoveListenerInfo] = jsonEncoderOf[ComDayCqDamCoreImplAssetMoveListenerInfo]
}
