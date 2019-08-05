package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo._

case class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties])

object ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = jsonOf[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckInfo]
}
