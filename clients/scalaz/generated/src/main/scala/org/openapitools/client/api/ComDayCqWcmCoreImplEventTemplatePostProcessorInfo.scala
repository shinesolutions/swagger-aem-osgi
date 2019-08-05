package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplEventTemplatePostProcessorInfo._

case class ComDayCqWcmCoreImplEventTemplatePostProcessorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplEventTemplatePostProcessorProperties])

object ComDayCqWcmCoreImplEventTemplatePostProcessorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplEventTemplatePostProcessorInfoCodecJson: CodecJson[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = CodecJson.derive[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo]
  implicit val ComDayCqWcmCoreImplEventTemplatePostProcessorInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = jsonOf[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo]
  implicit val ComDayCqWcmCoreImplEventTemplatePostProcessorInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo] = jsonEncoderOf[ComDayCqWcmCoreImplEventTemplatePostProcessorInfo]
}
