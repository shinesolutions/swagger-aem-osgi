package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplWCMDebugFilterInfo._

case class ComDayCqWcmCoreImplWCMDebugFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplWCMDebugFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreImplWCMDebugFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplWCMDebugFilterInfoCodecJson: CodecJson[ComDayCqWcmCoreImplWCMDebugFilterInfo] = CodecJson.derive[ComDayCqWcmCoreImplWCMDebugFilterInfo]
  implicit val ComDayCqWcmCoreImplWCMDebugFilterInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplWCMDebugFilterInfo] = jsonOf[ComDayCqWcmCoreImplWCMDebugFilterInfo]
  implicit val ComDayCqWcmCoreImplWCMDebugFilterInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplWCMDebugFilterInfo] = jsonEncoderOf[ComDayCqWcmCoreImplWCMDebugFilterInfo]
}
