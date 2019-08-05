package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo._

case class ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSyncImplPublisherSyncServiceImplProperties])

object ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoCodecJson: CodecJson[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = CodecJson.derive[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo]
  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoDecoder: EntityDecoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = jsonOf[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo]
  implicit val ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfoEncoder: EntityEncoder[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo] = jsonEncoderOf[ComAdobeCqSocialSyncImplPublisherSyncServiceImplInfo]
}
