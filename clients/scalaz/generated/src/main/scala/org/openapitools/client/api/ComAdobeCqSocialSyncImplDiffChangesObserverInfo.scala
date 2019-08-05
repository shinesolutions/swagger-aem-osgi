package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqSocialSyncImplDiffChangesObserverInfo._

case class ComAdobeCqSocialSyncImplDiffChangesObserverInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqSocialSyncImplDiffChangesObserverProperties])

object ComAdobeCqSocialSyncImplDiffChangesObserverInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqSocialSyncImplDiffChangesObserverInfoCodecJson: CodecJson[ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = CodecJson.derive[ComAdobeCqSocialSyncImplDiffChangesObserverInfo]
  implicit val ComAdobeCqSocialSyncImplDiffChangesObserverInfoDecoder: EntityDecoder[ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = jsonOf[ComAdobeCqSocialSyncImplDiffChangesObserverInfo]
  implicit val ComAdobeCqSocialSyncImplDiffChangesObserverInfoEncoder: EntityEncoder[ComAdobeCqSocialSyncImplDiffChangesObserverInfo] = jsonEncoderOf[ComAdobeCqSocialSyncImplDiffChangesObserverInfo]
}
