package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo._

case class ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckProperties])

object ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = jsonOf[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteQueriesImplHcLargeIndexHealthCheckInfo]
}
