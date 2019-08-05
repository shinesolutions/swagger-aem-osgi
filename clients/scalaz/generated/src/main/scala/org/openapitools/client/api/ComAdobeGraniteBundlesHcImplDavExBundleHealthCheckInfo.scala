package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo._

case class ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckProperties])

object ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoCodecJson: CodecJson[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo] = CodecJson.derive[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo]
  implicit val ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoDecoder: EntityDecoder[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo] = jsonOf[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo]
  implicit val ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfoEncoder: EntityEncoder[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo] = jsonEncoderOf[ComAdobeGraniteBundlesHcImplDavExBundleHealthCheckInfo]
}
