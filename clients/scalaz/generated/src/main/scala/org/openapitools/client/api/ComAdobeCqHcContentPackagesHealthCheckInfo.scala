package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqHcContentPackagesHealthCheckInfo._

case class ComAdobeCqHcContentPackagesHealthCheckInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqHcContentPackagesHealthCheckProperties])

object ComAdobeCqHcContentPackagesHealthCheckInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqHcContentPackagesHealthCheckInfoCodecJson: CodecJson[ComAdobeCqHcContentPackagesHealthCheckInfo] = CodecJson.derive[ComAdobeCqHcContentPackagesHealthCheckInfo]
  implicit val ComAdobeCqHcContentPackagesHealthCheckInfoDecoder: EntityDecoder[ComAdobeCqHcContentPackagesHealthCheckInfo] = jsonOf[ComAdobeCqHcContentPackagesHealthCheckInfo]
  implicit val ComAdobeCqHcContentPackagesHealthCheckInfoEncoder: EntityEncoder[ComAdobeCqHcContentPackagesHealthCheckInfo] = jsonEncoderOf[ComAdobeCqHcContentPackagesHealthCheckInfo]
}
