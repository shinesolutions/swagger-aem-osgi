package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo._

case class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties])

object ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoCodecJson: CodecJson[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo] = CodecJson.derive[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo]
  implicit val ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoDecoder: EntityDecoder[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo] = jsonOf[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo]
  implicit val ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfoEncoder: EntityEncoder[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo] = jsonEncoderOf[ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorInfo]
}
