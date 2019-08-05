package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo._

case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties])

object ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo {
  import DateTimeCodecs._

  implicit val ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoCodecJson: CodecJson[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = CodecJson.derive[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo]
  implicit val ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoDecoder: EntityDecoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = jsonOf[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo]
  implicit val ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfoEncoder: EntityEncoder[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo] = jsonEncoderOf[ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupInfo]
}
