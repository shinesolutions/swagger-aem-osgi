package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqTaggingImplTagGarbageCollectorInfo._

case class ComDayCqTaggingImplTagGarbageCollectorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqTaggingImplTagGarbageCollectorProperties])

object ComDayCqTaggingImplTagGarbageCollectorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqTaggingImplTagGarbageCollectorInfoCodecJson: CodecJson[ComDayCqTaggingImplTagGarbageCollectorInfo] = CodecJson.derive[ComDayCqTaggingImplTagGarbageCollectorInfo]
  implicit val ComDayCqTaggingImplTagGarbageCollectorInfoDecoder: EntityDecoder[ComDayCqTaggingImplTagGarbageCollectorInfo] = jsonOf[ComDayCqTaggingImplTagGarbageCollectorInfo]
  implicit val ComDayCqTaggingImplTagGarbageCollectorInfoEncoder: EntityEncoder[ComDayCqTaggingImplTagGarbageCollectorInfo] = jsonEncoderOf[ComDayCqTaggingImplTagGarbageCollectorInfo]
}
