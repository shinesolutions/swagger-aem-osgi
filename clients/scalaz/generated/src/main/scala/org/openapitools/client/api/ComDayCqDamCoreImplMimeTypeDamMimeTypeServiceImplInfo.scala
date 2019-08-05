package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo._

case class ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties])

object ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoCodecJson: CodecJson[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = CodecJson.derive[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo]
  implicit val ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoDecoder: EntityDecoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = jsonOf[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo]
  implicit val ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfoEncoder: EntityEncoder[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo] = jsonEncoderOf[ComDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplInfo]
}
