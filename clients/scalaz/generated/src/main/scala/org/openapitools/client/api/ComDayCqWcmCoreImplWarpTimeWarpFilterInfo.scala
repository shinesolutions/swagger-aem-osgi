package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplWarpTimeWarpFilterInfo._

case class ComDayCqWcmCoreImplWarpTimeWarpFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplWarpTimeWarpFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreImplWarpTimeWarpFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterInfoCodecJson: CodecJson[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = CodecJson.derive[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo]
  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = jsonOf[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo]
  implicit val ComDayCqWcmCoreImplWarpTimeWarpFilterInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo] = jsonEncoderOf[ComDayCqWcmCoreImplWarpTimeWarpFilterInfo]
}
