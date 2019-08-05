package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqScreensDeviceImplDeviceServiceInfo._

case class ComAdobeCqScreensDeviceImplDeviceServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqScreensDeviceImplDeviceServiceProperties])

object ComAdobeCqScreensDeviceImplDeviceServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqScreensDeviceImplDeviceServiceInfoCodecJson: CodecJson[ComAdobeCqScreensDeviceImplDeviceServiceInfo] = CodecJson.derive[ComAdobeCqScreensDeviceImplDeviceServiceInfo]
  implicit val ComAdobeCqScreensDeviceImplDeviceServiceInfoDecoder: EntityDecoder[ComAdobeCqScreensDeviceImplDeviceServiceInfo] = jsonOf[ComAdobeCqScreensDeviceImplDeviceServiceInfo]
  implicit val ComAdobeCqScreensDeviceImplDeviceServiceInfoEncoder: EntityEncoder[ComAdobeCqScreensDeviceImplDeviceServiceInfo] = jsonEncoderOf[ComAdobeCqScreensDeviceImplDeviceServiceInfo]
}
