package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo._

case class ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryProperties])

object ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoCodecJson: CodecJson[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = CodecJson.derive[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo]
  implicit val ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoDecoder: EntityDecoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = jsonOf[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo]
  implicit val ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfoEncoder: EntityEncoder[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo] = jsonEncoderOf[ComAdobeGraniteWorkflowCoreWorkflowSessionFactoryInfo]
}
