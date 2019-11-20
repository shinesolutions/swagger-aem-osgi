package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo._

case class ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderProperties])

object ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoCodecJson: CodecJson[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = CodecJson.derive[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo]
  implicit val ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoDecoder: EntityDecoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = jsonOf[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo]
  implicit val ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfoEncoder: EntityEncoder[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo] = jsonEncoderOf[ComAdobeCqSocialCommonsEmailreplyImplMacmailEmailClientProviderInfo]
}