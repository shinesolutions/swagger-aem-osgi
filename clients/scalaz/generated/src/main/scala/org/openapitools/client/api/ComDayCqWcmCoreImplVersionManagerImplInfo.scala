package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplVersionManagerImplInfo._

case class ComDayCqWcmCoreImplVersionManagerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplVersionManagerImplProperties])

object ComDayCqWcmCoreImplVersionManagerImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplVersionManagerImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplVersionManagerImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplVersionManagerImplInfo]
  implicit val ComDayCqWcmCoreImplVersionManagerImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplVersionManagerImplInfo] = jsonOf[ComDayCqWcmCoreImplVersionManagerImplInfo]
  implicit val ComDayCqWcmCoreImplVersionManagerImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplVersionManagerImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplVersionManagerImplInfo]
}
