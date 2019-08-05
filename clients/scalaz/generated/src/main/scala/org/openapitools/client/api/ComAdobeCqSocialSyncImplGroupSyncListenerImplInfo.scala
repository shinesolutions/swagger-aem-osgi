package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo._

case class ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties])

object ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSyncImplGroupSyncListenerImplInfoCodecJson: CodecJson[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo] = CodecJson.derive[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo]
  implicit val ComAdobeCqSocialSyncImplGroupSyncListenerImplInfoDecoder: EntityDecoder[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo] = jsonOf[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo]
  implicit val ComAdobeCqSocialSyncImplGroupSyncListenerImplInfoEncoder: EntityEncoder[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo] = jsonEncoderOf[ComAdobeCqSocialSyncImplGroupSyncListenerImplInfo]
}
