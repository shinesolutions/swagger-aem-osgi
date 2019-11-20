package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo._

case class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties])

object OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo {
  import DateTimeCodecs._

  implicit val OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoCodecJson: CodecJson[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo] = CodecJson.derive[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo]
  implicit val OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoDecoder: EntityDecoder[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo] = jsonOf[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo]
  implicit val OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfoEncoder: EntityEncoder[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo] = jsonEncoderOf[OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoInfo]
}