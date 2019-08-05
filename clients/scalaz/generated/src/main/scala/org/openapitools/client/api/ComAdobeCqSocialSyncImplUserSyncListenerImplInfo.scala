package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSyncImplUserSyncListenerImplInfo._

case class ComAdobeCqSocialSyncImplUserSyncListenerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSyncImplUserSyncListenerImplProperties])

object ComAdobeCqSocialSyncImplUserSyncListenerImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSyncImplUserSyncListenerImplInfoCodecJson: CodecJson[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = CodecJson.derive[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo]
  implicit val ComAdobeCqSocialSyncImplUserSyncListenerImplInfoDecoder: EntityDecoder[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = jsonOf[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo]
  implicit val ComAdobeCqSocialSyncImplUserSyncListenerImplInfoEncoder: EntityEncoder[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo] = jsonEncoderOf[ComAdobeCqSocialSyncImplUserSyncListenerImplInfo]
}
