package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixJaasConfigurationSpiInfo._

case class OrgApacheFelixJaasConfigurationSpiInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixJaasConfigurationSpiProperties],
bundleLocation: Option[String],
serviceLocation: Option[String])

object OrgApacheFelixJaasConfigurationSpiInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixJaasConfigurationSpiInfoCodecJson: CodecJson[OrgApacheFelixJaasConfigurationSpiInfo] = CodecJson.derive[OrgApacheFelixJaasConfigurationSpiInfo]
  implicit val OrgApacheFelixJaasConfigurationSpiInfoDecoder: EntityDecoder[OrgApacheFelixJaasConfigurationSpiInfo] = jsonOf[OrgApacheFelixJaasConfigurationSpiInfo]
  implicit val OrgApacheFelixJaasConfigurationSpiInfoEncoder: EntityEncoder[OrgApacheFelixJaasConfigurationSpiInfo] = jsonEncoderOf[OrgApacheFelixJaasConfigurationSpiInfo]
}
