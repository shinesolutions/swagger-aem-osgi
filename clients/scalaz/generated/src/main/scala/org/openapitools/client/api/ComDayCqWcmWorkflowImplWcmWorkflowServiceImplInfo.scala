package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo._

case class ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplProperties])

object ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoCodecJson: CodecJson[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = CodecJson.derive[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo]
  implicit val ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoDecoder: EntityDecoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = jsonOf[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo]
  implicit val ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfoEncoder: EntityEncoder[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo] = jsonEncoderOf[ComDayCqWcmWorkflowImplWcmWorkflowServiceImplInfo]
}
