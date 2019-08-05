package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialNotificationsImplMentionsRouterInfo._

case class ComAdobeCqSocialNotificationsImplMentionsRouterInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialNotificationsImplMentionsRouterProperties])

object ComAdobeCqSocialNotificationsImplMentionsRouterInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialNotificationsImplMentionsRouterInfoCodecJson: CodecJson[ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = CodecJson.derive[ComAdobeCqSocialNotificationsImplMentionsRouterInfo]
  implicit val ComAdobeCqSocialNotificationsImplMentionsRouterInfoDecoder: EntityDecoder[ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = jsonOf[ComAdobeCqSocialNotificationsImplMentionsRouterInfo]
  implicit val ComAdobeCqSocialNotificationsImplMentionsRouterInfoEncoder: EntityEncoder[ComAdobeCqSocialNotificationsImplMentionsRouterInfo] = jsonEncoderOf[ComAdobeCqSocialNotificationsImplMentionsRouterInfo]
}
