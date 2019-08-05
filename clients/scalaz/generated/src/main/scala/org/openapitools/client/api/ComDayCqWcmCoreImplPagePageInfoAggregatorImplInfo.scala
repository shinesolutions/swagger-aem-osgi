package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo._

case class ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties])

object ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfoCodecJson: CodecJson[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo] = CodecJson.derive[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo]
  implicit val ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfoDecoder: EntityDecoder[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo] = jsonOf[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo]
  implicit val ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfoEncoder: EntityEncoder[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo] = jsonEncoderOf[ComDayCqWcmCoreImplPagePageInfoAggregatorImplInfo]
}
