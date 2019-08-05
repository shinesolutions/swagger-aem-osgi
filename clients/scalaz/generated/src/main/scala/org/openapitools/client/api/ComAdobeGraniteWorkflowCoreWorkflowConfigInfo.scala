package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowCoreWorkflowConfigInfo._

case class ComAdobeGraniteWorkflowCoreWorkflowConfigInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteWorkflowCoreWorkflowConfigProperties])

object ComAdobeGraniteWorkflowCoreWorkflowConfigInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowCoreWorkflowConfigInfoCodecJson: CodecJson[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = CodecJson.derive[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo]
  implicit val ComAdobeGraniteWorkflowCoreWorkflowConfigInfoDecoder: EntityDecoder[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = jsonOf[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo]
  implicit val ComAdobeGraniteWorkflowCoreWorkflowConfigInfoEncoder: EntityEncoder[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo] = jsonEncoderOf[ComAdobeGraniteWorkflowCoreWorkflowConfigInfo]
}
