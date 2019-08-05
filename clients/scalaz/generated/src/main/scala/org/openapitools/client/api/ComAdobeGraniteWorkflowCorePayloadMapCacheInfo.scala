package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteWorkflowCorePayloadMapCacheInfo._

case class ComAdobeGraniteWorkflowCorePayloadMapCacheInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteWorkflowCorePayloadMapCacheProperties])

object ComAdobeGraniteWorkflowCorePayloadMapCacheInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteWorkflowCorePayloadMapCacheInfoCodecJson: CodecJson[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = CodecJson.derive[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo]
  implicit val ComAdobeGraniteWorkflowCorePayloadMapCacheInfoDecoder: EntityDecoder[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = jsonOf[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo]
  implicit val ComAdobeGraniteWorkflowCorePayloadMapCacheInfoEncoder: EntityEncoder[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo] = jsonEncoderOf[ComAdobeGraniteWorkflowCorePayloadMapCacheInfo]
}
