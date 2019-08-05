package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialUserImplTransportHttpToPublisherInfo._

case class ComAdobeCqSocialUserImplTransportHttpToPublisherInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialUserImplTransportHttpToPublisherProperties])

object ComAdobeCqSocialUserImplTransportHttpToPublisherInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialUserImplTransportHttpToPublisherInfoCodecJson: CodecJson[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo] = CodecJson.derive[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo]
  implicit val ComAdobeCqSocialUserImplTransportHttpToPublisherInfoDecoder: EntityDecoder[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo] = jsonOf[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo]
  implicit val ComAdobeCqSocialUserImplTransportHttpToPublisherInfoEncoder: EntityEncoder[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo] = jsonEncoderOf[ComAdobeCqSocialUserImplTransportHttpToPublisherInfo]
}
