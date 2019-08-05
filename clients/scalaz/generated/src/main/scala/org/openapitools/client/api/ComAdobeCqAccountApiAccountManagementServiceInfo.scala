package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqAccountApiAccountManagementServiceInfo._

case class ComAdobeCqAccountApiAccountManagementServiceInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqAccountApiAccountManagementServiceProperties],
additionalProperties: Option[String],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqAccountApiAccountManagementServiceInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqAccountApiAccountManagementServiceInfoCodecJson: CodecJson[ComAdobeCqAccountApiAccountManagementServiceInfo] = CodecJson.derive[ComAdobeCqAccountApiAccountManagementServiceInfo]
  implicit val ComAdobeCqAccountApiAccountManagementServiceInfoDecoder: EntityDecoder[ComAdobeCqAccountApiAccountManagementServiceInfo] = jsonOf[ComAdobeCqAccountApiAccountManagementServiceInfo]
  implicit val ComAdobeCqAccountApiAccountManagementServiceInfoEncoder: EntityEncoder[ComAdobeCqAccountApiAccountManagementServiceInfo] = jsonEncoderOf[ComAdobeCqAccountApiAccountManagementServiceInfo]
}
