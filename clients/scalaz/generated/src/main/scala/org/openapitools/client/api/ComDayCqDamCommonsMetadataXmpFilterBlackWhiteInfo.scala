package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo._

case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties])

object ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoCodecJson: CodecJson[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = CodecJson.derive[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo]
  implicit val ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoDecoder: EntityDecoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = jsonOf[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo]
  implicit val ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfoEncoder: EntityEncoder[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo] = jsonEncoderOf[ComDayCqDamCommonsMetadataXmpFilterBlackWhiteInfo]
}
