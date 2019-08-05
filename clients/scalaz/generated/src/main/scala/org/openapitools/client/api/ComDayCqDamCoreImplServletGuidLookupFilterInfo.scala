package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplServletGuidLookupFilterInfo._

case class ComDayCqDamCoreImplServletGuidLookupFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplServletGuidLookupFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamCoreImplServletGuidLookupFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplServletGuidLookupFilterInfoCodecJson: CodecJson[ComDayCqDamCoreImplServletGuidLookupFilterInfo] = CodecJson.derive[ComDayCqDamCoreImplServletGuidLookupFilterInfo]
  implicit val ComDayCqDamCoreImplServletGuidLookupFilterInfoDecoder: EntityDecoder[ComDayCqDamCoreImplServletGuidLookupFilterInfo] = jsonOf[ComDayCqDamCoreImplServletGuidLookupFilterInfo]
  implicit val ComDayCqDamCoreImplServletGuidLookupFilterInfoEncoder: EntityEncoder[ComDayCqDamCoreImplServletGuidLookupFilterInfo] = jsonEncoderOf[ComDayCqDamCoreImplServletGuidLookupFilterInfo]
}
