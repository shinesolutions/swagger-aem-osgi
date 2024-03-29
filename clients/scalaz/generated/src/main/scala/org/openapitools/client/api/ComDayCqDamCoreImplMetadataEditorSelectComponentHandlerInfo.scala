package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo._

case class ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerProperties])

object ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoCodecJson: CodecJson[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = CodecJson.derive[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo]
  implicit val ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoDecoder: EntityDecoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = jsonOf[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo]
  implicit val ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfoEncoder: EntityEncoder[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo] = jsonEncoderOf[ComDayCqDamCoreImplMetadataEditorSelectComponentHandlerInfo]
}
