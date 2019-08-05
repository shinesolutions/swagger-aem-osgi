package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowPurgeSchedulerInfo._

case class ComAdobeGraniteWorkflowPurgeSchedulerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteWorkflowPurgeSchedulerProperties])

object ComAdobeGraniteWorkflowPurgeSchedulerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowPurgeSchedulerInfoCodecJson: CodecJson[ComAdobeGraniteWorkflowPurgeSchedulerInfo] = CodecJson.derive[ComAdobeGraniteWorkflowPurgeSchedulerInfo]
  implicit val ComAdobeGraniteWorkflowPurgeSchedulerInfoDecoder: EntityDecoder[ComAdobeGraniteWorkflowPurgeSchedulerInfo] = jsonOf[ComAdobeGraniteWorkflowPurgeSchedulerInfo]
  implicit val ComAdobeGraniteWorkflowPurgeSchedulerInfoEncoder: EntityEncoder[ComAdobeGraniteWorkflowPurgeSchedulerInfo] = jsonEncoderOf[ComAdobeGraniteWorkflowPurgeSchedulerInfo]
}
