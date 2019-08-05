package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo._

case class ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoCodecJson: CodecJson[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo] = CodecJson.derive[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo]
  implicit val ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoDecoder: EntityDecoder[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo] = jsonOf[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo]
  implicit val ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfoEncoder: EntityEncoder[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo] = jsonEncoderOf[ComAdobeCqSocialEnablementServicesImplAuthorMarkerImplInfo]
}
