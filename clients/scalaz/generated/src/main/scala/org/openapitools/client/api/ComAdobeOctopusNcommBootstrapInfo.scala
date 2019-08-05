package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeOctopusNcommBootstrapInfo._

case class ComAdobeOctopusNcommBootstrapInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeOctopusNcommBootstrapProperties])

object ComAdobeOctopusNcommBootstrapInfo {
  import DateTimeCodecs._

  implicit val ComAdobeOctopusNcommBootstrapInfoCodecJson: CodecJson[ComAdobeOctopusNcommBootstrapInfo] = CodecJson.derive[ComAdobeOctopusNcommBootstrapInfo]
  implicit val ComAdobeOctopusNcommBootstrapInfoDecoder: EntityDecoder[ComAdobeOctopusNcommBootstrapInfo] = jsonOf[ComAdobeOctopusNcommBootstrapInfo]
  implicit val ComAdobeOctopusNcommBootstrapInfoEncoder: EntityEncoder[ComAdobeOctopusNcommBootstrapInfo] = jsonEncoderOf[ComAdobeOctopusNcommBootstrapInfo]
}
