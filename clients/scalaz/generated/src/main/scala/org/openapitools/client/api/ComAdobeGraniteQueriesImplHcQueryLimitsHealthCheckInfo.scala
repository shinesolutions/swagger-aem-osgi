package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo._

case class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties])

object ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = jsonOf[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo]
  implicit val ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckInfo]
}
