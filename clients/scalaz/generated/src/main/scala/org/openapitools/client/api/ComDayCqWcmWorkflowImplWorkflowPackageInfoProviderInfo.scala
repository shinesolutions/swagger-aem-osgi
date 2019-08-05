package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo._

case class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties])

object ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoCodecJson: CodecJson[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = CodecJson.derive[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo]
  implicit val ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoDecoder: EntityDecoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = jsonOf[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo]
  implicit val ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoEncoder: EntityEncoder[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo] = jsonEncoderOf[ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo]
}
