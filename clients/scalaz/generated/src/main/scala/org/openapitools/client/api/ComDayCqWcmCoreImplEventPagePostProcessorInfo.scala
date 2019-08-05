package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplEventPagePostProcessorInfo._

case class ComDayCqWcmCoreImplEventPagePostProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplEventPagePostProcessorProperties])

object ComDayCqWcmCoreImplEventPagePostProcessorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplEventPagePostProcessorInfoCodecJson: CodecJson[ComDayCqWcmCoreImplEventPagePostProcessorInfo] = CodecJson.derive[ComDayCqWcmCoreImplEventPagePostProcessorInfo]
  implicit val ComDayCqWcmCoreImplEventPagePostProcessorInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplEventPagePostProcessorInfo] = jsonOf[ComDayCqWcmCoreImplEventPagePostProcessorInfo]
  implicit val ComDayCqWcmCoreImplEventPagePostProcessorInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplEventPagePostProcessorInfo] = jsonEncoderOf[ComDayCqWcmCoreImplEventPagePostProcessorInfo]
}
