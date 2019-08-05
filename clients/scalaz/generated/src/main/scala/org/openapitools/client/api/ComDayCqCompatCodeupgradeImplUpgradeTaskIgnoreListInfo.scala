package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo._

case class ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListProperties])

object ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo {
  import DateTimeCodecs._

  implicit val ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoCodecJson: CodecJson[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = CodecJson.derive[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo]
  implicit val ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoDecoder: EntityDecoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = jsonOf[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo]
  implicit val ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfoEncoder: EntityEncoder[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo] = jsonEncoderOf[ComDayCqCompatCodeupgradeImplUpgradeTaskIgnoreListInfo]
}
