package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowCoreJobJobHandlerInfo._

case class ComAdobeGraniteWorkflowCoreJobJobHandlerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteWorkflowCoreJobJobHandlerProperties])

object ComAdobeGraniteWorkflowCoreJobJobHandlerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowCoreJobJobHandlerInfoCodecJson: CodecJson[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo] = CodecJson.derive[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo]
  implicit val ComAdobeGraniteWorkflowCoreJobJobHandlerInfoDecoder: EntityDecoder[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo] = jsonOf[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo]
  implicit val ComAdobeGraniteWorkflowCoreJobJobHandlerInfoEncoder: EntityEncoder[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo] = jsonEncoderOf[ComAdobeGraniteWorkflowCoreJobJobHandlerInfo]
}
