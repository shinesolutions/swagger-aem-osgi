package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteMonitoringImplScriptConfigImplInfo._

case class ComAdobeGraniteMonitoringImplScriptConfigImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteMonitoringImplScriptConfigImplProperties])

object ComAdobeGraniteMonitoringImplScriptConfigImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteMonitoringImplScriptConfigImplInfoCodecJson: CodecJson[ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = CodecJson.derive[ComAdobeGraniteMonitoringImplScriptConfigImplInfo]
  implicit val ComAdobeGraniteMonitoringImplScriptConfigImplInfoDecoder: EntityDecoder[ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = jsonOf[ComAdobeGraniteMonitoringImplScriptConfigImplInfo]
  implicit val ComAdobeGraniteMonitoringImplScriptConfigImplInfoEncoder: EntityEncoder[ComAdobeGraniteMonitoringImplScriptConfigImplInfo] = jsonEncoderOf[ComAdobeGraniteMonitoringImplScriptConfigImplInfo]
}
