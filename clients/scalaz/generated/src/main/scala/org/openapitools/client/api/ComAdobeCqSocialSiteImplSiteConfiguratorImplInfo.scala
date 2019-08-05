package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo._

case class ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties])

object ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoCodecJson: CodecJson[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo] = CodecJson.derive[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo]
  implicit val ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoDecoder: EntityDecoder[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo] = jsonOf[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo]
  implicit val ComAdobeCqSocialSiteImplSiteConfiguratorImplInfoEncoder: EntityEncoder[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo] = jsonEncoderOf[ComAdobeCqSocialSiteImplSiteConfiguratorImplInfo]
}
