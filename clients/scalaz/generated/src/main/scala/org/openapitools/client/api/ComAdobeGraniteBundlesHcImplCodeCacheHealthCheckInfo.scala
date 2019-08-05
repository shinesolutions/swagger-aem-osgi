package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo._

case class ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckProperties])

object ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo]
  implicit val ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = jsonOf[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo]
  implicit val ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteBundlesHcImplCodeCacheHealthCheckInfo]
}
