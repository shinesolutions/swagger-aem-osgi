package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeGraniteRepositoryServiceUserConfigurationInfo._

case class ComAdobeGraniteRepositoryServiceUserConfigurationInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeGraniteRepositoryServiceUserConfigurationProperties])

object ComAdobeGraniteRepositoryServiceUserConfigurationInfo {
  import DateTimeCodecs._

  implicit val ComAdobeGraniteRepositoryServiceUserConfigurationInfoCodecJson: CodecJson[ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = CodecJson.derive[ComAdobeGraniteRepositoryServiceUserConfigurationInfo]
  implicit val ComAdobeGraniteRepositoryServiceUserConfigurationInfoDecoder: EntityDecoder[ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = jsonOf[ComAdobeGraniteRepositoryServiceUserConfigurationInfo]
  implicit val ComAdobeGraniteRepositoryServiceUserConfigurationInfoEncoder: EntityEncoder[ComAdobeGraniteRepositoryServiceUserConfigurationInfo] = jsonEncoderOf[ComAdobeGraniteRepositoryServiceUserConfigurationInfo]
}
