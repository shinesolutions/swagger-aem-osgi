package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletMetadataGetServletInfo._

case class ComDayCqDamCoreImplServletMetadataGetServletInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletMetadataGetServletProperties])

object ComDayCqDamCoreImplServletMetadataGetServletInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletMetadataGetServletInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletMetadataGetServletInfo] = CodecJson.derive[ComDayCqDamCoreImplServletMetadataGetServletInfo]
  implicit val ComDayCqDamCoreImplServletMetadataGetServletInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletMetadataGetServletInfo] = jsonOf[ComDayCqDamCoreImplServletMetadataGetServletInfo]
  implicit val ComDayCqDamCoreImplServletMetadataGetServletInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletMetadataGetServletInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletMetadataGetServletInfo]
}
