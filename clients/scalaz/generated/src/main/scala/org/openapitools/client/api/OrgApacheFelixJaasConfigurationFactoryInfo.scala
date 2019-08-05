package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime
import OrgApacheFelixJaasConfigurationFactoryInfo._

case class OrgApacheFelixJaasConfigurationFactoryInfo (
  pid: Option[String],
title: Option[String],
description: Option[String],
properties: Option[OrgApacheFelixJaasConfigurationFactoryProperties])

object OrgApacheFelixJaasConfigurationFactoryInfo {
  import DateTimeCodecs._

  implicit val OrgApacheFelixJaasConfigurationFactoryInfoCodecJson: CodecJson[OrgApacheFelixJaasConfigurationFactoryInfo] = CodecJson.derive[OrgApacheFelixJaasConfigurationFactoryInfo]
  implicit val OrgApacheFelixJaasConfigurationFactoryInfoDecoder: EntityDecoder[OrgApacheFelixJaasConfigurationFactoryInfo] = jsonOf[OrgApacheFelixJaasConfigurationFactoryInfo]
  implicit val OrgApacheFelixJaasConfigurationFactoryInfoEncoder: EntityEncoder[OrgApacheFelixJaasConfigurationFactoryInfo] = jsonEncoderOf[OrgApacheFelixJaasConfigurationFactoryInfo]
}
