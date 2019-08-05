package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqDamCoreImplProcessTextExtractionProcessInfo._

case class ComDayCqDamCoreImplProcessTextExtractionProcessInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqDamCoreImplProcessTextExtractionProcessProperties])

object ComDayCqDamCoreImplProcessTextExtractionProcessInfo {
  import DateTimeCodecs._

  implicit val ComDayCqDamCoreImplProcessTextExtractionProcessInfoCodecJson: CodecJson[ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = CodecJson.derive[ComDayCqDamCoreImplProcessTextExtractionProcessInfo]
  implicit val ComDayCqDamCoreImplProcessTextExtractionProcessInfoDecoder: EntityDecoder[ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = jsonOf[ComDayCqDamCoreImplProcessTextExtractionProcessInfo]
  implicit val ComDayCqDamCoreImplProcessTextExtractionProcessInfoEncoder: EntityEncoder[ComDayCqDamCoreImplProcessTextExtractionProcessInfo] = jsonEncoderOf[ComDayCqDamCoreImplProcessTextExtractionProcessInfo]
}
