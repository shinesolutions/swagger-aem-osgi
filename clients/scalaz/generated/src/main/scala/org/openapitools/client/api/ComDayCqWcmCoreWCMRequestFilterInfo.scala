package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreWCMRequestFilterInfo._

case class ComDayCqWcmCoreWCMRequestFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreWCMRequestFilterProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreWCMRequestFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreWCMRequestFilterInfoCodecJson: CodecJson[ComDayCqWcmCoreWCMRequestFilterInfo] = CodecJson.derive[ComDayCqWcmCoreWCMRequestFilterInfo]
  implicit val ComDayCqWcmCoreWCMRequestFilterInfoDecoder: EntityDecoder[ComDayCqWcmCoreWCMRequestFilterInfo] = jsonOf[ComDayCqWcmCoreWCMRequestFilterInfo]
  implicit val ComDayCqWcmCoreWCMRequestFilterInfoEncoder: EntityEncoder[ComDayCqWcmCoreWCMRequestFilterInfo] = jsonEncoderOf[ComDayCqWcmCoreWCMRequestFilterInfo]
}
