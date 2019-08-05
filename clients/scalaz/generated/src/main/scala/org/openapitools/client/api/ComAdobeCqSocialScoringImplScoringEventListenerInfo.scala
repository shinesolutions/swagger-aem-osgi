package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialScoringImplScoringEventListenerInfo._

case class ComAdobeCqSocialScoringImplScoringEventListenerInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialScoringImplScoringEventListenerProperties])

object ComAdobeCqSocialScoringImplScoringEventListenerInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialScoringImplScoringEventListenerInfoCodecJson: CodecJson[ComAdobeCqSocialScoringImplScoringEventListenerInfo] = CodecJson.derive[ComAdobeCqSocialScoringImplScoringEventListenerInfo]
  implicit val ComAdobeCqSocialScoringImplScoringEventListenerInfoDecoder: EntityDecoder[ComAdobeCqSocialScoringImplScoringEventListenerInfo] = jsonOf[ComAdobeCqSocialScoringImplScoringEventListenerInfo]
  implicit val ComAdobeCqSocialScoringImplScoringEventListenerInfoEncoder: EntityEncoder[ComAdobeCqSocialScoringImplScoringEventListenerInfo] = jsonEncoderOf[ComAdobeCqSocialScoringImplScoringEventListenerInfo]
}
