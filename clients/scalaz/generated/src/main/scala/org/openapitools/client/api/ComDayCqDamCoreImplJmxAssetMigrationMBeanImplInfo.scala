package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo._

case class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoCodecJson: CodecJson[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = CodecJson.derive[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo]
  implicit val ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoDecoder: EntityDecoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = jsonOf[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo]
  implicit val ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoEncoder: EntityEncoder[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = jsonEncoderOf[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo]
}
