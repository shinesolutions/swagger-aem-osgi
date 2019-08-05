package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplUnzipUnzipConfigInfo._

case class ComDayCqDamCoreImplUnzipUnzipConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplUnzipUnzipConfigProperties])

object ComDayCqDamCoreImplUnzipUnzipConfigInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplUnzipUnzipConfigInfoCodecJson: CodecJson[ComDayCqDamCoreImplUnzipUnzipConfigInfo] = CodecJson.derive[ComDayCqDamCoreImplUnzipUnzipConfigInfo]
  implicit val ComDayCqDamCoreImplUnzipUnzipConfigInfoDecoder: EntityDecoder[ComDayCqDamCoreImplUnzipUnzipConfigInfo] = jsonOf[ComDayCqDamCoreImplUnzipUnzipConfigInfo]
  implicit val ComDayCqDamCoreImplUnzipUnzipConfigInfoEncoder: EntityEncoder[ComDayCqDamCoreImplUnzipUnzipConfigInfo] = jsonEncoderOf[ComDayCqDamCoreImplUnzipUnzipConfigInfo]
}
