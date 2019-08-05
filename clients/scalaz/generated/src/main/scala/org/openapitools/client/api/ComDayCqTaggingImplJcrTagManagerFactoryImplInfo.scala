package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqTaggingImplJcrTagManagerFactoryImplInfo._

case class ComDayCqTaggingImplJcrTagManagerFactoryImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqTaggingImplJcrTagManagerFactoryImplProperties])

object ComDayCqTaggingImplJcrTagManagerFactoryImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqTaggingImplJcrTagManagerFactoryImplInfoCodecJson: CodecJson[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = CodecJson.derive[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo]
  implicit val ComDayCqTaggingImplJcrTagManagerFactoryImplInfoDecoder: EntityDecoder[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = jsonOf[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo]
  implicit val ComDayCqTaggingImplJcrTagManagerFactoryImplInfoEncoder: EntityEncoder[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo] = jsonEncoderOf[ComDayCqTaggingImplJcrTagManagerFactoryImplInfo]
}
