package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplGfxCommonsGfxRendererInfo._

case class ComDayCqDamCoreImplGfxCommonsGfxRendererInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplGfxCommonsGfxRendererProperties])

object ComDayCqDamCoreImplGfxCommonsGfxRendererInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplGfxCommonsGfxRendererInfoCodecJson: CodecJson[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = CodecJson.derive[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo]
  implicit val ComDayCqDamCoreImplGfxCommonsGfxRendererInfoDecoder: EntityDecoder[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = jsonOf[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo]
  implicit val ComDayCqDamCoreImplGfxCommonsGfxRendererInfoEncoder: EntityEncoder[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo] = jsonEncoderOf[ComDayCqDamCoreImplGfxCommonsGfxRendererInfo]
}
