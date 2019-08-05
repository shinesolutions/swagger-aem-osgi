package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo._

case class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties])

object ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoCodecJson: CodecJson[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo] = CodecJson.derive[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo]
  implicit val ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoDecoder: EntityDecoder[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo] = jsonOf[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo]
  implicit val ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfoEncoder: EntityEncoder[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo] = jsonEncoderOf[ComDayCqDamCoreImplJmxAssetUpdateMonitorImplInfo]
}
