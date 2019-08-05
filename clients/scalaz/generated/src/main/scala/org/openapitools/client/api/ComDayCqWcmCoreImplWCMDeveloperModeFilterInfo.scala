package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo._

case class ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoCodecJson: CodecJson[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = CodecJson.derive[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo]
  implicit val ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = jsonOf[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo]
  implicit val ComDayCqWcmCoreImplWCMDeveloperModeFilterInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo] = jsonEncoderOf[ComDayCqWcmCoreImplWCMDeveloperModeFilterInfo]
}
