package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmFoundationImplPageImpressionsTrackerInfo._

case class ComDayCqWcmFoundationImplPageImpressionsTrackerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmFoundationImplPageImpressionsTrackerProperties])

object ComDayCqWcmFoundationImplPageImpressionsTrackerInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmFoundationImplPageImpressionsTrackerInfoCodecJson: CodecJson[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = CodecJson.derive[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo]
  implicit val ComDayCqWcmFoundationImplPageImpressionsTrackerInfoDecoder: EntityDecoder[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = jsonOf[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo]
  implicit val ComDayCqWcmFoundationImplPageImpressionsTrackerInfoEncoder: EntityEncoder[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo] = jsonEncoderOf[ComDayCqWcmFoundationImplPageImpressionsTrackerInfo]
}
